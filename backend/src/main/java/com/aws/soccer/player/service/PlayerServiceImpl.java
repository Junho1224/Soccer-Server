package com.aws.soccer.player.service;

import com.aws.soccer.player.model.PlayerDTO;
import com.aws.soccer.player.repository.PlayerRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Service;

import java.util.List;

@Log4j2
@Service
@RequiredArgsConstructor
public class PlayerServiceImpl implements PlayerService {
    private final PlayerRepository repository;
//Q2
    @Override
    public List<String> getDistinctPosition() {
        log.info("test : {}",repository.getDistinctPosition());
        return repository.getDistinctPosition();
    }

    @Override
    public List<String> getDistinctByPositionIfnull() {
        return repository.getDistinctByPositionIfnull();
    }

    //Q4
    @Override
    public List<String> getPlayerNameFromSuwon() {
        log.info("test : {}",repository.getPlayerNameFromSuwon());
        return repository.getPlayerNameFromSuwon();
    }
//Q5
    @Override
    public List<String> getPlayersByNameAndHeight() {
        return repository.getPlayersByNameAndHeight();
    }

//Q6
    @Override
    public List<String> getplayersByCondition() {
        return repository.getplayersByCondition();
    }
//Q7
    @Override
    public List<PlayerDTO> getSuwonGK() {
        return repository.getSuwonGK();
    }
    //Q8
//    @Override
//    public List<PlayerDTO> getPlayersByHeightAndWeight() {
//        return repository.getPlayersByHeightAndWeight();
//    }

//Q18
//    @Override
//    public List<PlayerDTO> getPlayersLimit() {
//        return repository.getPlayersLimit();
//    }
//Q20
//    @Override
//    public List<PlayerDTO> getPlayersByMFInfo() {
//        log.info("20번 {}",repository.getPlayersByMFInfo());
//        return repository.getPlayersByMFInfo();
//    }

//    @Override
//    public List<PlayerDTO> getTallestPlayers() {
//        return repository.getTallestPlayers();
//    }

    //Q22
//    @Override
//    public List<PlayerDTO> getShorterThanTeamAvg() {
//        log.info("키작은 사람들 모음 : {}",repository.getShorterThanTeamAvg());
//        return repository.getShorterThanTeamAvg();
//    }


}