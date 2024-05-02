package com.aws.soccer.player.repository;

import com.aws.soccer.player.model.Player;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@PersistenceContext
public class PlayerEMImpl implements PlayerEM{

    private final EntityManager entityManager;

    @Override
    public Player p(Player player, Long id) {
        return entityManager.find(Player.class, 1L);
    }

    @Override
    public Player p2(Player player, Long id) {
        return null;
    }

    @Override
    public void insert(Player player) {
        entityManager.persist(player);
    }

    @Override
    public void update(Player player) {
        entityManager.persist(player);
    }
}