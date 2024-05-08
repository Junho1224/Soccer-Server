package com.aws.soccer.player.controller;


import com.aws.soccer.common.model.Box;
import com.aws.soccer.common.model.PageDTO;
import com.aws.soccer.player.model.Player;
import com.aws.soccer.player.model.PlayerDTO;
import com.aws.soccer.player.service.PlayerService;

import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;

import java.util.Map;

import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Map;


@Log4j2
@CrossOrigin(origins = "*")
@RestController
@RequiredArgsConstructor
@RequestMapping(path = "/api/players")
@ApiResponses(value = {
        @ApiResponse(responseCode = "400", description = "Invalid ID supplied"),
        @ApiResponse(responseCode = "404", description = "dd")})
public class PlayerController {
    private final PlayerRouter router;
    private final PlayerService service;

    //CUD 에 해당하는 것 가져오지 않고 R에 해당하는 것만 가져온다?

    @GetMapping(path = "/search")
    public ResponseEntity<?> search(
            @RequestParam(value = "q", required = true) String q, String teamId, String position, String player_name, String height, String region,
            Pageable pageable

    ) {
        log.info("MY-INFO : Controller searchPlayer q is {}", q);
        log.info("MY-INFO : Controller searchPlayer page is {}", pageable.getPageNumber());
        log.info("MY-INFO : Controller searchPlayer limit is {}", pageable.getPageSize());
        log.info("MY-INFO : Controller searchPlayer sortField is {}", pageable.getSort().toString());

        // nowPage, rowCount, pageSize, blockSize 외부주입.. count, size 1 부터, number 는 0부터


        long startTime = System.nanoTime();
        List<?> o = router.execute(q, teamId, position, player_name, height, region);
        long endTime = System.nanoTime();
        System.out.println("Execution time: " + (endTime - startTime) + " nanoseconds");
        PageDTO page = null;

        Box box = new Box();
        box.setPageDTO(page);
        box.setList(o);

        return ResponseEntity.ok(box);
    }
}
