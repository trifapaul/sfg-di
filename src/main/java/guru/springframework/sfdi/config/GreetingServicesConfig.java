package guru.springframework.sfdi.config;

import guru.springframework.sfdi.datasources.FakeDataSource;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;
import org.springframework.context.annotation.PropertySource;

//the prop source was Spring config but we can also use Spring Boot config(in application.properties)
//@PropertySource("classpath:datasource.properties")
@ImportResource("classpath:sfgdi-config.xml")
@Configuration
@EnableConfigurationProperties(SfgConstructorConfig.class)
public class GreetingServicesConfig {

    @Bean
    FakeDataSource fakeDataSource(SfgConstructorConfig sfgConfig) {
        FakeDataSource fakeDataSource = new FakeDataSource();
        fakeDataSource.setUsername(sfgConfig.getUsername());
        fakeDataSource.setPass(sfgConfig.getPassword());
        fakeDataSource.setJdbcUrl(sfgConfig.getJdbcUrl());
        return fakeDataSource;
    }

//    @Bean
//    PetServiceFactory petServiceFactory(){
//        return new PetServiceFactory();
//    }
//
//    @Profile({"dog", "default"})
//    @Bean
//    PetService dogPetService(PetServiceFactory petServiceFactory){
//        return petServiceFactory.getPetService("dog");
//    }

//    @Bean
//    @Profile("cat")
//    PetService catPetService(PetServiceFactory petServiceFactory){
//        return petServiceFactory.getPetService("cat");
//    }
//
//    @Profile({"ES", "default"})
//    @Bean("i18nService")
//    I18NSpanishService i18NSpanishService(){
//        return new I18NSpanishService();
//    }
//
//    @Bean
//    EnglishGreetingRepository englishGreetingRepository(){
//        return new EnglishGreetingRepositoryImpl();
//    }
//
//    @Profile("EN")
//    @Bean
//    I18nEnglishGreetingService i18nService(EnglishGreetingRepository englishGreetingRepository){
//        return new I18nEnglishGreetingService(englishGreetingRepository);
//    }
//
//    @Primary
//    @Bean
//    PrimaryGreetingService primaryGreetingService(){
//        return new PrimaryGreetingService();
//    }
//
//    @Bean
//    PropertyInjectedGreetingService propertyInjectedGreetingService(){
//        return new PropertyInjectedGreetingService();
//    }
//
//    @Bean
//    SetterInjectedGreetingService setterInjectedGreetingService(){
//        return new SetterInjectedGreetingService();
//    }
}
