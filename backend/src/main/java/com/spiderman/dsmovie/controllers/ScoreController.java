package com.spiderman.dsmovie.controllers;

import com.spiderman.dsmovie.dto.Moviedto;
import com.spiderman.dsmovie.dto.Scoredto;
import com.spiderman.dsmovie.entities.Score;
import com.spiderman.dsmovie.services.MovieService;
import com.spiderman.dsmovie.services.ScoreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value="/scores")

public class ScoreController {

    @Autowired
    private ScoreService service;



    @PutMapping
    public Moviedto saveScore(@RequestBody Scoredto dto){

        Moviedto moviedto = service.saveScore(dto);
        return  moviedto;

    }
}