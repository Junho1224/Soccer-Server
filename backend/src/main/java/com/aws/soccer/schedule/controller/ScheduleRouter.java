package com.aws.soccer.schedule.controller;

import lombok.RequiredArgsConstructor;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Component;

import com.aws.soccer.schedule.repository.ScheduleRepository;

@Component
@RequiredArgsConstructor
public class ScheduleRouter {

    
    private final ScheduleRepository repository;

    @SuppressWarnings("unchecked")
    public List<Map<String,Object>> excute(String q){
        
        return switch (q){
            case "1"-> repository.findStadiumNamesForMay();
            default -> null;
        };

    }



    
}
