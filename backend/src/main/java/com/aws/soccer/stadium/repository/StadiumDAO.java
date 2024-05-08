package com.aws.soccer.stadium.repository;

import com.aws.soccer.player.model.PlayerDTO;
import com.aws.soccer.stadium.model.StadiumDTO;

import java.util.List;

public interface StadiumDAO {
    List<StadiumDTO> gainAllStadiums();

}
