package com.spiderman.dsmovie.repositories;

import com.spiderman.dsmovie.entities.Movie;
import com.spiderman.dsmovie.entities.Score;
import com.spiderman.dsmovie.entities.ScorePK;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ScoreRepository extends JpaRepository <Score, ScorePK>{
}
