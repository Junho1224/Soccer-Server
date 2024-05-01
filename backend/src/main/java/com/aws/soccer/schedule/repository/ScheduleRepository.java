package com.aws.soccer.schedule.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.aws.soccer.schedule.model.Schedule;

@Repository
public interface ScheduleRepository extends JpaRepository<Schedule, Long> {

    @Query("SELECT (SELECT s.stadiumName FROM stadium s WHERE sc.stadiumId = s.stadiumId) as 경기장 ,sc.scheDate as 경기날짜 FROM schedule sc WHERE sc.scheDate LIKE '201205%'")
    List<String> findStadiumNamesForMay();




    
} 