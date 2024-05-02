package com.aws.soccer.schedule.repository;

import org.aspectj.lang.annotation.SuppressAjWarnings;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

@SuppressAjWarnings("hiding")
@Repository
public interface ScheduleJpqlRepository<Schedule> {
        @Query("SELECT new map((SELECT s.stadiumName FROM stadium s WHERE sc.stadiumId = s.stadiumId) as 경기장 ,sc.scheDate as 경기날짜) FROM schedule sc WHERE sc.scheDate LIKE '201205%'")
        List<Map<String,Object>> findStadiumNamesForMay();

}
