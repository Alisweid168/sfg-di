package guru.springframework.sfgdi;

import guru.springframework.sfgdi.Controllers.ConstructedInjectedController;
import guru.springframework.sfgdi.Controllers.MyController;
import guru.springframework.sfgdi.Controllers.PropertyInjectedController;
import guru.springframework.sfgdi.Controllers.SetterInjectedController;
import org.springframework.boot.ApplicationContextFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SfgDiApplication {

	public static void main(String[] args) {
		ApplicationContext ctx =SpringApplication.run(SfgDiApplication.class, args);

		MyController myController = (MyController) ctx.getBean("myController");

		String greeting = myController.sayHello();

		System.out.println(greeting);

		System.out.println("_____________ Property");
		PropertyInjectedController propertyInjectedController = (PropertyInjectedController) ctx.getBean("propertyInjectedController");
		System.out.println(propertyInjectedController.getGreeting());

		System.out.println("_____________ Setter");
		SetterInjectedController setterInjectedController = (SetterInjectedController) ctx.getBean("setterInjectedController");
		System.out.println(setterInjectedController.getGreeting());

		System.out.println("_____________ Constructor");
		ConstructedInjectedController constructedInjectedController = (ConstructedInjectedController) ctx.getBean("constructedInjectedController");
		System.out.println(constructedInjectedController.getGreeting());


	}

}
