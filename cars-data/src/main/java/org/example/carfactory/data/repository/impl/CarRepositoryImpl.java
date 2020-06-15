package org.example.carfactory.data.repository.impl;

import org.example.carfactory.data.entity.Car;
import org.example.carfactory.data.repository.CarRepository;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class CarRepositoryImpl implements CarRepository {
    private final List<Car> carList = new ArrayList<>();

    @Override
    public void save(Car car) {
        carList.add(car);
    }

    @Override
    public Car findById(Long id) {
        return carList
                .stream()
                .filter(car -> car.getId().equals(id))
                .findFirst()
                .orElse(null);
    }

    @Override
    public List<Car> findAll() {
        return carList;
    }

    @Override
    public void update(Car car) {
        carList.forEach(currentCar -> {
            if (car.getId().equals(currentCar.getId())) {
                currentCar.setCarMake(car.getCarMake());
                currentCar.setModel(car.getModel());
                currentCar.setColor(car.getColor());
                currentCar.setPrice(car.getPrice());
            }
        });
    }

    @Override
    public void remove(Long id) {
        carList.removeIf(car -> car.getId().equals(id));
    }

    @Override
    public Car findByModel(String model) {
        return carList
                .stream()
                .filter(car -> car.getModel().equals(model))
                .findFirst()
                .orElse(null);
    }

    @Override
    public List<Car> findByCarMake(String carMake) {
        return carList
                .stream()
                .filter(car -> car.getCarMake().equals(carMake))
                .collect(Collectors.toList());
    }
}
