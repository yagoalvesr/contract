package com.yago.contract.service;

import com.yago.contract.model.entity.Contract;

import java.util.List;
import java.util.UUID;

public interface ContractService {
    List<Contract> findContracts();

    Contract findById(UUID id);

    void save();
}
