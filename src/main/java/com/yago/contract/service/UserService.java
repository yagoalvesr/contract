package com.yago.contract.service;

import com.yago.contract.exception.ContractException;
import com.yago.contract.model.request.UserRequest;
import com.yago.contract.model.response.UserResponse;

import java.util.List;
import java.util.UUID;

public interface UserService {
    List<UserResponse> findUsers();

    UserResponse findById(UUID id) throws ContractException;

    void save(UserRequest userRequest) throws ContractException;
}
