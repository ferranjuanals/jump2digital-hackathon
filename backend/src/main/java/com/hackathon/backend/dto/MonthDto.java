package com.hackathon.backend.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class MonthDto {

    private String nameUUID;
    private Integer totalUsers;
    private Integer totalNewUsers;
    private Integer totalUniqueUsers;
    private Double totalRequestedMoney;
    private Double perUserRequestedMoney;
    private Integer acceptedRequestPaid;
    private Integer acceptedRequestUnpaid;
    private String loanReturnTime;
    private Double realBudget;
    private Double predictedBudget;

}
