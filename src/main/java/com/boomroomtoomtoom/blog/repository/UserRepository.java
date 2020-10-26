package com.boomroomtoomtoom.blog.repository;

import com.boomroomtoomtoom.blog.entity.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository  extends CrudRepository<User, Integer> {

    User findByUsername(String username);
}
