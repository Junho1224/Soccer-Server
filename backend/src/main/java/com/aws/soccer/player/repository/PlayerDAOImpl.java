package com.aws.soccer.player.repository;

import org.springframework.stereotype.Repository;

import com.aws.soccer.player.model.Player;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import lombok.RequiredArgsConstructor;

@Repository
@RequiredArgsConstructor
@PersistenceContext
public class PlayerDAOImpl implements PlayerDAO{
    
    
    private final EntityManager em;
    
    @Override
    public Player p1(Player player,Long id) {
        return em.find(Player.class, 1L);
    }
    
    @Override
    public Player p2(Player player, Long id) {
       em.createQuery("select a from Player a where a.id = :id",Player.class)
       .setParameter("id", id)
       .getResultList();
    return em.find(Player.class, 1L);
    }

    @Override
    public void insert(Player player) {
        em.persist(player);
    }

    @Override
    public void update(Player player) {
        em.persist(player);
    }
    
}


// context