package com.aws.soccer.player.repository;

import com.aws.soccer.player.model.Player;
import com.aws.soccer.player.model.PlayerDTO;

import java.util.List;

public interface PlayerDAO {
    List<PlayerDTO> getAllPlayers();
    Long countAllPlayers();
}
