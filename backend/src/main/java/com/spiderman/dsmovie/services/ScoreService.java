package com.spiderman.dsmovie.services;


import com.spiderman.dsmovie.dto.Moviedto;
import com.spiderman.dsmovie.dto.Scoredto;
import com.spiderman.dsmovie.entities.Movie;
import com.spiderman.dsmovie.entities.Score;
import com.spiderman.dsmovie.entities.User;
import com.spiderman.dsmovie.repositories.MovieRepository;
import com.spiderman.dsmovie.repositories.ScoreRepository;
import com.spiderman.dsmovie.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service

public class ScoreService {

    @Autowired
    private MovieRepository movierepository;

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private ScoreRepository scoreRepository;

    @Transactional
    public Moviedto saveScore(Scoredto dto){
        User user = userRepository.findByEmail(dto.getEmail());
        if (user == null){
            user = new User();
            user.setEmail(dto.getEmail());
            user = userRepository.saveAndFlush(user);
        }
        Movie movie =movierepository.findById(dto.getMovieId()).get();

        Score score = new Score();
        score.setMovie(movie);
        score.setUser(user);
        score.setValue(dto.getScore());

        score = scoreRepository.saveAndFlush(score);

        double sum= 0.0;
        for (Score s : movie.getScores()){
            sum =sum + s.getValue();
        }

        double avg = sum / movie.getScores().size();

        movie.setScore(avg);
        movie.setCount(movie.getScores().size());
        movie = movierepository.save(movie);

        return new Moviedto(movie);


    }





}
