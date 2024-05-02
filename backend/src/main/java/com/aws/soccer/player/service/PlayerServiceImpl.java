package com.aws.soccer.player.service;

import com.aws.soccer.player.model.PlayerDTO;
import com.aws.soccer.player.repository.PlayerRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Log4j2
@Service
@RequiredArgsConstructor
public class PlayerServiceImpl implements PlayerService {
    private final PlayerRepository repository;
////Q2
//    @Override
//    public List<Map<String,Object>> getDistinctPosition() {
//        return repository.getDistinctPosition();
//    }
//
//    @Override
//    public List<Map<String,Object>> getDistinctByPositionIfnull() {
//        return repository.getDistinctByPositionIfnull();
//    }
//
//    //Q4
//    @Override
//    public List<Map<String,Object>> getPlayerNameFromRegion(String q,) {
//        return repository.getPlayerNameFromRegion();
//    }
////Q5
//    @Override
//    public List<Map<String,Object>> getPlayersByNameAndHeight() {
//        return repository.getPlayersByNameAndHeight();
//    }
//
////Q6
//    @Override
//    public List<Map<String,Object>> getPlayersByCondition() {
//        return repository.getPlayersByCondition();
//    }
////Q7
//    @Override
//    public List<Map<String,Object>> getPlayersByPositionAndRegion() {
//        return repository.getPlayersByPositionAndRegion();
//    }
//Q8
//    @Override
//    public List<PlayerDTO> getPlayersHeightAndWeightByTeamId() {
//        return repository.getPlayersHeightAndWeightByTeamId();
//    }
//
////Q18
//    @Override
//    public List<PlayerDTO> getPlayersLimit() {
//        return repository.getPlayersLimit();
//    }
////Q20
//    @Override
//    public List<PlayerDTO> getPlayersByPosition() {
//        return repository.getPlayersByPosition();
//    }
////Q21
//    @Override
//    public List<PlayerDTO> getTallestPlayers() {
//        return repository.getTallestPlayers();
//    }
//
////Q22
//    @Override
//    public List<PlayerDTO> getShorterThanTeamAvg() {
//        return repository.getShorterThanTeamAvg();
//    }


}