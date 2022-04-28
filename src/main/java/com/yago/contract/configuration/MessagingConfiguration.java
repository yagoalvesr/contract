package com.yago.contract.configuration;

import com.yago.contract.messaging.channels.MessagingChannels;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableBinding(value = MessagingChannels.class)
public class MessagingConfiguration {
}
