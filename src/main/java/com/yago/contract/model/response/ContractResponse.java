package com.yago.contract.model.response;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.math.BigDecimal;
import java.util.UUID;

public class ContractResponse {

    @JsonProperty("id")
    private UUID id;

    @JsonProperty("value")
    private BigDecimal value;

    @JsonProperty("user")
    private UserResponse userResponse;

    public ContractResponse() {
    }

    public ContractResponse(UUID id, BigDecimal value, UserResponse userResponse) {
        this.id = id;
        this.value = value;
        this.userResponse = userResponse;
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public BigDecimal getValue() {
        return value;
    }

    public void setValue(BigDecimal value) {
        this.value = value;
    }

    public UserResponse getUserResponse() {
        return userResponse;
    }

    public void setUserResponse(UserResponse userResponse) {
        this.userResponse = userResponse;
    }
}
