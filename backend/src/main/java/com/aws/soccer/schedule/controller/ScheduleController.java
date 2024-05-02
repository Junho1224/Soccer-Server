package com.aws.soccer.schedule.controller;

import java.util.*;
import java.util.Map;

import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import java.util.Map;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import org.springframework.web.bind.annotation.RequestParam;

@Log4j2
@CrossOrigin(origins = "*")
@RestController
@RequiredArgsConstructor
@RequestMapping(path = "/api/schedule")
@ApiResponses(value = {
        @ApiResponse(responseCode = "400", description = "Invalid ID supplied"),
        @ApiResponse(responseCode = "404", description = "dd") })
public class ScheduleController {

    private final ScheduleRouter router;
    // private final ScheduleService playerService;

    @GetMapping("/search")
    public ResponseEntity<List<Map<String, Object>>> searchSchedule( // DTO대신 Map
            @RequestParam(value = "q", required = true) String q,
            @RequestParam(value = "stadiumId", required = false) String stadiumId,
            @RequestParam(value = "scheDate", required = false) String scheDate,
            @RequestParam(value = "gubun", required = false) String gubun) {
        log.info("Controller search Player q is {}", q);

        List<Map<String, Object>> o = router.excute(q);

        return ResponseEntity.ok(o);
    }
}
