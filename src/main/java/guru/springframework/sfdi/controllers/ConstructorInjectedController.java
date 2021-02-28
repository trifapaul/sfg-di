package guru.springframework.sfdi.controllers;

import guru.springframework.sfdi.services.GreetingService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Controller
public class ConstructorInjectedController {

    private final GreetingService constructorGreetingService;


    public ConstructorInjectedController(@Qualifier("constructorGreetingService") GreetingService constructorGreetingService) {
        this.constructorGreetingService = constructorGreetingService;
    }

    public String getGreeting(){
        return constructorGreetingService.sayGreeting();
    }
}
