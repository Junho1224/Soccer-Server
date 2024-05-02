package com.aws.soccer.player.repository;

import com.aws.soccer.player.model.Player;
import com.aws.soccer.player.model.PlayerDTO;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

@Repository
public interface PlayerJpqlRepository extends JpaRepository<Player, Long> {
    //Q2v
    @Query("select distinct p.POSITION from player as p")
    List<Map<String, Object>> getDistinctPosition();

    //Q3
    @Query("select distinct" +
            " case" +
            " when p.POSITION = '' then '신입' else p.POSITION" +
            " end" +
            " from player p")
    List<String> getDistinctByPositionIfnull();

    //Q4v
    @Query("select p.playerName from player as p where p.teamId = 'k02' and p.POSITION = 'GK'")
    List<String> getPlayerNameFromSuwon();

    //Q5v
    @Query("select p.playerName \n" +
            " from player as p\n" +
            " where p.teamId = 'K02' and p.playerName like '고%' and p.height >='170' \n")
    List<String> getPlayersByNameAndHeight();

    //Q6v
    @Query("select p.playerName\n" +
            "from player p\n" +
            "where p.POSITION= 'MF'\n" +
            "and (p.height between '170' and '180')\n" +
            "and p.teamId in (select t.teamId\n" +
            "                from team as t\n" +
            "                where t.team = '삼성블루윙즈' or t.team = '드래곤즈')")
    List<String> getplayersByCondition();

    //Q7v
    @Query("select new com.aws.soccer.player.model.PlayerDTO(p.id, p.playerId, p.playerName," +
            " p.teamId, p.POSITION, p.height, p.weight, p.backNo, p.birthDate," +
            " p.solar, p.ePlayerName, p.nickname, p.joinYyyy, p.nation) from player p where p.POSITION = 'GK'" +
            " and p.teamId = (select t.teamId from team t where t.region = '수원')")
    List<PlayerDTO> getSuwonGK();

}