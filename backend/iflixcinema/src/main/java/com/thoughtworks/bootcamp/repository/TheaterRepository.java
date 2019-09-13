package com.thoughtworks.bootcamp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.thoughtworks.bootcamp.model.Theater;

@Repository
public interface TheaterRepository extends JpaRepository<Theater, Long> {

}
