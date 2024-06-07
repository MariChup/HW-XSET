package com.example.demo;

import com.example.demo.main.Car;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
public class SpringBootDependencyInjectionApplication implements CommandLineRunner {

    @Autowired
    private Car car;

    public static void main(String[] args) {
        SpringApplication.run(SpringBootDependencyInjectionApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        // Java-based configuration
        System.out.println("Java Configuration: " + car);

        // XML-based configuration
        ApplicationContext contextXml = new ClassPathXmlApplicationContext("applicationContext.xml");
        Car carXml = contextXml.getBean(Car.class);
        System.out.println("XML Configuration: " + carXml);

        // XML + Annotation configuration
        ApplicationContext contextXmlAnno = new AnnotationConfigApplicationContext(ApplicationConfig.class);
        Car carXmlAnno = contextXmlAnno.getBean(Car.class);
        System.out.println("XML + Annotation Configuration: " + carXmlAnno);
    }
}
