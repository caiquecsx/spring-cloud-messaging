package com.caiquecsx.springcloudstreammessaging;

import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.messaging.Source;
import org.springframework.integration.annotation.InboundChannelAdapter;

@EnableBinding(Source.class)
public class MyProducer {
	private String defaultMessage = "Hello, Spring Cloud Stream";
	
	@InboundChannelAdapter(Source.OUTPUT)
	public String sendDefaultMessage() {
		System.out.println(defaultMessage);
		return defaultMessage;
	}
}
