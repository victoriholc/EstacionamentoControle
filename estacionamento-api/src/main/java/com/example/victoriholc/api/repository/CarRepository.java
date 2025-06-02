package com.example.victoriholc.api.repository;

import com.example.victoriholc.api.model.Car;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CarRepository extends JpaRepository<Car, String> {
    List<Car> findByOwnerId(String ownerId);
}