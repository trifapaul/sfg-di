package guru.springframework.sfdi.controllers;

import guru.springframework.sfdi.services.GreetingService;
import guru.springframework.sfdi.services.SetterInjectedGreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Controller
public class SetterInjectionController {

    private GreetingService constructorGreetingService;

    @Autowired
    @Qualifier("setterInjectedGreetingService")
    public void setGreetingService(GreetingService constructorGreetingService) {
        this.constructorGreetingService = constructorGreetingService;
    }

    public String getGreeting(){
        return constructorGreetingService.sayGreeting();
    }
}
