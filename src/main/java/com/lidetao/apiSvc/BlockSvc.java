package com.lidetao.apiSvc;

import com.lidetao.service.WikiBlockService;
import com.lidetao.socket.MsgHandlerUtil.ResponseMsg;

/**
 * block的接口操作
 * 
 * @author Administrator
 *
 */
public class BlockSvc implements ISvc {

	@Override
	public ResponseMsg action(String actCode, String reqParam) {

		ResponseMsg resp = new ResponseMsg();

		switch (actCode) {
		case "deleteBlock":
			Boolean isOk = WikiBlockService.deleteBlock(Integer
					.parseInt(reqParam));
			if (isOk != null && isOk) {
				resp.setOk(true);
				resp.setRespParam("success");
			} else {
				resp.setOk(false);
				resp.setRespParam("error");
			}
			break;
		case "2":
			break;
		default:
			resp.setOk(false);
			resp.setRespParam("操作码未定义：" + actCode);
			break;
		}

		return resp;
	}
}
