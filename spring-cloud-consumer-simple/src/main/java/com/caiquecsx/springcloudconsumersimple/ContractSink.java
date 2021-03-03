package com.caiquecsx.springcloudconsumersimple;

import org.springframework.cloud.stream.annotation.Input;
import org.springframework.messaging.MessageChannel;

public interface ContractSink {

    String INPUT = "contract-input";

    @Input(INPUT)
    MessageChannel input();
}
