package guru.springframework.sfdi;

import guru.springframework.sfdi.config.SfgConfig;
import guru.springframework.sfdi.config.SfgConstructorConfig;
import guru.springframework.sfdi.controllers.*;
import guru.springframework.sfdi.datasources.FakeDataSource;
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

		System.out.println("------------Fake Data Source");
		FakeDataSource fakeDataSource = context.getBean(FakeDataSource.class);
		System.out.println(fakeDataSource.getUsername());
		System.out.println(fakeDataSource.getPass());
		System.out.println(fakeDataSource.getJdbcUrl());

		System.out.println("------------ config Props Bean");
		SfgConfig sfgConfig = context.getBean(SfgConfig.class);
		System.out.println(sfgConfig.getUsername());
		System.out.println(sfgConfig.getPassword());
		System.out.println(sfgConfig.getJdbcUrl());

		System.out.println("------------ constructor Binding");
		SfgConstructorConfig sfgConstructorConfig = context.getBean(SfgConstructorConfig.class);
		System.out.println(sfgConstructorConfig.getUsername());
		System.out.println(sfgConstructorConfig.getPassword());
		System.out.println(sfgConstructorConfig.getJdbcUrl());
    }

}
