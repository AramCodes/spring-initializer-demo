package org.skillgrowth.springbootpractice;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class Controller {
    @GetMapping("/")
    public String sayHello(String name) {
        return "Hello World!";
    }
}
