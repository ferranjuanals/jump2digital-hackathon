package com.hackathon.backend.service;

import com.hackathon.backend.dto.MonthDto;
import com.hackathon.backend.dto.MonthReturnDto;
import com.hackathon.backend.model.entity.Month;
import com.hackathon.backend.repository.IMonthRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class MonthServiceImpl implements IMonthService{

    @Autowired
    IMonthRepository monthRepository;

    @Override
    public List<MonthReturnDto> getMonths() {
        return monthRepository.findAll().stream().map(month -> mapMonthToReturnDto(month)).collect(Collectors.toList());
    }

    private MonthReturnDto mapMonthToReturnDto(Month month) {
        MonthReturnDto monthReturnDto = MonthReturnDto.builder()
                .id(month.getId())
                .name(month.getNameUUID())
                .acceptedRequest(month.getAcceptedRequestPaid() + month.getAcceptedRequestUnpaid())
                .loanReturnTime(month.getLoanReturnTime())
                .budget(month.getRealBudget())
                .totalNewUsers(month.getTotalNewUsers())
                .totalRequestedMoney(month.getTotalRequestedMoney())
                .build();
        return monthReturnDto;
    }

    @Override
    public Month saveMonth(MonthDto monthDto) {

        Month month = Month.builder()
                .nameUUID(monthDto.getNameUUID())
                .totalUsers(monthDto.getTotalUsers())
                .totalNewUsers(monthDto.getTotalNewUsers())
                .totalUniqueUsers(monthDto.getTotalUniqueUsers())
                .totalRequestedMoney(monthDto.getTotalRequestedMoney())
                .perUserRequestedMoney(monthDto.getPerUserRequestedMoney())
                .acceptedRequestPaid(monthDto.getAcceptedRequestPaid())
                .acceptedRequestUnpaid(monthDto.getAcceptedRequestUnpaid())
                .loanReturnTime(monthDto.getLoanReturnTime())
                .realBudget(monthDto.getRealBudget())
                .predictedBudget(monthDto.getPredictedBudget())
                .build();
        monthRepository.save(month);
        return month;
    }

    @Override
    public Month updateMonth(Integer id, MonthDto monthDto) {
        Month month = monthRepository.getById(id);
        if(monthDto.getNameUUID() != null || !monthDto.getNameUUID().isBlank()) month.setNameUUID(monthDto.getNameUUID());
        if(monthDto.getTotalUsers() != null) month.setTotalUsers(monthDto.getTotalUsers());
        if(monthDto.getTotalNewUsers() != null) month.setTotalNewUsers(monthDto.getTotalNewUsers());
        if(monthDto.getTotalUniqueUsers() != null) month.setTotalUniqueUsers(monthDto.getTotalUniqueUsers());
        if(monthDto.getTotalRequestedMoney() != null) month.setTotalRequestedMoney(monthDto.getTotalRequestedMoney());
        if(monthDto.getPerUserRequestedMoney() != null) month.setPerUserRequestedMoney(monthDto.getPerUserRequestedMoney());
        if(monthDto.getAcceptedRequestPaid() != null) month.setAcceptedRequestPaid(monthDto.getAcceptedRequestPaid());
        if(monthDto.getAcceptedRequestUnpaid() != null) month.setAcceptedRequestUnpaid(monthDto.getAcceptedRequestUnpaid());
        if(monthDto.getLoanReturnTime() != null || !monthDto.getLoanReturnTime().isBlank()) month.setLoanReturnTime(monthDto.getLoanReturnTime());
        if(monthDto.getRealBudget() != null) month.setRealBudget(monthDto.getRealBudget());
        if(monthDto.getPredictedBudget() != null) month.setPredictedBudget(monthDto.getPredictedBudget());
        return month;
    }

    @Override
    public void deleteMonthById(Integer id) {
        monthRepository.deleteById(id);
    }

    @Override
    public void saveBatchMonths(List<MonthDto> months) {
        months.stream().forEach(x -> saveMonth(x));
    }
}
