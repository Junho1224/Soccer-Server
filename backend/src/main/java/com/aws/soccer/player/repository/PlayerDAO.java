package com.aws.soccer.player.repository;

import com.aws.soccer.player.model.PlayerDTO;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PlayerDAO {
    List<PlayerDTO> gainAllPlayers();

    List<String> gainPlayerPositionType();//2

    List<String> gainPlayerPositionTypeNull();//3

    List<String> gainPlayerNameByPositionAndRegion(String teamId, String position);//4

    List<String> gainPlayersByFirstNameAndHeight(String teamId, String playerName, String height);//5 아무것도...뜨질 않는다...
//    List<PlayerDTO> gainPlayersByTeamAndPositionAndHeightDSL();//6
//    List<PlayerDTO> gainPlayersByPositionAndRegionDSL();//7
//    List<PlayerDTO> gainPlayersNameAndHeightAndWeightFromRegionDSL();//8
//    List<PlayerDTO> gainBMIAndHeightAndWeightFromRegionDSL();//9
//    List<PlayerDTO> gainPlayersLimitDSL();//18
//    List<PlayerDTO> gainPlayersByPositionDSL();

}