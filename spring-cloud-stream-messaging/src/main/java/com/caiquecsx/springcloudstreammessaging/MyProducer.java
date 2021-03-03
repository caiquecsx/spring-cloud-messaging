package com.caiquecsx.springcloudstreammessaging;

import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.messaging.Source;
import org.springframework.integration.annotation.InboundChannelAdapter;

@EnableBinding(ContractSource.class)
public class MyProducer {
	private String defaultMessage = "Sending message on new channel";
	
	@InboundChannelAdapter(ContractSource.OUTPUT)
	public String sendDefaultMessage() {
		System.out.println(defaultMessage);
		return defaultMessage;
	}
}
