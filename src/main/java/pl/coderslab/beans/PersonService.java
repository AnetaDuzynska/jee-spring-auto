package pl.coderslab.beans;

import org.springframework.stereotype.Component;

@Component
public class PersonService {
    private PersonRepository personRepo;

//    Jak jest jednoparametrowy konstruktor nie musi być @Autowired
//    @Autowired
    public PersonService(PersonRepository personRepository) {
        this.personRepo = personRepository;
    }

    public PersonRepository getPersonRepo() {
        return personRepo;
    }

    public void setPersonRepo(PersonRepository personRepo) {
        this.personRepo = personRepo;
    }
}
