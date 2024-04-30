package com.aws.soccer.team.service;

import com.aws.soccer.team.model.Team;
import com.aws.soccer.team.repository.TeamRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@RequiredArgsConstructor
@Service
public class TeamServiceImpl implements TeamService{

    private final TeamRepository repository;

    public List<String> getAllByTeamName(){
        return repository.getAllByTeamName();
    }; //1

    public List<Team> getPlayerOrderBy(){
        return repository.getPlayerOrderBy();
    }; // 10

    public List<String> getPlayerByTeamId(){
        return repository.getPlayerByTeamId();
    }; // 12

    public List<String> getTeamByNoPosition(){
        return repository.getTeamByNoPosition();
    }; // 13

    public List<String> getTeamByDate(){
        return repository.getTeamByDate();
    }; // 14

    public List<Team> getTeamByAverageHeight(){
        return repository.getTeamByHeight();
    }; // 22


}
