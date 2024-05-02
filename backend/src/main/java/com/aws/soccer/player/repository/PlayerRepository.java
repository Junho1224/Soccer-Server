package com.aws.soccer.player.repository;

import com.aws.soccer.player.model.Player;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

//안터페이스는 속성을 가질 수 없음
//클래스가 안보임

@SuppressWarnings("rawtypes")
@Repository
public interface PlayerRepository extends JpaRepository<Player, Long>, PlayerJpqlRepository, PlayerDAO {


   
}
