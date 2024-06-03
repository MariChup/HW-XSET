package com.example.car;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Application {
    public static void main(String[] args) {
        // XML Configuration
        try (ClassPathXmlApplicationContext contextXml = new ClassPathXmlApplicationContext("applicationContext.xml")) {
            Car carXml = contextXml.getBean(Car.class);
            System.out.println("XML Configured Car: " + carXml);
        }

        // Annotation Configuration
        try (AnnotationConfigApplicationContext contextAnnotation = new AnnotationConfigApplicationContext(CarConfig.class)) {
            Car carAnnotation = contextAnnotation.getBean(Car.class);
            System.out.println("Annotation Configured Car: " + carAnnotation);
        }
    }
}
