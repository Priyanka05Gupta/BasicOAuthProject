package com.example.OAuth.dao;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.example.OAuth.model.User;

@Repository
public interface UserRepository extends CrudRepository<User, Long> {
	
	  @Query("SELECT u FROM User u WHERE u.username = :username")
	  public User getUserByUsername(@Param("username") String username);

}
