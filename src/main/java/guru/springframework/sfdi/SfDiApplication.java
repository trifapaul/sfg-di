package guru.springframework.sfdi;

import guru.springframework.sfdi.controllers.*;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SfDiApplication {

    public static void main(String[] args) {

    	ApplicationContext context = SpringApplication.run(SfDiApplication.class, args);

		MyController controller = (MyController) context.getBean("myController");

		I18nController i18nController = (I18nController) context.getBean("i18nController");
		System.out.println(i18nController.sayHello());

		System.out.println("Primary Bean");
		System.out.println(controller.sayHello());

		System.out.println("----------Property");

		PropertyInjectedController propertyInjectedController = (PropertyInjectedController) context.getBean("propertyInjectedController");


		System.out.println(propertyInjectedController.getGreeting());

		System.out.println("----------Setter");

		SetterInjectionController setterInjectionController = (SetterInjectionController) context.getBean("setterInjectionController");

		System.out.println(setterInjectionController.getGreeting());

		System.out.println("----------Contructor");

		ConstructorInjectedController constructorInjectedController = (ConstructorInjectedController) context.getBean("constructorInjectedController");

		System.out.println(constructorInjectedController.getGreeting());
    }

}
