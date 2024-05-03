package com.aws.soccer.schedule.repository;

import com.aws.soccer.schedule.model.QSchedule;
import com.aws.soccer.schedule.model.ScheduleDTO;
import com.querydsl.jpa.impl.JPAQueryFactory;
import lombok.RequiredArgsConstructor;

import java.util.List;

@RequiredArgsConstructor
public class ScheduleDAOImpl implements ScheduleDAO{

    private final JPAQueryFactory factory;

    
    @Override
    public List<ScheduleDTO> getAllSchedule() {
        return factory.select(
                        QSchedule.schedule.id,
                        QSchedule.schedule.stadiumId,
                        QSchedule.schedule.scheDate,
                        QSchedule.schedule.gubun,
                        QSchedule.schedule.hometeamId,
                        QSchedule.schedule.away_score,
                        QSchedule.schedule.home_score,
                        QSchedule.schedule.awayteamId)
                .from(QSchedule.schedule)
                .fetch()
                .stream()
                .map(tuple -> ScheduleDTO.builder()
                        .id(tuple.get(QSchedule.schedule.id))
                        .stadiumId(tuple.get(QSchedule.schedule.stadiumId))
                        .scheDate(tuple.get(QSchedule.schedule.scheDate))
                        .gubun(tuple.get(QSchedule.schedule.gubun))
                        .hometeamId(tuple.get(QSchedule.schedule.hometeamId))
                        .awayScore(tuple.get(QSchedule.schedule.away_score))
                        .homeScore(tuple.get(QSchedule.schedule.home_score))
                        .awayteamId(tuple.get(QSchedule.schedule.awayteamId))
                        .build())
                .toList();
    }
}
