package com.aws.soccer.schedule.controller;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.aws.soccer.schedule.service.ScheduleService;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;


@CrossOrigin(origins = "*",allowedHeaders = "*")
@RestController
@RequestMapping(path = "/api/schedule")
@RequiredArgsConstructor
@Slf4j
public class ScheduleController {

    private ScheduleService scheduleService;

    // @GetMapping("/")
    //  public ResponseEntity<List<String>> getStadiumNamesByDateRange(
    //     @RequestParam String startDate,
    //     @RequestParam String endDate) {
    //     List<String> stadiumNames = scheduleService.findStadiumNamesByDateRange(startDate, endDate);
    //     return ResponseEntity.ok(stadiumNames);
    // }


    

    
    
}
