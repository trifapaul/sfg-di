package guru.springframework.sfdi.controllers;

import guru.springframework.sfdi.services.GreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Controller
public class PropertyInjectedController {

    @Qualifier("propertyInjectedGreetingService")
    @Autowired
    public GreetingService constructorGreetingService;

    public String getGreeting(){
        return constructorGreetingService.sayGreeting();
    }
}
