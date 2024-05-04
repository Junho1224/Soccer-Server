package com.aws.soccer.team.controller;

import com.aws.soccer.team.model.Team;
import com.aws.soccer.team.service.TeamServiceImpl;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@Slf4j
@CrossOrigin(origins = "*", allowedHeaders = "*")
@RequiredArgsConstructor
@RequestMapping(path = "/api/soccer")
@RestController
public class TeamController {
    private final TeamServiceImpl service;
    private final TeamRouter router;

    @GetMapping(path = "/search")
    public ResponseEntity<?> searchPlayer(
            @RequestParam(value = "q", required = true) String q,
            @RequestParam(value = "playerName", required = false) String playerName,
            @RequestParam(value = "position", required = false) String position,
            @RequestParam(value = "teamId", required = false) String teamId
    ) {
        log.info("Controller searchPlayer q is {}", q);

        List<?> o = router.execute(q);

        return ResponseEntity.ok(o);
    }
}