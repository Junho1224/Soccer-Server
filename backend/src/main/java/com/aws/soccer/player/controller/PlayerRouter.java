package com.aws.soccer.player.controller;

import com.aws.soccer.player.repository.PlayerRepository;

import lombok.RequiredArgsConstructor;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class PlayerRouter {

    
    private PlayerRepository repository;

    @SuppressWarnings("unchecked")
    public List<Map<String,Object>> excute(String q){
        
        return switch (q){
            case "1"-> repository.getDistinctPosition();
            case "2"-> null;
            case "3"-> null;
            case "4"-> null;
            default -> null;
        };

    }
    
}
