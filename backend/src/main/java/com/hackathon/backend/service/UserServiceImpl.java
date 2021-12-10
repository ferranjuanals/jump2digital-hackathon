package com.hackathon.backend.service;

import com.hackathon.backend.dto.LoanDto;
import com.hackathon.backend.dto.UserDto;
import com.hackathon.backend.model.entity.Loan;
import com.hackathon.backend.model.entity.User;
import com.hackathon.backend.model.valueobject.LoanMethod;
import com.hackathon.backend.repository.IUserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.HashMap;

@Service
public class UserServiceImpl implements IUserService {

    @Autowired
    IUserRepository userRepository;

    @Override
    public User createUser(UserDto userDto) {
        User user = User.builder()
                .dni(userDto.getDni())
                .name(userDto.getName())
                .account(userDto.getAccount())
                .registrationDate(LocalDateTime.now())
                .build();
        return userRepository.save(user);
    }

    @Override
    public HashMap<Loan, String> requestLoan(LoanDto loanDto) throws Exception {
        User user = userRepository.getById(loanDto.getUserId());
        Loan loan = Loan.builder()
                .user(user)
                .amount(loanDto.getAmount())
                .loanMethod(LoanMethod.getMethod(loanDto.getLoanMethod()))
                .accepted(true)
                .build();
        return isLoanAccepted(loan);
    }

    private HashMap<Loan, String> isLoanAccepted(Loan loan) {
        HashMap<Loan, String> hashMap = new HashMap<>();
        if(loan.isAccepted()) hashMap.put(loan, "Loan accepted");
        if(!loan.isAccepted()) hashMap.put(loan, "Loan not accepted");
        return hashMap;
    }

}
