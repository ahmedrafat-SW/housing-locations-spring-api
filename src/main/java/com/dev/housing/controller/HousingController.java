package com.dev.housing.controller;

import com.dev.housing.model.House;
import com.dev.housing.repository.HouseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.Optional;

@RestController
@RequestMapping(path = "api/v1/houses")
@CrossOrigin(origins = "http://localhost:4200")
public class HousingController {

    @Autowired
    private HouseRepository repository;

    @GetMapping(path = "/{id}")
    public Optional<House> getHouse(@PathVariable Long id){
        return repository.findById(id);
    }
    @GetMapping
    public @ResponseBody Iterable<House> getHouses(){
        return repository.findAll();
    }

    @PostMapping
    public House saveHouse(@RequestBody House house){
        return repository.save(house);
    }

    @DeleteMapping(path = "delete/{id}")
    public void deleteHouse(@PathVariable Long id){
        Optional<House> house = repository.findById(id);
        repository.delete(house.get());
    }
}


