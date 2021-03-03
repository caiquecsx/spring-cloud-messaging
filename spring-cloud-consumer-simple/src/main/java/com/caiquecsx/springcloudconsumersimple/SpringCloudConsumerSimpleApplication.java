package com.caiquecsx.springcloudconsumersimple;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.annotation.StreamListener;

@SpringBootApplication
@EnableBinding(ContractSink.class)
public class SpringCloudConsumerSimpleApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringCloudConsumerSimpleApplication.class, args);
	}
	
	@StreamListener(ContractSink.INPUT)
	public void readMessage(String message) {
		System.out.println("Received > " + message);
	}

}
