package org.example.carfactory.data.service.impl;

import org.example.carfactory.data.entity.Car;
import org.example.carfactory.data.repository.CarRepository;
import org.example.carfactory.data.repository.impl.CarRepositoryImpl;
import org.example.carfactory.data.service.CarService;

import java.util.List;

public class CarServiceImpl implements CarService {

    private final CarRepository carRepository = new CarRepositoryImpl();

    @Override
    public void saveOrUpdate(Car car) {
        if (car.getId() == null) {
            long id = findAll().size();
            car.setId(++id);
            carRepository.save(car);
        } else {
            carRepository.update(car);
        }
    }

    @Override
    public Car findById(Long id) {
        return carRepository.findById(id);
    }

    @Override
    public List<Car> findAll() {
        return carRepository.findAll();
    }

    @Override
    public void remove(Long id) {
        carRepository.remove(id);
    }

    @Override
    public Car findByModel(String model) {
        return carRepository.findByModel(model);
    }

    @Override
    public List<Car> findByCarMake(String carMake) {
        return carRepository.findByCarMake(carMake);
    }
}
