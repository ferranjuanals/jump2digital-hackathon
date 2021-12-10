package com.hackathon.backend.dto;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class MonthReturnDto {

    private Integer id;
    private String name;
    private Integer acceptedRequest;
    private String loanReturnTime;
    private Double budget;
    private Integer totalNewUsers;
    private Double totalRequestedMoney;

}
