package com.aws.soccer.player.controller;

import com.aws.soccer.player.repository.PlayerRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

import java.util.List;

@Slf4j
@RequiredArgsConstructor
@Component
public class PlayerRouter {
    private final PlayerRepository repository;

    @SuppressWarnings("unchecked")
    public List<?> execute(String q,String teamId,String position,String playerName,String height) {
        log.info("router {}",q);
        log.info("router {}",teamId);
        log.info("router {}",position);
        log.info("router {}",playerName);
        log.info("router {}",height);
        return switch (q){
            case "allPlayers" -> repository.gainAllPlayers();
            case "position-list" -> repository.gainPlayerPositionType();
            case "position-null" -> repository.gainPlayerPositionTypeNull();
            case "playerName-positionAndRegion" -> repository.gainPlayerNameByPositionAndRegion(teamId, position);
            case "player-nameAndHeight" -> repository.gainPlayersByFirstNameAndHeight(teamId,playerName,height);
//            case "6" -> repository.getPlayersByCondition(position);
//            case "7" -> repository.getPlayersByPositionAndRegion();
            case "8" -> null;
            case "9" -> null;
//            case "18" -> repository.getPlayersLimit();
//            case "20" -> repository.getPlayersByPosition(position);
            case "21" -> null;
            case "22" -> null;
            default -> null;
        };
    }
}
