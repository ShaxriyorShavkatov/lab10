package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.core.env.Environment;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class DemoApplication {
    
    @Autowired
    private Environment environment;
    
    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }
    
    @GetMapping("/current-profile")
    public String getCurrentProfile() {
        return "Active profiles: " + String.join(", ", environment.getActiveProfiles());
    }
    
    @Bean
    public void demonstrateGenericContainer() {
        com.example.demo.util.GenericContainer<String> stringContainer = new com.example.demo.util.GenericContainer<>("Hello");
        System.out.println("String container value: " + stringContainer.getValue());
        
        com.example.demo.util.GenericContainer<Integer> intContainer = new com.example.demo.util.GenericContainer<>(42);
        System.out.println("Integer container value: " + intContainer.getValue());
        
        com.example.demo.model.Person person = com.example.demo.factory.PersonFactory.createDefaultPerson();
        com.example.demo.util.GenericContainer<com.example.demo.model.Person> personContainer = 
            new com.example.demo.util.GenericContainer<>(person);
        System.out.println("Person container name: " + personContainer.getValue().getName());
    }
}

