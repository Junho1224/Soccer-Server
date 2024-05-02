package com.aws.soccer.player.repository;

import com.aws.soccer.player.model.Player;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import lombok.RequiredArgsConstructor;

@PersistenceContext
@RequiredArgsConstructor
public class PlayerTuningRepositoryImpl implements PlayerTuningRepository{
    private EntityManager entityManager;


    @Override
    public Player p() {
        return entityManager.find(Player.class, 1L);
    }

    @Override
    public void add(Player player) {
        entityManager.persist(player);
    }

    @Override
    public void update(Player player) {
        entityManager.merge(player);
    }
}
