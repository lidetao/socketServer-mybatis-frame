package com.lidetao.socket;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.quickserver.net.AppException;
import org.quickserver.net.server.DataMode;
import org.quickserver.net.server.DataType;
import org.quickserver.net.server.QuickServer;

/**
 * socket服务器
 * 
 * @author Administrator
 *
 */
public class SocketServer {

	private static Log log = LogFactory.getLog(SocketServer.class);

	/**
	 * socket服务配置信息
	 */
	private static String serverName = "Socket Server 1.0";
	private static String bindAddr = "0.0.0.0";
	private static Integer port = 7733;

	/**
	 * socket服务消息处理类
	 */
	private static String clientEventHandler = CommandHandler.class.getName();
	private static String clientBinaryHandler = CommandHandler.class.getName();
	private static String clientData = PoolableClientData.class.getName();

	/**
	 * socket服务
	 */
	private static QuickServer server = new QuickServer();

	public static void setServerName(String serverName) {
		SocketServer.serverName = serverName;
	}

	public static void setBindAddr(String bindAddr) {
		SocketServer.bindAddr = bindAddr;
	}

	public static void setPort(Integer port) {
		SocketServer.port = port;
	}

	/**
	 * socket服务初始化启动
	 */
	public static void init() {

		/**
		 * 设置服务基本信息
		 */
		try {
			server.setName(serverName);
			server.setBindAddr(bindAddr);
			server.setPort(port);
		} catch (Exception e) {
			log.warn(serverName + "基本信息配置异常", e);
		}

		/**
		 * 配置客户端数据处理类
		 */
		try {
			server.setClientEventHandler(clientEventHandler);
			server.setClientBinaryHandler(clientBinaryHandler);
			server.setClientData(clientData);
		} catch (Exception e) {
			log.warn(serverName + "客户端数据处理配置异常", e);
		}

		/**
		 * 设置输入输出项的数据类型
		 */
		try {
			server.setDefaultDataMode(DataMode.BINARY, DataType.IN);
			server.setDefaultDataMode(DataMode.BINARY, DataType.OUT);
		} catch (Exception e) {
			log.warn(serverName + "数据格式配置异常", e);
		}

		server.getBasicConfig().getServerMode().setBlocking(false);

		/**
		 * socket服务启动
		 */
		try {
			server.startServer();
		} catch (AppException e) {
			log.warn("socket服务启动异常", e);
		}

	}

	/**
	 * socket服务关闭
	 */
	public static void close() {
		if (server != null) {
			try {
				server.closeAllPools();
			} catch (Exception e) {
				log.warn("socket服务关闭异常", e);
			}
		}
	}

}
