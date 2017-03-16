package com.lidetao.socket;

import java.io.IOException;
import java.net.SocketTimeoutException;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.quickserver.net.server.ClientBinaryHandler;
import org.quickserver.net.server.ClientEventHandler;
import org.quickserver.net.server.ClientHandler;

import com.lidetao.socket.MsgHandlerUtil.RequestMsg;
import com.lidetao.socket.MsgHandlerUtil.ResponseMsg;

/**
 * 指令型消息处理：同步处理机制
 * 
 * @author Administrator
 *
 */
public class CommandHandler implements ClientEventHandler, ClientBinaryHandler {

	/**
	 * 日志
	 */
	static private final Log log = LogFactory.getLog(CommandHandler.class);
	static final private boolean dbg = log.isDebugEnabled();

	/**
	 * 获取二进制信息<br>
	 * 消息为utf-8编码字符串转化的二进制消息；<br>
	 * 请求消息格式为：{id}|{svcName}|{actCode}|{reqParam}。<br>
	 * 如：12|BlockSvc|delteBlock|1 或者 12|BlockSvc|delteBlock|{"id":1}<br>
	 * 响应参数格式为：{id}|{ok}|{respParam}.<br>
	 * 如：12|1|成功 或者 12|0|失败 或者 12|1|{"id":1}
	 */
	@Override
	public void handleBinary(ClientHandler handler, byte[] command)
			throws SocketTimeoutException, IOException {

		// 获取消息
		String clientAddr = handler.getHostAddress();
		String request = new String(command, "UTF-8");

		if (dbg) {
			log.debug(clientAddr + ":" + request);
		}

		// 解析请求参数
		RequestMsg req = null;
		try {
			req = MsgHandlerUtil.checkMsgFormat(request);
		} catch (MsgHandleException e) {
			log.warn("请求参数解析异常", e);
		}

		if (req == null) {
			// 返回请求异常
			handler.sendClientBinary("error-request".getBytes("UTF-8"));
			// 关闭连接，否则前端收不到消息
			handler.closeConnection();
		}

		/**
		 * 调用业务接口
		 */
		ResponseMsg resp = MsgHandlerUtil.callSvc(req);

		if (resp == null) {
			// 返回处理异常
			handler.sendClientBinary("error-response".getBytes("UTF-8"));
			// 关闭连接，否则前端收不到消息
			handler.closeConnection();
		}

		// 返回结果构建
		StringBuilder sb = new StringBuilder();
		sb.append(req.getId()).append("|");
		sb.append(resp.getOk() ? 1 : 0).append("|");
		sb.append(resp.getRespParam() == null ? "" : resp.getRespParam());

		String response = sb.toString();

		if (dbg) {
			log.debug(clientAddr + ":" + response);
		}

		// 回复
		handler.sendClientBinary(response.getBytes("UTF-8"));

		// 关闭连接，否则前端收不到消息
		handler.closeConnection();

	}

	/**
	 * 建立连接
	 */
	@Override
	public void gotConnected(ClientHandler handler)
			throws SocketTimeoutException, IOException {

		String clientAddr = handler.getHostAddress();
		log.info("Connection opened(建立连接): " + clientAddr);

	}

	/**
	 * 客户端断开连接
	 */
	@Override
	public void lostConnection(ClientHandler handler) throws IOException {

		String clientAddr = handler.getHostAddress();
		log.info("Connection lost(客户端断开连接或网络故障): " + clientAddr);

	}

	/**
	 * 服务端断开连接
	 */
	@Override
	public void closingConnection(ClientHandler handler) throws IOException {

		String clientAddr = handler.getHostAddress();
		log.info("Connection closed(服务器断开连接): " + clientAddr);

	}
}
