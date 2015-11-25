package com.renfeihn.jeeframe.modules.websocket;

import java.util.Map;

import javax.servlet.http.HttpSession;

import org.springframework.http.server.ServerHttpRequest;
import org.springframework.http.server.ServerHttpResponse;
import org.springframework.http.server.ServletServerHttpRequest;
import org.springframework.web.socket.WebSocketHandler;
import org.springframework.web.socket.server.support.HttpSessionHandshakeInterceptor;

import com.renfeihn.jeeframe.modules.sys.security.SystemAuthorizingRealm.Principal;
import com.renfeihn.jeeframe.modules.sys.utils.UserUtils;


public class ChatHandshakeInterceptor extends HttpSessionHandshakeInterceptor {

	
	@Override
	public boolean beforeHandshake(ServerHttpRequest request, ServerHttpResponse response, WebSocketHandler wsHandler, Map<String, Object> attributes) throws Exception {
		System.out.println("Before Handshake");
		if (request instanceof ServletServerHttpRequest) {
            ServletServerHttpRequest servletRequest = (ServletServerHttpRequest) request;
            HttpSession session = servletRequest.getServletRequest().getSession(false);
            if (session != null) {
                //使用userName区分WebSocketHandler，以便定向发送消息
                
                Principal principal = UserUtils.getPrincipal();
                
                String userName = principal.getLoginName();
                
                if (userName==null) {
                	userName="default-system";
                }
                
                attributes.put("websocket_username",userName);
            }
        }
        return super.beforeHandshake(request, response, wsHandler, attributes);
	}

	@Override
	public void afterHandshake(ServerHttpRequest request, ServerHttpResponse response, WebSocketHandler wsHandler, Exception ex) {
		System.out.println("After Handshake");
		super.afterHandshake(request, response, wsHandler, ex);
	}
}
