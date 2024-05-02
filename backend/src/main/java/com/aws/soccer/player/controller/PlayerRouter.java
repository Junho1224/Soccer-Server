package com.aws.soccer.player.controller;


import com.aws.soccer.player.repository.PlayerJpqlRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Map;

@RequiredArgsConstructor
@Component
public class PlayerRouter {

    private static PlayerJpqlRepository repository;

    @SuppressWarnings("unckeked")
    public static List<Map<String, Object>> execute(String q){

        return switch (q){

            case "1" -> repository.getDistinctPosition();
            case "2" -> null;
            case "3" -> null;
            case "4" -> null;

            default -> null;
        };

    }
}