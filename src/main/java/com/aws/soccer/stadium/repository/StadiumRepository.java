package com.aws.soccer.stadium.repository;

import com.aws.soccer.player.model.Player;
import com.aws.soccer.stadium.model.Stadium;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.List;

@Repository
public interface StadiumRepository extends JpaRepository<Stadium, Long> {

//    JQPL 예시
//    @Modifying
//    @Query("update users set token = :token where id = :id")
//    public void modifyTokenById(@Param("id")Long id, @Param("token") String token);

//    11,15,16,17,23

    //11

    @Query("SELECT concat(t.region, ' ', t.team) as 팀명, s.stadiumName as 홈구장 FROM stadium s JOIN team t ON s.stadiumId = t.stadiumId WHERE t.region LIKE '수원%'")
    List<String> teamField();

    //15

    @Query("SELECT p.playerName as 선수, p.POSITION as 포지션, CONCAT(t.region, ' ',t.team) as 팀명,s.stadiumName as 스타디움,sc.scheDate as 경기날짜" +
            " FROM stadium s" +
            " JOIN team t ON s.stadiumId = t.stadiumId" +
            " JOIN player p ON t.teamId = p.teamId" +
            " JOIN schedule sc ON s.stadiumId = sc.stadiumId" +
            " WHERE sc.scheDate = '20120317' AND p.teamId = 'K03' AND p.POSITION = 'GK'")
    List<String> manyInfo();

    //16

    @Query("SELECT DISTINCT s.stadiumName AS 경기장이름, sc.scheDate AS 경기일정 " +
            "FROM stadium s " +
            "JOIN team t " +
            "JOIN player p " +
            "JOIN schedule sc " +
            "WHERE sc.home_score - sc.away_score > 2")
    List<String> bigWin();

    //17

    @Query(" SELECT s.stadiumName, t.team FROM stadium s LEFT JOIN team t")
    List<String> withNoHomeGround();

    //23

    @Query("SELECT (SELECT s.stadiumName FROM stadium s WHERE sc.stadiumId = s.stadiumId) as 경기장 ,sc.scheDate as 경기날짜 FROM schedule sc WHERE sc.scheDate LIKE '201205%'")
    List<String> mayStadium();
}
