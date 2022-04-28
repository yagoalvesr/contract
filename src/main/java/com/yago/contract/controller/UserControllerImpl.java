package com.yago.contract.controller;

import com.yago.contract.exception.ContractException;
import com.yago.contract.model.request.UserRequest;
import com.yago.contract.model.response.UserResponse;
import com.yago.contract.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.UUID;

@RestController
public class UserControllerImpl implements UserController {

    @Autowired
    private UserService userService;

    @Override
    public ResponseEntity<List<UserResponse>> findUsers() {
        return ResponseEntity.ok().body(userService.findUsers());
    }

    @Override
    public ResponseEntity<UserResponse> findById(UUID id) throws ContractException {
        return ResponseEntity.ok().body(userService.findById(id));
    }

    @Override
    public ResponseEntity<String> save(UserRequest userRequest) throws ContractException {
        userService.save(userRequest);
        return ResponseEntity.ok().body("User saved with success");
    }
}
