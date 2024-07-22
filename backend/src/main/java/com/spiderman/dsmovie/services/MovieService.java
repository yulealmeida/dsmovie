package com.spiderman.dsmovie.services;


import com.spiderman.dsmovie.dto.Moviedto;
import com.spiderman.dsmovie.entities.Movie;
import com.spiderman.dsmovie.repositories.MovieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service

public class MovieService {

    @Autowired
    private MovieRepository repository;

    @Transactional(readOnly = true)
    public Page<Moviedto> findAll(Pageable pageable) {
        Page<Movie> result= repository.findAll(pageable);
        Page<Moviedto> page = result.map(x -> new Moviedto(x));
        return page;
    }
    @Transactional(readOnly = true)
    public Moviedto findById(Long id) {
        Movie result= repository.findById(id) .get();
        Moviedto dto = new Moviedto(result);
        return dto;
    }

}
