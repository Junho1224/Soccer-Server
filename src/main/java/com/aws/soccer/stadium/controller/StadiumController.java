package com.aws.soccer.stadium.controller;


import com.aws.soccer.stadium.service.StadiumServiceImpl;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@CrossOrigin(origins = "*", allowedHeaders = "*")
@RequiredArgsConstructor
@RequestMapping(path = "/api/stadium")
@RestController
public class StadiumController {

    private final StadiumServiceImpl service;


    @GetMapping("/teamfield")
    public List<String> teamField(){
        return service.teamField();
    }
    @GetMapping("/manyinfo")
    public List<String> manyInfo(){
        return service.manyInfo();
    }
//    @GetMapping("/bigwin")
//    public List<String> bigWin(){
//        return service.bigWin();
//    }
    @GetMapping("/withnohomeground")
    public List<String> withNoHomeGround(){
        return service.withNoHomeGround();
    }
    @GetMapping("/maystadium")
    public List<String> mayStadium(){
        return service.mayStadium();
    }





}
