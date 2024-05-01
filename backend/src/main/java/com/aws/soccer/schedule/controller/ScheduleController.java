package com.aws.soccer.schedule.controller;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.aws.soccer.schedule.service.ScheduleService;
import com.aws.soccer.schedule.service.ScheduleServiceImpl;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;


@CrossOrigin(origins = "*", allowedHeaders = "*")
@RequiredArgsConstructor
@RequestMapping(path = "/api/schedule")
@RestController
public class ScheduleController {

    private final ScheduleServiceImpl scheduleService;

    @GetMapping("/maystadium")
    public List<String> mayStadium(){
        return scheduleService.mayStadium();
    }

    

    
    
}
