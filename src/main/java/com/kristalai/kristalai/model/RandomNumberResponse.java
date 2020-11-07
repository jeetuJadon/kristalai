package com.kristalai.kristalai.model;


import java.util.List;

public  class RandomNumberResponse{

    public  RandomNumberResponse(){
    }

    private List<Double> generatedNumbers;
    private  List<CumulativeData> cumulativeData;

    public List<CumulativeData> getCumulativeData() {
        return cumulativeData;
    }

    public void setCumulativeData(List<CumulativeData> cumulativeData) {
        this.cumulativeData = cumulativeData;
    }

    public List<Double> getGeneratedNumbers() {
        return generatedNumbers;
    }

    public void setGeneratedNumbers(List<Double> generatedNumbers) {
        this.generatedNumbers = generatedNumbers;
    }

    @Override
    public String toString() {
        return "RandomNumberResponse{" +
                "generatedNumbers=" + generatedNumbers +
                ", cumulativeData=" + cumulativeData +
                '}';
    }
}