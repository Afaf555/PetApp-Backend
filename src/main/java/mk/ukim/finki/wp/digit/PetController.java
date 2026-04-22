package mk.ukim.finki.wp.digit;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;
import java.util.List;

@RestController
@RequestMapping("/api/pets")
@CrossOrigin(origins = "http://localhost:4200")
public class PetController {

    @Autowired
    private PetRepository petRepository;

    @GetMapping("/adoption")
    public List<Pet> getAdoptionPets() {
        return petRepository.findByStatus("adoption");
    }

    @GetMapping("/requests")
    public List<Pet> getRequests() {
        return petRepository.findByStatus("request");
    }

    @PostMapping
    public Pet savePet(@RequestBody Pet pet) {
        pet.setCreatedAt(LocalDateTime.now());
        return petRepository.save(pet);
    }
    @Autowired
    private AdoptionRequestRepository adoptionRequestRepository;

    @GetMapping("/adoption-requests")
    public List<AdoptionRequest> getAdoptionRequests() {
        return adoptionRequestRepository.findAll();
    }

    @PostMapping("/adoption-requests")
    public AdoptionRequest saveRequest(@RequestBody AdoptionRequest request) {
        request.setCreatedAt(LocalDateTime.now());
        return adoptionRequestRepository.save(request);
    }
}