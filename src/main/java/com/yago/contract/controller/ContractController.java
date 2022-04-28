package com.yago.contract.controller;

import com.yago.contract.model.entity.Contract;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;
import java.util.UUID;

@RequestMapping("/api/v1/contracts")
public interface ContractController {

    @GetMapping
    public List<Contract> findContracts();

    @GetMapping("/{id}")
    public Contract findById(UUID id);

    @PostMapping
    public Contract save();
}
