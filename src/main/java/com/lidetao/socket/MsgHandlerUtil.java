package com.lidetao.socket;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import com.lidetao.apiSvc.ISvc;

/**
 * socket消息处理工具
 * 
 * @author Administrator
 *
 */
public class MsgHandlerUtil {

	/**
	 * svc类包路径
	 */
	private static final String PACKAGEPATH = "com.lidetao.apiSvc";

	private static final Log log = LogFactory.getLog(MsgHandlerUtil.class);

	/**
	 * 解析请求参数
	 * 
	 * @param request
	 * @return
	 * @throws MsgHandleException
	 */
	static RequestMsg checkMsgFormat(String request) throws MsgHandleException {

		// 请求参数拆分
		String[] reqStr = request.split("\\|");
		if (reqStr.length < 4) {
			throw new MsgHandleException("请求参数解析异常");
		}

		return new RequestMsg(Long.valueOf(reqStr[0]), reqStr[1], reqStr[2],
				reqStr[3]);

	}

	/**
	 * 调用业务接口
	 * 
	 * @param req
	 * @return
	 */
	static ResponseMsg callSvc(RequestMsg req) {

		ISvc svc = null;
		try {
			Class<?> cls = Class.forName(PACKAGEPATH + "." + req.getSvcName());
			svc = (ISvc) cls.newInstance();
		} catch (ClassNotFoundException | InstantiationException
				| IllegalAccessException e) {
			log.warn("svc实例化异常:" + e.getMessage());
		}

		if (svc == null) {
			ResponseMsg resp = new ResponseMsg();
			resp.ok = false;
			resp.respParam = "svc实例化异常:" + req.getSvcName();
			return resp;
		}

		return svc.action(req.getActCode(), req.getReqParam());
	}

	/**
	 * 请求参数
	 * 
	 * @author Administrator
	 *
	 */
	static class RequestMsg {

		private Long id;// 消息编号
		private String svcName;// 接口服务名
		private String actCode;// 操作码
		private String reqParam;// 业务参数

		RequestMsg(Long id, String svcName, String actCode, String reqParam) {
			this.id = id;
			this.svcName = svcName;
			this.actCode = actCode;
			this.reqParam = reqParam;
		}

		public Long getId() {
			return id;
		}

		public String getSvcName() {
			return svcName;
		}

		public String getActCode() {
			return actCode;
		}

		public String getReqParam() {
			return reqParam;
		}

	}

	/**
	 * 接口响应参数
	 * 
	 * @author Administrator
	 *
	 */
	public static class ResponseMsg {

		private boolean ok;// 业务处理是否成功
		private String respParam;// 业务响应参数

		public boolean getOk() {
			return ok;
		}

		public void setOk(boolean ok) {
			this.ok = ok;
		}

		public String getRespParam() {
			return respParam;
		}

		public void setRespParam(String respParam) {
			this.respParam = respParam;
		}

	}

}
