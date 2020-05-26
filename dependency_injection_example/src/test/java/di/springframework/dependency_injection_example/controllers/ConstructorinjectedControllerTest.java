package di.springframework.dependency_injection_example.controllers;

import di.springframework.dependency_injection_example.services.GreetingServiceImpl;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ConstructorinjectedControllerTest {

    ConstructorinjectedController controller;

    @BeforeEach
    void setUp() {
        controller = new ConstructorinjectedController(new GreetingServiceImpl());
    }

    @Test
    void getGreeting() {
        System.out.println(controller.getGreeting());
    }
}