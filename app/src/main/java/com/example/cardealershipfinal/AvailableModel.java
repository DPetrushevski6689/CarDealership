package com.example.cardealershipfinal;

public class AvailableModel {

    private int carImage;
    private String carName;
    private String carEngine;
    private String carOptions;

    public AvailableModel(int carImage, String carName, String carEngine, String carOptions) {
        this.carImage = carImage;
        this.carName = carName;
        this.carEngine = carEngine;
        this.carOptions = carOptions;
    }

    public int getCarImage() {
        return carImage;
    }

    public String getCarName() {
        return carName;
    }

    public String getCarEngine() {
        return carEngine;
    }

    public String getCarOptions() {
        return carOptions;
    }
}
