package com.example.car;

public class Suspension {
    private Hinge hinge;

    // Getters and Setters

    public Hinge getHinge() {
        return hinge;
    }

    public void setHinge(Hinge hinge) {
        this.hinge = hinge;
    }

    @Override
    public String toString() {
        return "Suspension [hinge=" + hinge + "]";
    }
}
