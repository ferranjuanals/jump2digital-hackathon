package com.hackathon.backend.service;

import com.hackathon.backend.dto.MonthDto;
import com.hackathon.backend.dto.MonthReturnDto;
import com.hackathon.backend.model.entity.Month;

import java.util.List;

public interface IMonthService {

    List<MonthReturnDto> getMonths();

    Month saveMonth(MonthDto monthDto);

    Month updateMonth(Integer id, MonthDto monthDto);

    void deleteMonthById(Integer id);

    void saveBatchMonths(List<MonthDto> months);
}
