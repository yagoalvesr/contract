package com.yago.contract.messaging;

import com.yago.contract.exception.ContractException;
import com.yago.contract.model.request.UserRequest;
import com.yago.contract.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Service;

import static com.yago.contract.messaging.channels.MessagingChannels.CONTRACT_SERVICE_USER_CREATE_INPUT;


@Service
public class UserListener {

    @Autowired
    private UserService userService;

    @StreamListener(CONTRACT_SERVICE_USER_CREATE_INPUT)
    void consumeCreateUser(@Payload UserRequest userRequest){
        try {
            userService.save(userRequest);
        } catch (ContractException e) {
            e.printStackTrace();
        }
    }

}
