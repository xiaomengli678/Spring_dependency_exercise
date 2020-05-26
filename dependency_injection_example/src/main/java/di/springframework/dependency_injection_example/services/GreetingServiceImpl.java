package di.springframework.dependency_injection_example.services;

public class GreetingServiceImpl implements GreetingService {
    @Override
    public String sayGreeting() {
        return "Hello world";
    }
}
