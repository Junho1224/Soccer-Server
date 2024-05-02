package com.aws.soccer.player.repository;

import org.aspectj.lang.annotation.SuppressAjWarnings;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.aws.soccer.player.model.PlayerDTO;
import java.util.List;
import java.util.Map;


@SuppressAjWarnings("hiding")
@Repository
public interface PlayerJpqlRepository<Player> {

    // JPQL //returntype Map

    // Q2v
    @Query("select distinct p.POSITION from player as p")
    List<Map<String,Object>> getDistinctPosition();

    // Q3
    @Query("select distinct" +
            " case" +
            " when p.POSITION = '' then '신입' else p.POSITION" +
            " end" +
            " from player p")
    public List<String> getDistinctByPositionIfnull();

    // Q4v
    @Query("select p.playerName from player as p where p.teamId = 'k02' and p.POSITION = 'GK'")
    public List<String> getPlayerNameFromSuwon();

    // Q5v
    @Query("select p.playerName \n" +
            " from player as p\n" +
            " where p.teamId = 'K02' and p.playerName like '고%' and p.height >='170' \n")
    public List<String> getPlayersByNameAndHeight();

    // Q6v
    @Query("select p.playerName\n" +
            "from player p\n" +
            "where p.POSITION= 'MF'\n" +
            "and (p.height between '170' and '180')\n" +
            "and p.teamId in (select t.teamId\n" +
            "                from team as t\n" +
            "                where t.team = '삼성블루윙즈' or t.team = '드래곤즈')")
    public List<String> getplayersByCondition();

    // Q7v
    @Query("select new com.aws.soccer.player.model.PlayerDTO(p.id, p.playerId, p.playerName," +
            " p.teamId, p.POSITION, p.height, p.weight, p.backNo, p.birthDate," +
            " p.solar, p.ePlayerName, p.nickname, p.joinYyyy, p.nation) from player p where p.POSITION = 'GK'" +
            " and p.teamId = (select t.teamId from team t where t.region = '수원')")
    public List<PlayerDTO> getSuwonGK();

    // Q8x
    // @Query("select p.playerName," +
    // " ifnull(nullif(height,''),'0') as height," +
    // " ifnull(nullif(weight,''),'0') as weight" +
    // " from player as p" +
    // " where p.teamId = (select t.teamId" +
    // " from team as t" +
    // " where t.region = '서울')" +
    // " order by p.weight desc, p.height desc")
    // public List<PlayerDTO> getPlayersByHeightAndWeight();

    // Q18v
    // @Query(value = "select * from player limit 5", nativeQuery = true)
    // public List<PlayerDTO> getPlayersLimit();

    // Q20x
    // @Query("select\n " +
    // " (select t.team\n" +
    // " from team t\n" +
    // " where t.teamId = p.teamId),\n" +
    // " p.playerName, p.backNo\n" +
    // " from player p\n" +
    // " where p.POSITION = 'MF'")
    // public List<PlayerDTO> getPlayersByMFInfo();

    // Q21
    // @Query(value = "select" +
    // " (select t.team" +
    // " from team t" +
    // " where t.team_id = p.team_id), p.player_name , p.back_no " +
    // " from player p " +
    // " order by p.height desc limit '5'", nativeQuery = true)
    // public List<PlayerDTO> getTallestPlayers();

    // 22x
    // @Query("SELECT NEW com.aws.soccer.player.model.PlayerDTO(p.id, p.playerId,
    // p.playerName, p.teamId, p.POSITION, p.height, p.weight, p.backNo,
    // p.birthDate, p.solar, p.ePlayerName, p.nickname, p.joinYyyy, p.nation)" +
    // " FROM player p" +
    // " JOIN (SELECT pl.teamId, ROUND(AVG(pl.height), 2) AS average_height" +
    // " FROM player pl" +
    // " WHERE pl.height <> ''" +
    // " GROUP BY pl.teamId) t_avg" +
    // " ON p.teamId = t_avg.teamId" +
    // " WHERE p.height <> '' AND p.height < t_avg.average_height")
    // public List<PlayerDTO> getShorterThanTeamAvg();

}
