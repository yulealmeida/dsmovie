package com.spiderman.dsmovie.repositories;

import com.spiderman.dsmovie.entities.Movie;
import com.spiderman.dsmovie.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository <User, Long>{
    User findByEmail (String email);

}
