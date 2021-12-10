package com.hackathon.backend.model.entity;

import com.hackathon.backend.model.valueobject.LoanMethod;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import java.io.Serializable;

@Entity
@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Loan implements Serializable {

    @Id
    @GeneratedValue
    private Integer id;
    private Double amount;
    private boolean accepted;
    private LoanMethod loanMethod;
    @ManyToOne
    private User user;

}
