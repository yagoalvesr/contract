package com.yago.contract.controller;

import com.yago.contract.exception.ContractException;
import com.yago.contract.model.request.UserRequest;
import com.yago.contract.model.response.UserResponse;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RequestMapping("/api/v1/users")
public interface UserController {

    @GetMapping
    ResponseEntity<List<UserResponse>> findUsers();

    @GetMapping("/{id}")
    ResponseEntity<UserResponse> findById(@PathVariable UUID id) throws ContractException;

    @PostMapping
    ResponseEntity<String> save(@RequestBody UserRequest userRequest) throws ContractException;
}
