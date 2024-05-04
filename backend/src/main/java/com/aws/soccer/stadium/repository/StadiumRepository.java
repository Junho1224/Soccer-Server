package com.aws.soccer.stadium.repository;

import com.aws.soccer.stadium.model.Stadium;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StadiumRepository extends JpaRepository<Stadium, Long>, StadiumJpqlRepository {
}
