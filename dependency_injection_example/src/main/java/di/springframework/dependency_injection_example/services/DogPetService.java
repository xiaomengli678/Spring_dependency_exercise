package di.springframework.dependency_injection_example.services;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Profile({"dog", "default"})
@Service
public class DogPetService implements PetService {
    public String getPetType() {
        return "Dogs are the best!";
    }
}