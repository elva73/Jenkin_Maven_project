package Bookzy.Bookzy;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.joda.time.LocalTime;

@SpringBootApplication
public class BookzyApplication {

	public static void main(String[] args) {
		SpringApplication.run(BookzyApplication.class, args);
		LocalTime currentTime = new LocalTime();
		System.out.println("The current local time is: " + currentTime);
		Greeter greeter = new Greeter();
		System.out.println(greeter.sayHello());

	}

}
