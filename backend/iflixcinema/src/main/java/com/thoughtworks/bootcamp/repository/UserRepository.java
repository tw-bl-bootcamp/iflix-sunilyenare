package com.thoughtworks.bootcamp.repository;

import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import com.thoughtworks.bootcamp.model.User;

public interface UserRepository extends JpaRepository<User, Long> {
	
	public Optional<User> findByEmail(String email);

}
