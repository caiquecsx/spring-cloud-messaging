package com.caiquecsx.springcloudstreammessaging;

import org.springframework.cloud.stream.annotation.Output;
import org.springframework.messaging.MessageChannel;

public interface ContractSource {

    String OUTPUT = "contract-output";

    @Output(OUTPUT)
    MessageChannel output();
}
