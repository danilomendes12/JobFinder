package dani.corp.JobFinder.controller;

import dani.corp.JobFinder.model.User;
import dani.corp.JobFinder.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/users")
public class UserController {

    @Autowired
    UserRepository userRepository;

    @GetMapping("/hello")
    public String helloWorld(){
        return "Hello World";
    }

    @PostMapping("/create")
    public User createUser (@RequestBody String body){
        User user = userRepository.save(new User("teste", "teste"));
        return user;
    }
}
