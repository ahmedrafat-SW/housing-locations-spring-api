package com.dev.housing.repository;

import com.dev.housing.model.House;
import org.springframework.data.repository.CrudRepository;

public interface HouseRepository extends CrudRepository<House, Long> {

}
