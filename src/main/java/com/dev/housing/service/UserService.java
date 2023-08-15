package com.dev.housing.service;

import com.dev.housing.model.User;
import com.dev.housing.repository.UserRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class UserService {

    private final UserRepository userRepository;

    public boolean isUserValid(String email, String password) {

        User user = userRepository.findUserByEmail(email);
        return user != null && user.getEmail().equals(email);
    }
}
