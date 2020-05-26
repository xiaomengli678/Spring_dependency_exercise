package di.springframework.dependency_injection_example.controllers;

import di.springframework.dependency_injection_example.services.GreetingService;

public class PropertyInjectedController {
    public GreetingService greetingService;

    public String getGreeting(){
        return greetingService.sayGreeting();
    }
}
