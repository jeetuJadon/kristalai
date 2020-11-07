package com.kristalai.kristalai.model;



public  class  RandomNumberNode{

    Long elementDateMiliSeconds;
    Double number;


    public Double getNumber() {
        return number;
    }

    public void setNumber(Double number) {
        this.number = number;
    }

    public RandomNumberNode(Double number) {
        this.number = number;
        this.elementDateMiliSeconds = System.currentTimeMillis();
    }

    public Long getElementDateMiliSeconds() {
        return elementDateMiliSeconds;
    }

    public void setElementDateMiliSeconds(Long elementDateMiliSeconds) {
        this.elementDateMiliSeconds = elementDateMiliSeconds;
    }


    @Override
    public String toString() {
        return "RandomNumberNode{" +
                "elementAddDate=" + elementDateMiliSeconds +
                ", number=" + number +
                '}';
    }
}