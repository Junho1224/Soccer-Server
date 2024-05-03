package com.aws.soccer.team.controller;


import com.aws.soccer.team.repository.TeamRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Map;

@RequiredArgsConstructor
@Slf4j
@Component
public class TeamRouter {

    private final TeamRepository repository;

    public List<?> execute(String type) {

        return switch (type){
            case "1"-> repository.getAllByTeamName();
            case "2"-> repository.getPlayerOrderBy();
            case "3"-> repository.getPlayerByTeamId();
            case "4" -> repository.getTeamByNoPosition();
            case "5" -> repository.getTeamByDate();
            case "6" -> repository.getTeamByHeight();
            default -> null;
        };
    }
}