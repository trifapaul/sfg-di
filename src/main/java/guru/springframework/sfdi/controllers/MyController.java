package guru.springframework.sfdi.controllers;

import org.springframework.stereotype.Controller;

@Controller
public class MyController {
    public String sayHello() {
        System.out.println("Ellou world");

        return "Hi folks";
    }
}
