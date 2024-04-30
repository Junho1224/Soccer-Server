package com.aws.soccer.schedule.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.aws.soccer.schedule.repository.ScheduleRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class ScheduleServiceImpl implements ScheduleService{

    private final ScheduleRepository repository;

    // @Override
    // public List<String> findStadiumNamesByDateRange(String startDate, String endDate) {
    // return repository.findStadiumNamesByDateRange("20120501", "20120531");
       
    
}
