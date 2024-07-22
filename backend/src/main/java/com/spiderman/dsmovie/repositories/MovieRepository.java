package com.spiderman.dsmovie.repositories;

import com.spiderman.dsmovie.entities.Movie;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MovieRepository extends JpaRepository <Movie , Long>{
}
