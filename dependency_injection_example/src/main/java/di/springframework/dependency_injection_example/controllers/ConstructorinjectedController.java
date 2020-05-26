package di.springframework.dependency_injection_example.controllers;

import di.springframework.dependency_injection_example.services.GreetingService;

public class ConstructorinjectedController {
    private final GreetingService greetingService;

    public ConstructorinjectedController(GreetingService greetingService) {
        this.greetingService = greetingService;
    }
    public String getGreeting(){
        return greetingService.sayGreeting();
    }
}
