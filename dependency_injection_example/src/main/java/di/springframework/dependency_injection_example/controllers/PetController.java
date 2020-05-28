package di.springframework.dependency_injection_example.controllers;
import org.springframework.stereotype.Controller;
import di.springframework.dependency_injection_example.services.PetService;
@Controller

public class PetController {

    private final PetService petService;

    public PetController(PetService petService) {
        this.petService = petService;
    }

    public String whichPetIsTheBest(){
        return petService.getPetType();
    }
}