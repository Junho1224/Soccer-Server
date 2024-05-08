package com.aws.soccer.stadium.repository;

import com.aws.soccer.stadium.model.Stadium;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

@Repository
public interface StadiumJpqlRepository extends JpaRepository<Stadium, Long> {
    @Query("select distinct new map(s.stadiumName as 홈구장, concat(t.region, '[ ]',t.team) as 팀명) " +
            "from stadium s join team t on s.stadiumId = t.stadiumId " +
            "where t.region = '수원' and s.stadiumName like '수원%'")
    List<?> getStadiumNameWithTeam();

    @Query("select distinct new map(t.team as 팀이름, s.stadiumName as 스타디움, " +
            "(select distinct t2.team from team t2 where sc.awayteamId = t2.teamId) as 어웨이팀) " +
            "from stadium s " +
            "join team t on s.stadiumId = t.stadiumId " +
            "join schedule sc on s.stadiumId = sc.stadiumId " +
            "where sc.scheDate = '20120317'")
    List<?>getStadiumAndTeamAndSchedule();


    @Query("SELECT distinct new map(p.playerName as 이름, p.POSITION as 포지션, concat(t.team, ' ', t.region) as 팀명, " +
            "s.stadiumName as 스타디움, sc.scheDate as 경기날짜)" +
            "FROM stadium s " +
            "JOIN schedule sc ON s.stadiumId = sc.stadiumId " +
            "JOIN team t ON s.stadiumId = t.stadiumId " +
            "JOIN player p ON t.teamId = p.teamId " +
            "WHERE p.POSITION = 'GK' AND t.team = '스틸러스' AND sc.scheDate = '20120317'")
    List<?>getPohangSteelersGk();


//    @Query("SELECT new map(s.stadiumName as 스타디움, sc.scheDate as 경기일정, home.team as 홈팀명, away.team as 어웨이팀명) " +
//            "FROM stadium s " +
//            "JOIN schedule sc on s.stadiumId = sc.stadiumId " +
//            "join team home ON home.teamId = sc.hometeamId " +
//            "JOIN team away ON away.teamId = sc.awayteamId " +
//            "WHERE (sc.home_score - sc.away_score) >= 3")
//    List<Map<String, Object>> getHomeTeamWin();

    @Query("SELECT distinct new map(s.stadiumName as 스타디움, " +
            "(SELECT distinct t2.team FROM team t2 WHERE t2.stadiumId = s.stadiumId) as 팀명) " +
            "FROM stadium s " +
            "left join team t on s.stadiumId = t.stadiumId")
    List<?>getNoHomeTeam();
}