package com.hackathon.backend.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class LoanDto {

    private Integer userId;
    private Double amount;
    private String loanMethod;

}
