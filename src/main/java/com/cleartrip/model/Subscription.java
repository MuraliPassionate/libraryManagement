package com.cleartrip.model;

public enum Subscription {



    Default(0),Monthly(5),Annual(10);

    private int value;

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    private Subscription(int value){
        this.value=value;
    }
}
