package com.example.demo.main;

import com.example.demo.components.Starter;
import com.example.demo.components.SparkPlug;

public class Engine {
    private Starter starter;
    private SparkPlug sparkPlug;

    public Engine(Starter starter, SparkPlug sparkPlug) {
        this.starter = starter;
        this.sparkPlug = sparkPlug;
    }

    @Override
    public String toString() {
        return "Engine{" +
                "starter=" + starter +
                ", sparkPlug=" + sparkPlug +
                '}';
    }
}


