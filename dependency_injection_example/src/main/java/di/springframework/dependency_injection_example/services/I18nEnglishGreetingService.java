package di.springframework.dependency_injection_example.services;

import org.springframework.stereotype.Service;
import org.springframework.context.annotation.Profile;

@Profile({"EN", "default"})
@Service("i18nService")
public class I18nEnglishGreetingService implements GreetingService{
    @Override
    public String sayGreeting(){
        return "Hello World - EN";
    }
}
