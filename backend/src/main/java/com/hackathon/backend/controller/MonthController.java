package com.hackathon.backend.controller;

import com.hackathon.backend.dto.MonthDto;
import com.hackathon.backend.dto.MonthReturnDto;
import com.hackathon.backend.model.entity.Month;
import com.hackathon.backend.service.IMonthService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/month")
public class MonthController {

    @Autowired
    IMonthService monthService;

    @PostMapping("/batch")
    void saveBatchMonths(@RequestBody List<MonthDto> months) {
        monthService.saveBatchMonths(months);
    }

    @PostMapping
    Month saveMonth(@RequestBody MonthDto monthDto) {
        return monthService.saveMonth(monthDto);
    }

    @GetMapping
    List<MonthReturnDto> getMonths() {
        return monthService.getMonths();
    }

    @PutMapping()
    Month updateMonth(@PathVariable Integer id, @RequestBody MonthDto monthDto) {
        return monthService.updateMonth(id, monthDto);
    }

    @DeleteMapping
    void deleteMonth(@PathVariable Integer id) {
        monthService.deleteMonthById(id);
    }

}
