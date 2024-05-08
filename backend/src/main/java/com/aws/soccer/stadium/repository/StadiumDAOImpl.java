package com.aws.soccer.stadium.repository;


import com.aws.soccer.stadium.model.QStadium;
import com.aws.soccer.stadium.model.QStadiumDTO;
import com.aws.soccer.stadium.model.StadiumDTO;
import com.querydsl.core.types.Projections;
import com.querydsl.jpa.impl.JPAQueryFactory;
import lombok.RequiredArgsConstructor;

import java.util.List;


@RequiredArgsConstructor
public class StadiumDAOImpl implements StadiumDAO {

    private final JPAQueryFactory factory;
    private final QStadium stadium = QStadium.stadium;

    @Override
    public List<StadiumDTO> gainAllStadiums() {

        return factory.select(
                new QStadiumDTO(
                        stadium.id,
                        stadium.stadiumId,
                        stadium.stadiumName,
                        stadium.hometeamId,
                        stadium.seatCount,
                        stadium.address,
                        stadium.ddd,
                        stadium.tel))
                .from(QStadium.stadium)
                .orderBy(stadium.stadiumName.asc())
                .offset(1)
                .limit(5)
                .fetch();


    }
}


