package com.aws.soccer.player.repository;


import com.aws.soccer.player.model.Player;

public interface PlayerEM {
    Player p(Player player, Long id);
    Player p2(Player player, Long id);
    void insert(Player player);
    void update(Player player);
}
