package com.aws.soccer.player.controller;

import com.aws.soccer.player.model.PlayerDTO;
import com.aws.soccer.player.service.PlayerService;

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
@RequestMapping(path = "/api/player")
@ApiResponses(value = {
        @ApiResponse(responseCode = "400", description = "Invalid ID supplied"),
        @ApiResponse(responseCode = "404", description = "dd") })
public class PlayerController {

    private final PlayerRouter router;
    private final PlayerService playerService;

    @GetMapping("/search")
    public ResponseEntity <List<Map<String,Object>>> searchPlayer(  //DTO대신 Map
            @RequestParam(value = "q", required = true) String q,
            @RequestParam(value = "playerName", required = false) String playerName,
            @RequestParam(value = "position", required = false) String position,
            @RequestParam(value = "teamId", required = false) String teamId) {
        log.info("Controller search Player q is {}", q);

        List<Map<String,Object>> o = router.excute(q);

        return ResponseEntity.ok(o);
    }
}
