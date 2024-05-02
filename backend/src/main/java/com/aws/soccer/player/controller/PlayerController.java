package com.aws.soccer.player.controller;


import com.aws.soccer.player.model.PlayerDTO;
import com.aws.soccer.player.service.PlayerService;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.apache.coyote.Response;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

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
    private final PlayerService service;
//Q2v
    @GetMapping(path = "/two")
    public ResponseEntity<List<Map<String,Object>>> distinctPositionType(){
        return ResponseEntity.ok(service.getDistinctPosition());
    }
//Q3
    @GetMapping(path = "/three")
    public ResponseEntity<List<String>> getDistinctByPositionIfnull(){
        return ResponseEntity.ok(service.getDistinctByPositionIfnull());
    }
//Q4v
    @GetMapping(path = "/four")
    public ResponseEntity<List<String>> getPlayerNameFromSuwon(){
        return ResponseEntity.ok(service.getPlayerNameFromSuwon());
    }

//Q5v
    @GetMapping(path = "/five")
    public ResponseEntity<List<String>> getPlayersByNameAndHeight(){
        return ResponseEntity.ok(service.getPlayersByNameAndHeight());
    }


//Q6v
    @GetMapping(path = "/six")
    public ResponseEntity<List<String>> getPlayerCondition(){
        return ResponseEntity.ok(service.getplayersByCondition());
    }
//Q7
    @GetMapping(path = "/seven")
    public ResponseEntity<List<PlayerDTO>> getSuwonGK(){
        return ResponseEntity.ok(service.getSuwonGK());
    }

    @GetMapping(path = "/search")
    public ResponseEntity <List<Map<String, Object>>> searchPlayer(
            @RequestParam(value="q",required=true) String q,
            @RequestParam(value="playerName",required=false) String playerName,
            @RequestParam(value="position",required=false) String position,
            @RequestParam(value="teamId",required=false) String teamId
    ){
        log.info("Controller searchPlayer q is {}");

        List<Map<String, Object>> o = router.execute(q);

        return null;
    }


}