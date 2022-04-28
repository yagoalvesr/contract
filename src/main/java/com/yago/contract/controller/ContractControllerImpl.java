package com.yago.contract.controller;

import com.yago.contract.model.entity.Contract;
import com.yago.contract.service.ContractService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.UUID;

@RestController
public class ContractControllerImpl implements ContractController{

    @Autowired
    private ContractService contractService;

    @Override
    public List<Contract> findContracts() {
        return null;
    }

    @Override
    public Contract findById(UUID id) {
        return null;
    }

    @Override
    public Contract save() {
        return null;
    }
}
