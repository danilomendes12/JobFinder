package dani.corp.JobFinder.controller;

import dani.corp.JobFinder.dto.UserRegisterDTO;
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

    @PostMapping("/")
    public User createUser (@RequestBody UserRegisterDTO body){
        User user = userRepository.save(new User(body.getUsername(), body.getPassword()));
        return user;
    }
}
