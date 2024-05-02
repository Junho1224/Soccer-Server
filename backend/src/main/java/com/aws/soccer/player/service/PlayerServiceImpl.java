package com.aws.soccer.player.service;

import com.aws.soccer.player.model.PlayerDTO;
import com.aws.soccer.player.repository.PlayerJpqlRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Log4j2
@Service
@RequiredArgsConstructor
public class PlayerServiceImpl implements PlayerService {
    @Override
    public List<Map<String, Object>> getDistinctPosition() {
        return List.of();
    }

    @Override
    public List<String> getDistinctByPositionIfnull() {
        return List.of();
    }

    @Override
    public List<String> getPlayerNameFromSuwon() {
        return List.of();
    }

    @Override
    public List<String> getPlayersByNameAndHeight() {
        return List.of();
    }

    @Override
    public List<String> getplayersByCondition() {
        return List.of();
    }

    @Override
    public List<PlayerDTO> getSuwonGK() {
        return List.of();
    }
//    private final PlayerJpqlRepository repository;

//    //Q2
//    @Override
//    public List<Map<String, Object>> getDistinctPosition() {
//        log.info("test : {}", repository.getDistinctPosition());
//        return repository.getDistinctPosition();
//    }
//
//    @Override
//    public List<String> getDistinctByPositionIfnull() {
//        return repository.getDistinctByPositionIfnull();
//    }
//
//    //Q4
//    @Override
//    public List<String> getPlayerNameFromSuwon() {
//        log.info("test : {}", repository.getPlayerNameFromSuwon());
//        return repository.getPlayerNameFromSuwon();
//    }
//
//    //Q5
//    @Override
//    public List<String> getPlayersByNameAndHeight() {
//        return repository.getPlayersByNameAndHeight();
//    }
//
//    //Q6
//    @Override
//    public List<String> getplayersByCondition() {
//        return repository.getplayersByCondition();
//    }
//
//    //Q7
//    @Override
//    public List<PlayerDTO> getSuwonGK() {
//        return repository.getSuwonGK();
//    }
//


}