package guru.springframework.sfdi;

import guru.springframework.sfdi.controllers.MyController;
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

    }

}
