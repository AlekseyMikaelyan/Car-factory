package org.example.carfactory.building.builder;

import org.example.carfactory.data.entity.Car;
import org.example.carfactory.data.service.CarService;
import org.example.carfactory.data.service.impl.CarServiceImpl;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

public final class DataBuilder implements AbstractBuilder {

    private final CarService carService = new CarServiceImpl();

    @Override
    public void buildDataList() {
        for (Map.Entry<String, String> entry : getKeyValueMapByBundleProperties().entrySet()) {

            List<Car> carList1 = new ArrayList<>();

            List<String> list = new ArrayList<>();

            list = Arrays.asList(entry.getValue().split(";"));


            for(int i = 0; i < list.size(); i++) {
                Car car = new Car();
                car.setModel(list.get(i));
                carService.saveOrUpdate(car);
                carList1.add(carService.findByModel(list.get(i)));
            }

            carService.findAll().forEach(car -> {
                System.out.println("Peugeot: " + car.getModel());
            });

        }
    }

    public CarService getCarService() {
        return carService;
    }
}
