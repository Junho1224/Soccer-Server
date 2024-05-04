package com.aws.soccer.stadium.controller;


import com.aws.soccer.stadium.service.StadiumServiceImpl;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@CrossOrigin(origins = "*", allowedHeaders = "*")
@RequiredArgsConstructor
@RequestMapping(path = "/api/stadium")
@RestController
public class StadiumController {

    private final StadiumRouter router;


    @GetMapping("/search")
    public ResponseEntity<?> getStadiumNameWithTeam(
            @RequestParam(value = "q", required = true) String q,
            @RequestParam(value = "playerName", required = false) String playerName,
            @RequestParam(value = "position", required = false) String position,
            @RequestParam(value = "teamId", required = false) String teamId
    ){
        List<?> o = router.execute(q);

        return ResponseEntity.ok(o);
    }



}