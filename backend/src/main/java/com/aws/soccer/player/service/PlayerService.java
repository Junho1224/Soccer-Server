package com.aws.soccer.player.service;

import com.aws.soccer.player.model.Player;
import com.aws.soccer.player.model.PlayerDTO;

import java.util.List;

public interface PlayerService {

    List<String> getDistinctPosition();
    List<String> getDistinctByPositionIfnull();

    List<String> getPlayerNameFromRegion();

    List<String> getPlayersByNameAndHeight();

    List<String> getPlayersByCondition();

    List<PlayerDTO> getPlayersByPositionAndRegion();

//    List<PlayerDTO> getPlayersHeightAndWeightByTeamId();
//
//    List<PlayerDTO> getPlayersLimit();
//
//    List<PlayerDTO> getPlayersByPosition();
//
//    List<PlayerDTO> getTallestPlayers();
//
//    List<PlayerDTO> getShorterThanTeamAvg();

}