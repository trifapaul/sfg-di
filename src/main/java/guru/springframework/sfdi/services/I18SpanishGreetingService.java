package guru.springframework.sfdi.services;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Profile({"ES", "default"})
@Service("i18nService")
public class I18SpanishGreetingService implements  GreetingService{
    @Override
    public String sayGreeting() {
        return "Hola Mundo - ES";
    }
}
