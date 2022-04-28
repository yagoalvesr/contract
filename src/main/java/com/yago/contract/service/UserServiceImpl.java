package com.yago.contract.service;

import com.yago.contract.exception.ContractException;
import com.yago.contract.mapper.UserMapper;
import com.yago.contract.model.entity.User;
import com.yago.contract.model.request.UserRequest;
import com.yago.contract.model.response.UserResponse;
import com.yago.contract.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private UserMapper userMapper;

    @Override
    public List<UserResponse> findUsers() {
        return userRepository.findAll().stream().map(user -> userMapper.toResponse(user)).collect(Collectors.toList());
    }

    @Override
    public UserResponse findById(UUID id) throws ContractException {
        User user = userRepository.findById(id).orElseThrow(() -> new ContractException("No user found for this id: " + id));
        return userMapper.toResponse(user);
    }

    @Override
    public void save(UserRequest userRequest) throws ContractException {
        try {
            userRepository.save(new User(UUID.randomUUID(), userRequest.getName(), userRequest.getEmail()));
        } catch (Exception e) {
            throw new ContractException("It was not possible to save this User: " + e.getMessage());
        }
    }
}
