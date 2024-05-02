package com.aws.soccer.schedule.model;

import com.aws.soccer.stadium.model.Stadium;

import jakarta.persistence.*;
import lombok.*;

@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor
@Builder
@Getter
@ToString(exclude = "id")
@Setter
@Entity(name = "schedule")
public class Schedule {

    @Id
    @Column(name = "id",nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String stadiumId;
    private String scheDate;
    private String gubun;
    private String hometeamId;
    private String awayteamId;
    private Long home_score;
    private Long away_score;

    // @ManyToOne(fetch = FetchType.LAZY)
    // @JoinColumn(name = "stadium_id", nullable = true, referencedColumnName = "stadiumId", foreignKey = @ForeignKey(value = ConstraintMode.NO_CONSTRAINT))
    // private Stadium stadiumId;
}