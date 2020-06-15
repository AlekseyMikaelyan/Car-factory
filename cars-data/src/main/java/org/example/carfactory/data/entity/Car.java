package org.example.carfactory.data.entity;

import org.example.carfactory.data.serialnumber.AbleToMakeSerialNumber;

import java.util.UUID;

public class Car extends AbstractData<Car> {
    private String carMake;
    private String model;
    String color;
    int price;

    private class Engine {

        AbleToMakeSerialNumber numberMaker = new AbleToMakeSerialNumber() {
            @Override
            public String makeANumber() {
                return UUID.randomUUID().toString();
            }
        };
        private String serialNumber;

        public Engine(String serialNumber) {
            this.serialNumber = serialNumber;
        }

        Engine engine = new Engine(numberMaker.makeANumber());

    }

    public String getCarMake() {
        return carMake;
    }

    public void setCarMake(String carMake) {
        this.carMake = carMake;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

}
