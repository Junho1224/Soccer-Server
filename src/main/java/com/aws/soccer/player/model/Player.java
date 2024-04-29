package com.aws.soccer.player.model;

import com.aws.soccer.team.model.Team;
import jakarta.persistence.*;
import lombok.*;

@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor
@Getter
@ToString(exclude = {"id"})
@Entity(name = "player")
@Builder
public class Player {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String playerId;
    private String playerName;
    private String teamId;
    private String ePlayerName;
    private String nickname;
    private String joinYyyy;
    private String POSITION;
    private String backNo;
    private String nation;
    private String birthDate;
    private String solar;
    private String height;
    private String weight;

//    @ManyToOne
//    @JoinColumn(name = "team_id")
//    private Team teamId;

}
