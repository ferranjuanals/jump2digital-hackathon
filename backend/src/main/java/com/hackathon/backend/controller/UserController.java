package com.hackathon.backend.controller;

import com.hackathon.backend.dto.LoanDto;
import com.hackathon.backend.dto.UserDto;
import com.hackathon.backend.model.entity.Loan;
import com.hackathon.backend.model.entity.User;
import com.hackathon.backend.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    IUserService userService;

    @PostMapping
    public User createUser(@RequestBody UserDto userDto) {
        return userService.createUser(userDto);
    }

    @PostMapping("/loan")
    public HashMap<Loan, String> requestLoan(@RequestBody LoanDto loanDto) throws Exception {
        return userService.requestLoan(loanDto);
    }
}
