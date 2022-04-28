package com.yago.contract.messaging.channels;

import org.springframework.cloud.stream.annotation.Input;
import org.springframework.messaging.MessageChannel;

public interface MessagingChannels {
    public static final String CONTRACT_SERVICE_USER_CREATE_INPUT = "contract-service-user-create-input";

    @Input(CONTRACT_SERVICE_USER_CREATE_INPUT)
    MessageChannel consumeContractServiceUserCreate();
}
