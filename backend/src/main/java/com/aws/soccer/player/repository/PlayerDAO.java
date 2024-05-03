package com.aws.soccer.player.repository;

import com.aws.soccer.player.model.PlayerDTO;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PlayerDAO {
    List<PlayerDTO> getAllPlayers();



    
}
