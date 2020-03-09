package com.vscode.microsoftinit;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(DemoApplication.class, args);

		// Dependency injection prevents hardcoding objects with tnew. Spring will "find" the necessary object..
		Alien a = context.getBean(Alien.class);
		// a spring container is called a "spring bean". Scopes: Singleton, OR prototype
		// Alien is not a bean unless setup as one.. you specify which objects are beans or not.
		// You must mark Alien class as a @Component. IT will create A1 object as Spring container which can be used
		// as a bean to get.

		// By default, Spring uses Singleton Design Pattern. Objects are created once, whether called or not!
		a.show();

		// Second object, will be created if scope is prototype. Else defaults to singleton and will re-use same as a.
		//Alien a2 = context.getBean(Alien.class);
		//a2.show();

	}

}
