package com.example.demo.main;

import com.example.demo.components.Hinge;
import com.example.demo.components.Differential;

public class Suspension {
    private Hinge hinge;
    private Differential differential;

    public Suspension(Hinge hinge, Differential differential) {
        this.hinge = hinge;
        this.differential = differential;
    }

    @Override
    public String toString() {
        return "Suspension{" +
                "hinge=" + hinge +
                ", differential=" + differential +
                '}';
    }
}


