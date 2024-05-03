package com.aws.soccer.player.repository;

import com.aws.soccer.player.model.PlayerDTO;
import com.aws.soccer.player.model.QPlayer;
import com.querydsl.jpa.impl.JPAQueryFactory;
import lombok.RequiredArgsConstructor;

import java.util.List;

@RequiredArgsConstructor
public class PlayerDAOImpl implements PlayerDAO{
    private final JPAQueryFactory jpaQueryFactory;

    @Override
    public List<PlayerDTO> getAllPlayers() {
        return jpaQueryFactory.select(
                        QPlayer.player.id,
                        QPlayer.player.backNo,
                        QPlayer.player.playerName,
                        QPlayer.player.ePlayerName,
                        QPlayer.player.nickname,
                        QPlayer.player.joinYyyy,
                        QPlayer.player.POSITION,
                        QPlayer.player.backNo,
                        QPlayer.player.nation,
                        QPlayer.player.birthDate,
                        QPlayer.player.solar,
                        QPlayer.player.height,
                        QPlayer.player.weight,
                        QPlayer.player.teamId
                ).from(QPlayer.player)
                .fetch()
                .stream().map(tuple -> PlayerDTO.builder()
                        .id(tuple.get(QPlayer.player.id))
                        .backNo(tuple.get(QPlayer.player.backNo))
                        .playerName(tuple.get(QPlayer.player.playerName))
                        .ePlayerName(tuple.get(QPlayer.player.ePlayerName))
                        .nickname(tuple.get(QPlayer.player.nickname))
                        .joinYyyy(tuple.get(QPlayer.player.joinYyyy))
                        .POSITION(tuple.get(QPlayer.player.POSITION))
                        .backNo(tuple.get(QPlayer.player.backNo))
                        .nation(tuple.get(QPlayer.player.nation))
                        .birthDate(tuple.get(QPlayer.player.birthDate))
                        .solar(tuple.get(QPlayer.player.solar))
                        .height(tuple.get(QPlayer.player.height))
                        .weight(tuple.get(QPlayer.player.weight))
                        .teamId(tuple.get(QPlayer.player.teamId))
                        .build()).toList();
    }
}


// context