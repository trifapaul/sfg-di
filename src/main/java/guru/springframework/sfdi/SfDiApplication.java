package guru.springframework.sfdi;

import guru.springframework.sfdi.controllers.ConstructorInjectedController;
import guru.springframework.sfdi.controllers.MyController;
import guru.springframework.sfdi.controllers.PropertyInjectedController;
import guru.springframework.sfdi.controllers.SetterInjectionController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SfDiApplication {

    public static void main(String[] args) {

    	ApplicationContext context = SpringApplication.run(SfDiApplication.class, args);

		MyController controller = (MyController) context.getBean("myController");

		String greeting = controller.sayHello();
		System.out.println(greeting);

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
