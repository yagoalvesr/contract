package com.yago.contract.service;

import com.yago.contract.model.entity.Contract;
import com.yago.contract.repository.ContractRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class ContractServiceImpl implements ContractService{

    @Autowired
    private ContractRepository contractRepository;

    @Override
    public List<Contract> findContracts() {
        return null;
    }

    @Override
    public Contract findById(UUID id) {
        return null;
    }

    @Override
    public void save() {
    }
}
