package org.example.carfactory.data.service;

import org.example.carfactory.data.entity.Car;

import java.util.List;

public interface CarService extends AbstractService<Car> {
    Car findById(Long id);
    Car findByModel(String model);
    List<Car> findByCarMake(String carMake);
}
