package com.aaronkirchhoff.OpenToWander.repositories;

import java.util.List;


import org.springframework.data.repository.CrudRepository;


import org.springframework.stereotype.Repository;

import com.aaronkirchhoff.OpenToWander.models.User;

@Repository
public interface UserRepository extends CrudRepository <User, Long> {
	boolean existsByEmail(String email);
	User findByEmail(String email);
	
	List<User> findAll();


}
