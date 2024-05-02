package com.aws.soccer.player.repository;

import com.aws.soccer.player.model.Player;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


@SuppressWarnings("rawtypes")
@Repository
public interface PlayerRepository extends JpaRepository<Player, Long> , PlayerJpqlRepository, PlayerEM {

}
