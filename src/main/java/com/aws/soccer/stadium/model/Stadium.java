package com.aws.soccer.stadium.model;


import com.aws.soccer.schedule.model.Schedule;
import com.aws.soccer.team.model.Team;
import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.List;

@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Getter
@ToString
@Entity(name = "stadium")
public class Stadium {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String stadiumId;
    private String stadiumName;
    private String hometeamId;
    private Long seatCount;
    private String address;
    private String ddd;
    private String tel;
//
//    @OneToMany(mappedBy = "stadium_id", cascade = CascadeType.REMOVE)
//    private List<Team> teams;
//
//    @OneToMany(mappedBy = "stadium_id", cascade = CascadeType.REMOVE)
//    private List<Schedule> schedules;
}
