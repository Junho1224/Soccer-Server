package com.aws.soccer.stadium.service;

import com.aws.soccer.stadium.repository.StadiumRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class StadiumServiceImpl implements StadiumService {

    private final StadiumRepository repository;

    public List<String> teamField() {return repository.teamField();} //11
    public List<String> manyInfo() {return repository.manyInfo();} //15
    public List<String> bigWin() {return repository.bigWin();} //16
    public List<String> withNoHomeGround() {return repository.withNoHomeGround();} //17
    public List<String> mayStadium() {return repository.mayStadium();} //23
}
