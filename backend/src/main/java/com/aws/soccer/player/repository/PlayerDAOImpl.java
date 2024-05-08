package com.aws.soccer.player.repository;

import com.aws.soccer.player.model.PlayerDTO;
import com.aws.soccer.player.model.QPlayer;
import com.aws.soccer.player.model.QPlayerDTO;
import com.aws.soccer.stadium.model.QStadium;
import com.querydsl.jpa.impl.JPAQueryFactory;
import org.springframework.stereotype.Repository;

import com.aws.soccer.player.model.Player;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class PlayerDAOImpl implements PlayerDAO {

    private final JPAQueryFactory factory;
    private final QPlayer player = QPlayer.player;

    @Override
    public List<PlayerDTO> getAllPlayers() {
        return factory.select(
                        new QPlayerDTO(
                                player.id,
                                player.playerId,
                                player.playerName,
                                player.teamId,
                                player.ePlayerName,
                                player.nickname,
                                player.joinYyyy,
                                player.POSITION,
                                player.backNo,
                                player.nation,
                                player.birthDate,
                                player.solar,
                                player.height,
                                player.weight))
                .from(QPlayer.player)
                .orderBy(player.playerName.asc())
                .offset(1)
                .limit(5)
                .fetch();
    }

    @Override
    public Long countAllPlayers() {
        return factory.select(player.count())
                .from(player)
                .stream()
                .count();
    }
}