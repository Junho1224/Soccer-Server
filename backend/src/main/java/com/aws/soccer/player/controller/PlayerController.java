package com.aws.soccer.player.controller;


import com.aws.soccer.player.model.Player;
import com.aws.soccer.player.model.PlayerDTO;
import com.aws.soccer.player.service.PlayerService;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;
import java.util.Objects;

@Log4j2
@CrossOrigin(origins = "*")
@RestController
@RequiredArgsConstructor
@RequestMapping(path = "/api/player")
@ApiResponses(value = {
        @ApiResponse(responseCode = "400", description = "Invalid ID supplied"),
        @ApiResponse(responseCode = "404", description = "dd")})

public class PlayerController {
    private final PlayerRouter router;
    private final PlayerService playerService;

    //CUD 에 해당하는 것 가져오지 않고 R에 해당하는 것만 가져온다?

    @GetMapping(path = "/search")
    public ResponseEntity<List<Map<String, Object>>> search(
            @RequestParam(value = "q", required = true) String q,
            @RequestParam(value = "playerName", required = false) String playerName,
            @RequestParam(value = "teamId", required = false) String teamId,
            @RequestParam(value = "position", required = false) String position,
            @RequestParam(value = "team", required = false) String team,
            @RequestParam(value = "region", required = false) String region

    ) {
        log.info("Controller searchPlayer q is {}",q);
        log.info("Controller searchPlayer teamId is {}",teamId);
        log.info("Controller searchPlayer position is {}",position);
        List<Map<String, Object>> o = router.execute(q, teamId, position);
        return ResponseEntity.ok(o);
    }

}