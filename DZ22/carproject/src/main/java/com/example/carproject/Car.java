package com.example.car;

public class Car {
    private Wheel wheel;
    private Engine engine;
    private Suspension suspension;
    private Differential differential;

    // Getters and Setters

    public Wheel getWheel() {
        return wheel;
    }

    public void setWheel(Wheel wheel) {
        this.wheel = wheel;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public Suspension getSuspension() {
        return suspension;
    }

    public void setSuspension(Suspension suspension) {
        this.suspension = suspension;
    }

    public Differential getDifferential() {
        return differential;
    }

    public void setDifferential(Differential differential) {
        this.differential = differential;
    }

    @Override
    public String toString() {
        return "Car [wheel=" + wheel + ", engine=" + engine + ", suspension=" + suspension + ", differential=" + differential + "]";
    }
}
