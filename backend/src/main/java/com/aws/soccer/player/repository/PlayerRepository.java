package com.aws.soccer.player.repository;

import com.aws.soccer.player.model.Player;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;



public interface PlayerRepository extends JpaRepository<Player, Long>, PlayerJpqlRepository, PlayerDAO {

}
