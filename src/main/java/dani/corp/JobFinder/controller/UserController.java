package dani.corp.JobFinder.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/users")
public class UserController {

    @GetMapping("/hello")
    public String helloWorld(){
        return "Hello World";
    }
}
