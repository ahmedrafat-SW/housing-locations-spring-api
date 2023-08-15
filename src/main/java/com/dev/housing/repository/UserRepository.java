package com.dev.housing.repository;

import com.dev.housing.model.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User, Long> {

    User findUserByEmail(String email);
}
