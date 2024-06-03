package com.example.car;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class CarConfig {

    @Bean
    public Wheel wheel() {
        return new Wheel();
    }

    @Bean
    public Starter starter() {
        return new Starter();
    }

    @Bean
    public SparkPlug sparkPlug() {
        return new SparkPlug();
    }

    @Bean
    public Accumulator accumulator() {
        return new Accumulator();
    }

    @Bean
    public Engine engine() {
        Engine engine = new Engine();
        engine.setStarter(starter());
        engine.setSparkPlug(sparkPlug());
        engine.setAccumulator(accumulator());
        return engine;
    }

    @Bean
    public Hinge hinge() {
        return new Hinge();
    }

    @Bean
    public Suspension suspension() {
        Suspension suspension = new Suspension();
        suspension.setHinge(hinge());
        return suspension;
    }

    @Bean
    public Differential differential() {
        return new Differential();
    }

    @Bean
    public Car car() {
        Car car = new Car();
        car.setWheel(wheel());
        car.setEngine(engine());
        car.setSuspension(suspension());
        car.setDifferential(differential());
        return car;
    }
}

