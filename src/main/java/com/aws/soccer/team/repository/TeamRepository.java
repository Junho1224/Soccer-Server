package com.aws.soccer.team.repository;

import com.aws.soccer.team.model.Team;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public interface TeamRepository extends JpaRepository<Team, Long> {

    @Query("SELECT t FROM team t ORDER BY t.team")
    List<String> getAllByTeamName(); //1

    @Query("SELECT t FROM team t JOIN player p ON t.teamId = p.teamId WHERE t.teamId IN('K02', 'K10') AND p.POSITION = 'GK' ORDER BY t.team, p.playerName")
    List<Team> getPlayerOrderBy(); // 10

    @Query("SELECT p.height as 키, t.team as 팀명, p.playerName as 이름 FROM team t JOIN player p ON t.teamId = p.teamId WHERE t.teamId IN ('K02', 'K10') ORDER BY p.height, t.team, p.playerName")
    List<String> getPlayerByTeamId(); // 12

    @Query("SELECT t.team , p.playerName FROM team t JOIN player p ON t.teamId = p.teamId WHERE p.POSITION = '' ORDER BY t.team, p.playerName")
    List<String> getTeamByNoPosition(); // 13

    @Query("SELECT t.team as HOME_TEAM, s.stadiumName, (SELECT t.team FROM team t WHERE sc.awayteamId = t.teamId) as AWAY_TEAM FROM stadium s JOIN schedule sc ON s.stadiumId = sc.stadiumId " +
            "         JOIN team t ON s.stadiumId = t.stadiumId WHERE sc.scheDate = '20120317'")
    List<String> getTeamByDate(); // 14

    @Query("SELECT t FROM team t ORDER BY t.team")
    List<Team> getTeamByHeight(); // 22

    @Query("SELECT (select team FROM team t WHERE p.teamId = t.teamId) as 소속팀명, p.playerName as 선수명, p.backNo as 백넘버 FROM player p WHERE p.POSITION = 'MF'")
    List<Team> getTeamByHeight2();

}
