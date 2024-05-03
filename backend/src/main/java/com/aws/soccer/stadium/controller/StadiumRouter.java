package com.aws.soccer.stadium.controller;

import com.aws.soccer.stadium.repository.StadiumJpqlRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Map;

@Component
@RequiredArgsConstructor
public class StadiumRouter {

    private final StadiumJpqlRepository repository;

    @SuppressWarnings("unckeked")
    public List<?> execute(String q) {

        return switch (q) {

            case "1" -> repository.getStadiumNameWithTeam();
            case "2" -> repository.getStadiumAndTeamAndSchedule();
            case "3" -> repository.getPohangSteelersGk();
            case "4" -> repository.getNoHomeTeam();
//          case "5" -> repository.getHomeTeamWin();

            default -> null;
        };
    }

}
