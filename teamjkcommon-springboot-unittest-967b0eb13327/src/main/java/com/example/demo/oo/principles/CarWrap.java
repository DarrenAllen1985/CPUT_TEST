package com.example.demo.oo.principles;

public class CarWrap {

    private CarName carName;
    private CarColour carColour;

    public CarWrap(String name, String surname) {
        this.carName = new CarName();
        this.carName.setValue(name);

        this.carColour = new CarColour();
        this.carColour.setValue(surname);
    }

    public String getCarName() {
        return carName.getValue();
    }

    public String getCarColour() {
        return carColour.getValue();
    }
}
