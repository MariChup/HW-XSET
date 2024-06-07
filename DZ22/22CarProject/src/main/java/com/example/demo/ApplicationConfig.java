package com.example.demo;

import com.example.demo.components.*;
import com.example.demo.main.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ApplicationConfig {

    @Bean
    public Hinge hinge() {
        return new Hinge();
    }

    @Bean
    public Differential differential() {
        return new Differential();
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
    public Wheel wheel() {
        return new Wheel();
    }

    @Bean
    public Accumulator accumulator() {
        return new Accumulator();
    }

    @Bean
    public Suspension suspension(Hinge hinge, Differential differential) {
        return new Suspension(hinge, differential);
    }

    @Bean
    public Engine engine(Starter starter, SparkPlug sparkPlug) {
        return new Engine(starter, sparkPlug);
    }

    @Bean
    public Car car(Wheel wheel, Engine engine, Accumulator accumulator, Suspension suspension) {
        return new Car(wheel, engine, accumulator, suspension);
    }
}
