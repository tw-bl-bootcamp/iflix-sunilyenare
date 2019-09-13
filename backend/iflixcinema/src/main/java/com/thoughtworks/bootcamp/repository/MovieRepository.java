package com.thoughtworks.bootcamp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.thoughtworks.bootcamp.model.Movie;

@Repository
public interface MovieRepository extends JpaRepository<Movie, Long>{

}
