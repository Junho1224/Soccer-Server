package com.aws.soccer.team.controller;

import com.aws.soccer.team.model.Team;
import com.aws.soccer.team.service.TeamServiceImpl;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@CrossOrigin(origins = "*", allowedHeaders = "*")
@RequiredArgsConstructor
@RequestMapping(path = "/api/soccer")
@RestController
public class TeamController {
    private final TeamServiceImpl service;
    @GetMapping("/7")
    public List<String> getAllByTeamName(){
        return service.getAllByTeamName();
    }; //1

    @GetMapping("/")
    public List<Team> getPlayerOrderBy(){
        return service.getPlayerOrderBy();
    }; // 10

    @GetMapping("/1")
    public List<String> getPlayerByTeamId(){
        return service.getPlayerByTeamId();
    }; // 12

    @GetMapping("/2")
    public List<String> getTeamByNoPosition(){
        return service.getTeamByNoPosition();
    }; // 13

    @GetMapping("/3")
    public List<String> getTeamByDate(){
        return service.getTeamByDate();
    }; // 14

    @GetMapping("/4")
    public List<Team> getTeamByAverageHeight(){
        return service.getTeamByAverageHeight();
    }; // 22
}