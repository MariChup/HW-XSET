package com.example.car;

public class Engine {
    private Starter starter;
    private SparkPlug sparkPlug;
    private Accumulator accumulator;

    // Getters and Setters

    public Starter getStarter() {
        return starter;
    }

    public void setStarter(Starter starter) {
        this.starter = starter;
    }

    public SparkPlug getSparkPlug() {
        return sparkPlug;
    }

    public void setSparkPlug(SparkPlug sparkPlug) {
        this.sparkPlug = sparkPlug;
    }

    public Accumulator getAccumulator() {
        return accumulator;
    }

    public void setAccumulator(Accumulator accumulator) {
        this.accumulator = accumulator;
    }

    @Override
    public String toString() {
        return "Engine [starter=" + starter + ", sparkPlug=" + sparkPlug + ", accumulator=" + accumulator + "]";
    }
}

