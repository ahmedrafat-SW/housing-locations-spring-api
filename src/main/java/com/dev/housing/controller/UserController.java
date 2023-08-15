package com.dev.housing.controller;

import com.dev.housing.model.User;
import com.dev.housing.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.Optional;

@RestController
@RequestMapping(path = "api/v1/users")
@CrossOrigin(origins = "http://localhost:4200/")
public class UserController {

    @Autowired
    private UserRepository repository;

    @PostMapping
    public void  saveUser(@RequestBody User user){
        User u = repository.save(user);
        System.out.println(u);
    }

    @GetMapping(path = "/{id}")
    public Optional<User> getUserByFirstName(@PathVariable Long id){
        return repository.findById(id);
    }

    @GetMapping
    public Iterable<User> getAllUsers(){
        return repository.findAll();
    }

}
