package com.docker.test.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.docker.test.entity.User;

@Repository
public interface UserRepository extends CrudRepository<User, Long> {

}
