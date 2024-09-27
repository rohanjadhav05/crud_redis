package com.example.Redis.Repository;

import org.springframework.data.repository.CrudRepository;

import com.example.Redis.Entity.User;

public interface UserRepository extends CrudRepository<User, String>{

}
