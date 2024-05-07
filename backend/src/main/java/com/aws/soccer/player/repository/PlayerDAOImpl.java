package com.aws.soccer.player.repository;

import com.aws.soccer.player.model.PlayerDTO;
import com.aws.soccer.player.model.QPlayer;
import com.aws.soccer.player.model.QPlayerDTO;
import com.querydsl.jpa.impl.JPAQueryFactory;
import lombok.RequiredArgsConstructor;

import java.util.List;

@RequiredArgsConstructor
public class PlayerDAOImpl implements PlayerDAO{

    private final JPAQueryFactory jpaQueryFactory; // DSL 프레임워크에서 EM을 사용하기 위함. JPA 를 따라야함. DSL 에서 사용하기 위한 EM

    QPlayer player = QPlayer.player;

    @Override
    public List<PlayerDTO> gainAllPlayers() {
        return  jpaQueryFactory.select(
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
                        player.weight
                )).from(player).fetch();
    }

    @Override
    public List<String> gainPlayerPositionType() {
        return jpaQueryFactory.select(player.POSITION).distinct()
                .from(player)
                .orderBy(player.POSITION.desc())
                .offset(0)//페이지 번호
                .limit(5)//페이지당 보여질 개수
                .fetch();
    }

    @Override
    public List<String> gainPlayerPositionTypeNull() {
        return jpaQueryFactory.select(player.POSITION
                        .when("").then("신입").otherwise(player.POSITION).as("position")
                ).distinct()
                .from(player)
                .fetch();
    }

    @Override
    public List<String> gainPlayerNameByPositionAndRegion(String teamId, String position) {
        return jpaQueryFactory.select(player.playerName)
                .from(player)
                .where(player.teamId.eq(teamId).and(player.POSITION.eq(position)))
                .fetch();
    }

    @Override
    public List<String> gainPlayersByFirstNameAndHeight(String teamId, String playerName,String height) {
        return jpaQueryFactory.select(player.playerName)
                .from(player)
                .where(player.teamId.eq(teamId).and(player.playerName.like("playerName%").and(player.height.goe(height))))
                .fetch();
    }
}


// context