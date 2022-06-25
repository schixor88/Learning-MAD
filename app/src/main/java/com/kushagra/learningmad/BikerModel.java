package com.kushagra.learningmad;

public class BikerModel {
    String bikerName;
    String bikeModel;
    String bikeNumber;
    String gender;

    public BikerModel(String bikerName, String bikeModel, String bikeNumber, String gender) {
        this.bikerName = bikerName;
        this.bikeModel = bikeModel;
        this.bikeNumber = bikeNumber;
        this.gender = gender;
    }

    public String getBikerName() {
        return bikerName;
    }

    public void setBikerName(String bikerName) {
        this.bikerName = bikerName;
    }

    public String getBikeModel() {
        return bikeModel;
    }

    public void setBikeModel(String bikeModel) {
        this.bikeModel = bikeModel;
    }

    public String getBikeNumber() {
        return bikeNumber;
    }

    public void setBikeNumber(String bikeNumber) {
        this.bikeNumber = bikeNumber;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }
}
