package com.aws.soccer.player.model;

import com.aws.soccer.team.model.Team;
import jakarta.persistence.*;
import lombok.*;

@Entity(name = "player")
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor
@Builder
@Getter
@ToString(exclude = "id")
public class Player {
    @Id
    @Column(name ="id", nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String playerId;
    private String teamId;
    private String name;
    private String playerName;
    private String ePlayerName;
    private String nickname;

    private String joinYyyy ;

    private String  POSITION;

    private String backNo ;
    private String nation ;
    private String birthDate ;
    private String solar ;
    private String height ;
    private String weight ;

    // @ManyToOne(fetch = FetchType.LAZY)
    // @JoinColumn(name = "team_id", nullable = true, referencedColumnName = "teamId", foreignKey = @ForeignKey(value = ConstraintMode.NO_CONSTRAINT))
    // private Team teamId;
}