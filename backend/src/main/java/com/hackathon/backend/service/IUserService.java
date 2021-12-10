package com.hackathon.backend.service;

import com.hackathon.backend.dto.LoanDto;
import com.hackathon.backend.dto.UserDto;
import com.hackathon.backend.model.entity.Loan;
import com.hackathon.backend.model.entity.User;

import java.util.HashMap;

public interface IUserService {

    User createUser(UserDto userDto);

    HashMap<Loan, String> requestLoan(LoanDto loanDto) throws Exception;

}
