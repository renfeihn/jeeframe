package com.renfeihn.jeeframe.modules.wechat.web;

import java.io.IOException;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.renfeihn.jeeframe.common.web.BaseController;

import io.github.elkan1788.mpsdk4j.core.WechatKernel;

/**
 * 
　* @ClassName: WeixinController
　* @Description: 说明：微信控制类
　* @author renfei
　* @date 2015年11月19日
 */
@Controller
@RequestMapping(value = "${frontPath}/my/weixin")
@SuppressWarnings("unchecked")
public class MyWeixinController extends BaseController{

	// 微信消息内核
	protected static WechatKernel _wk = new WechatKernel();
	
	/**
	 * 功能说明：get请求验证
	 * @param signature 微信加密签名，signature结合了开发者填写的token参数和请求中的timestamp参数、nonce参数。 
	 * @param timestamp 时间戳
	 * @param nonce 随机数 
	 * @param echostr 随机数 
	 * @return
	 */
	@RequestMapping(value = "", method = RequestMethod.GET)
	@ResponseBody
	public String get(HttpServletRequest request) {
		logger.info("=============================================== get start");
		_wk.setParams(request.getParameterMap());
		// 通过检验signature对请求进行校验，若校验成功则原样返回echostr，表示接入成功，否则接入失败  
        String echo = _wk.check();
        logger.info("=============================================== get end");
		return echo;
	}

	/**
	　* 功能说明：post请求验证
	　* @Title: post
	　* @param 参数：@param request
	　* @param 参数：@return
	　* @param 参数：@throws IOException
	　* @return 返回值：String
	　* @throws
	 */
	@RequestMapping(value = "", method = RequestMethod.POST)
	@ResponseBody
	public String post( HttpServletRequest request) throws IOException {
		logger.info("=============================================== post start");		
		_wk.setParams(request.getParameterMap());
        String respmsg = _wk.handle(request.getInputStream());
        logger.info("=============================================== post end");
		return respmsg;
	}
	
	
}
