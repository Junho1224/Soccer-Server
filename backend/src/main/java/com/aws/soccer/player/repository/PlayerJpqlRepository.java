package com.aws.soccer.player.repository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

@Repository
@SuppressWarnings("rawtypes")
public interface PlayerJPQLRepository<Player>{
    //Q2v
    @Query("select distinct new map(p.POSITION as position) from player as p")
    List<Map<String,Object>> getDistinctPosition();
   //Q3
   @Query("select distinct" +
           " case" +
           " when p.POSITION = '' then '신입' else p.POSITION" +
           " end" +
           " from player p")
   List<Map<String,Object>> getDistinctByPositionIfnull();
    //Q4v
    @Query("select new map(p.playerName playerName) " +
            " from player as p " +
            " where p.teamId = :teamId and p.POSITION = :position")
    List<Map<String,Object>> getPlayerNameFromRegion(@Param("teamId") String teamId, @Param("position") String position);

    //Q5v
   @Query("select new map (p.playerName as playerName) \n" +
           " from player as p\n" +
           " where p.teamId = :teamId and p.playerName like :playerName% and p.height >= :height \n")
   List<Map<String,Object>> getPlayersByNameAndHeight(@Param("teamId")String teamId, @Param("playerName")String playerName, @Param("height")String height);
//
//    //Q6v
   @Query("select new map (p.playerName as playerName) " +
           "from player p " +
           "where p.POSITION= 'MF' " +
           "and (p.height between '170' and '180') " +
           "and p.teamId in (select t.teamId " +
           "                from team as t " +
           "                where t.team = '삼성블루윙즈' or t.team = '드래곤즈')")
   List<Map<String,Object>> getPlayersByCondition(@Param("POSITION") String position, @Param("height")String height, @Param("team1")String team1, @Param("team2")String team2);
//
//    //Q7v
   @Query("select new map(p.playerName as playerName )from player p where p.POSITION = :position" +
           " and p.teamId = (select t.teamId from team t where t.region = :region)")
   List<Map<String,Object>> getPlayersByPositionAndRegion(@Param("position") String position, @Param("region")String region);

//Q8x
//    @Query("select p.playerName," +
//            "       ifnull(nullif(height,''),'0') as height," +
//            "       ifnull(nullif(weight,''),'0') as weight" +
//            " from player as p" +
//            " where p.teamId = (select t.teamId" +
//            "                 from team as t" +
//            "                 where t.region = '서울')" +
//            " order by p.weight desc, p.height desc")
//    List<Map<String,Object>> getPlayersHeightAndWeightByTeamId();
//
//
////Q18x
//    @Query(value = "select * from player limit 5", nativeQuery = true)
//    List<Map<String,Object>> getPlayersLimit();
//
////Q20x
//    @Query("select\n " +
//            "    (select t.team\n" +
//            "     from team t\n" +
//            "     where t.teamId = p.teamId),\n" +
//            "    p.playerName, p.backNo\n" +
//            " from player p\n" +
//            " where p.POSITION = 'MF'")
//    List<Map<String,Object>> getPlayersByPosition();
//
////Q21
//    @Query(value = "select" +
//            " (select t.team" +
//            " from team t" +
//            " where t.team_id = p.team_id), p.player_name , p.back_no  " +
//            " from player p " +
//            " order by p.height desc limit '5'", nativeQuery = true)
//    List<Map<String,Object>> getTallestPlayers();
//
////22x
//    @Query("SELECT NEW com.aws.soccer.player.model.PlayerDTO(p.id, p.playerId, p.playerName, p.teamId, p.POSITION, p.height, p.weight, p.backNo, p.birthDate, p.solar, p.ePlayerName, p.nickname, p.joinYyyy, p.nation)" +
//            " FROM player p" +
//            " JOIN (SELECT pl.teamId, ROUND(AVG(pl.height), 2) AS average_height" +
//            "       FROM player pl" +
//            "       WHERE pl.height <> ''" +
//            "       GROUP BY pl.teamId) t_avg" +
//            " ON p.teamId = t_avg.teamId" +
//            " WHERE p.height <> '' AND p.height < t_avg.average_height")
//    List<Map<String,Object>> getShorterThanTeamAvg();

}
