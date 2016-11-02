package com.renfeihn.jeeframe.modules.websocket;

import org.springframework.context.annotation.Bean;
import org.springframework.web.socket.TextMessage;

public class TestNotify {

	
	
	@Bean
    public ChatMessageHandler systemWebSocketHandler() {
        return new ChatMessageHandler();
    }
	
	
	public void test() {
		systemWebSocketHandler().sendMessageToUsers(new TextMessage("公告：请注意，测试！"));
	}
}
