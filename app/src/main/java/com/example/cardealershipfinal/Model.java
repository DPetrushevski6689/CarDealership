package com.example.cardealershipfinal;

public class Model {
    private int modelImage;
    private String modelName;

    public Model(int modelImage, String modelName) {
        this.modelImage = modelImage;
        this.modelName = modelName;
    }

    public int getModelImage() {
        return modelImage;
    }

    public String getModelName() {
        return modelName;
    }
}
