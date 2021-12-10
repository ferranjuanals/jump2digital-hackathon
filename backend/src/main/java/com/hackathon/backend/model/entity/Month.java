package com.hackathon.backend.model.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.io.Serializable;

@Entity
@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Month implements Serializable {

    @Id
    @GeneratedValue
    private Integer id;
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
