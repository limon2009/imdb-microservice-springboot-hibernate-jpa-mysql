package com.imdb.user.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.imdb.user.model.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long>{

}
