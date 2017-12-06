package com.pongelupe.albunsSpotify.repository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.pongelupe.albunsSpotify.model.User;

@Repository
public interface UserRepository extends CrudRepository<User, Integer> {

	@Query("select u from User u where u.email = ?")
	public User getLogin(String email);
	
}
