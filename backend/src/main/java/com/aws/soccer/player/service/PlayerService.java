package com.aws.soccer.player.service;

import com.aws.soccer.player.model.Player;
import com.aws.soccer.player.model.PlayerDTO;

import java.util.List;
import java.util.Map;

public interface PlayerService {

    List<Map<String,Object>> getDistinctPosition();
    List<String> getDistinctByPositionIfnull();

    List<String> getPlayerNameFromSuwon();

    List<String> getPlayersByNameAndHeight();

    List<String> getplayersByCondition();

    List<PlayerDTO> getSuwonGK();

//    List<PlayerDTO> getPlayersByHeightAndWeight();

//    List<PlayerDTO> getPlayersLimit();

//    List<PlayerDTO> getPlayersByMFInfo();

//    List<PlayerDTO> getTallestPlayers();

//    List<PlayerDTO> getShorterThanTeamAvg();

}