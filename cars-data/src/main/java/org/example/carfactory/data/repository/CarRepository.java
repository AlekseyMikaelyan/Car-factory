package org.example.carfactory.data.repository;

import org.example.carfactory.data.entity.Car;

import java.util.List;

public interface CarRepository extends AbstractRepository<Car> {
    Car findById(Long id);
    Car findByModel(String model);
    List<Car> findByCarMake(String carMake);
}
