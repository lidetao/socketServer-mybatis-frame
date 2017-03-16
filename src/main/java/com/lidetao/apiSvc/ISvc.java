package com.lidetao.apiSvc;

import com.lidetao.socket.MsgHandlerUtil.ResponseMsg;

/**
 * 业务接口
 * 
 * @author Administrator
 *
 */
public interface ISvc {
	/**
	 * 执行业务接口调用
	 * 
	 * @param actCode
	 * @param reqParam
	 * @return
	 */
	ResponseMsg action(String actCode, String reqParam);
}
