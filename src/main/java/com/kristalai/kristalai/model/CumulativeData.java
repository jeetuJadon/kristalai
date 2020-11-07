package com.kristalai.kristalai.model;


public  class  CumulativeData{

    Double cumulationValue;

    public String getCumulationDuration() {
        return cumulationDuration;
    }

    public void setCumulationDuration(String cumulationDuration) {
        this.cumulationDuration = cumulationDuration;
    }

    String cumulationDuration;

    public CumulativeData(String cumulationDuration) {
        this.cumulationDuration = cumulationDuration;
    }
    public  CumulativeData(){}

    public Double getCumulationValue() {
        return cumulationValue;
    }

    public void setCumulationValue(Double cumulationValue) {
        this.cumulationValue = cumulationValue;
    }

    @Override
    public String toString() {
        return "CumalativeData{" +
                "cumulationKey='" + cumulationDuration + '\'' +
                ", cumulationValue=" + cumulationValue +
                '}';
    }
}