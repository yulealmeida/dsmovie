package com.spiderman.dsmovie.controllers;

import com.spiderman.dsmovie.dto.Moviedto;
import com.spiderman.dsmovie.entities.Movie;
import com.spiderman.dsmovie.services.MovieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value="/movies")

    public class MovieController {

@Autowired
    private MovieService service;


    @GetMapping
    public Page<Moviedto> findAll(Pageable pageable){
        return service.findAll(pageable);

    }
    @GetMapping (value = "/{id}")
    public Moviedto findById(@PathVariable Long id){
        return service.findById(id);

    }
}
