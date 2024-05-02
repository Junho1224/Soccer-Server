package com.aws.soccer.player.repository;

import com.aws.soccer.player.model.Player;
import org.springframework.stereotype.Repository;

@Repository
public interface PlayerTuningRepository {
    Player p ();
void add(Player player);
void update(Player player);
}
