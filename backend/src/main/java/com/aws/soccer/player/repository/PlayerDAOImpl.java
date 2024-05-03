package com.aws.soccer.player.repository;

import com.aws.soccer.player.model.PlayerDTO;
import com.aws.soccer.player.model.QPlayer;
import com.querydsl.jpa.impl.JPAQueryFactory;
import org.springframework.stereotype.Repository;

import com.aws.soccer.player.model.Player;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import lombok.RequiredArgsConstructor;

import java.util.List;


@RequiredArgsConstructor
public class PlayerDAOImpl implements PlayerDAO {

    private final JPAQueryFactory factory;

    @Override
    public List<PlayerDTO> getAllPlayers() {
        return null;
    }
}

