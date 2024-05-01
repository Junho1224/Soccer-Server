package com.aws.soccer.player.controller;


import com.aws.soccer.player.model.PlayerDTO;
import com.aws.soccer.player.service.PlayerService;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Log4j2
@CrossOrigin(origins = "*")
@RestController
@RequiredArgsConstructor
@RequestMapping(path = "/api/search")
@ApiResponses(value = {
        @ApiResponse(responseCode = "400", description = "Invalid ID supplied"),
        @ApiResponse(responseCode = "404", description = "dd")})

public class PlayerController {
    private final PlayerService service;
//Q2v
    @GetMapping(path = "/two")
    public ResponseEntity<List<String>> distinctPositionType(){
        return ResponseEntity.ok(service.getDistinctPosition());
    }
//Q3
    @GetMapping(path = "/three")
    public ResponseEntity<List<String>> getDistinctByPositionIfnull(){
        return ResponseEntity.ok(service.getDistinctByPositionIfnull());
    }
//Q4v
    @GetMapping(path = "/four")
    public ResponseEntity<List<String>> getPlayerNameFromRegion(){
        return ResponseEntity.ok(service.getPlayerNameFromRegion());
    }

//Q5v
    @GetMapping(path = "/five")
    public ResponseEntity<List<String>> getPlayersByNameAndHeight(){
        return ResponseEntity.ok(service.getPlayersByNameAndHeight());
    }


//Q6v
    @GetMapping(path = "/six")
    public ResponseEntity<List<String>> getPlayersByCondition(){
        return ResponseEntity.ok(service.getPlayersByCondition());
    }
//Q7
    @GetMapping(path = "/seven")
    public ResponseEntity<List<PlayerDTO>> getPlayersByPositionAndRegion(){
        return ResponseEntity.ok(service.getPlayersByPositionAndRegion());
    }

//Q8v
//    @GetMapping(path = "/eight")
//    public ResponseEntity<List<PlayerDTO>> getPlayersHeightAndWeightByTeamId(){
//        return ResponseEntity.ok(service.getPlayersHeightAndWeightByTeamId());
//    }
//
////Q18x
//    @GetMapping(path = "/eight-teen")
//    public ResponseEntity<List<PlayerDTO>> getPlayerLimit(){
//        return ResponseEntity.ok(service.getPlayersLimit());
//    }
////Q20x
//    @GetMapping(path = "/twenty")
//    public ResponseEntity<List<PlayerDTO>> getPlayersByPosition(){
//        log.info("20번 controller");
//        return ResponseEntity.ok(service.getPlayersByPosition());
//    }
////Q21
//    @GetMapping(path = "/twenty-one")
//    public ResponseEntity<List<PlayerDTO>> getTallestPlayers(){
//        return ResponseEntity.ok(service.getTallestPlayers());
//    }
////Q22x
//    @GetMapping(path = "/twenty-two")
//    public ResponseEntity<List<PlayerDTO>> getShorterThanTeamAvg(){
//        log.info("22번 controller");
//        return ResponseEntity.ok(service.getShorterThanTeamAvg());
//    }

}