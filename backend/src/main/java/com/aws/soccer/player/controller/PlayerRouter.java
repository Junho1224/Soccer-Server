package com.aws.soccer.player.controller;


import com.aws.soccer.player.model.PlayerDTO;
import com.aws.soccer.player.repository.PlayerRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Map;

@Slf4j
@RequiredArgsConstructor
@Component
public class PlayerRouter {
    private final PlayerRepository repository;

    @SuppressWarnings("unchecked")
    public List<Map<String, Object>> execute(String q,String teamId,String position) {
        log.info("router {}",teamId);
        log.info("router {}",position);
        return switch (q){
            case "2" -> repository.getDistinctPosition();
//            case "3" -> repository.getDistinctByPositionIfnull();
            case "4" -> repository.getPlayerNameFromRegion(teamId,position);
//            case "5" -> repository.getPlayersByNameAndHeight();
//            case "6" -> repository.getPlayersByCondition();
//            case "7" -> repository.getPlayersByPositionAndRegion();
            case "8" -> null;
            case "9" -> null;
            case "18" -> null;
            case "20" -> null;
            case "21" -> null;
            case "22" -> null;
            default -> null;
        };
    }
}
