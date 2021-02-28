package guru.springframework.sfdi.services;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

@Service
@Primary
public class PrimaryGreetingsService implements GreetingService{
    @Override
    public String sayGreeting() {
        return "hello world primary BEAN";
    }
}
