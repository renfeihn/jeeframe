package com.renfeihn.jeeframe.modules.websocket;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
import org.springframework.web.socket.WebSocketHandler;
import org.springframework.web.socket.config.annotation.EnableWebSocket;
import org.springframework.web.socket.config.annotation.WebSocketConfigurer;
import org.springframework.web.socket.config.annotation.WebSocketHandlerRegistry;

@Configuration
@EnableWebMvc
@EnableWebSocket
public class WebSocketConfig extends WebMvcConfigurerAdapter implements WebSocketConfigurer {

	@Bean
	public WebSocketHandler chatMessageHandler() {
		return new ChatMessageHandler();
	}
	
	@Override
	public void registerWebSocketHandlers(WebSocketHandlerRegistry registry) {
		registry.addHandler(chatMessageHandler(), "/websocket/chatMessageServer.do")
				.addInterceptors(new ChatHandshakeInterceptor());
		registry.addHandler(chatMessageHandler(), "/websocket/sockjs/chatMessageServer.do")
				.addInterceptors(new ChatHandshakeInterceptor()).withSockJS();

	}

}