package exam3;

import java.time.LocalTime;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class GreetingTest {

	public static void main(String[] args) {
		ApplicationContext factory = 
			       new ClassPathXmlApplicationContext("exam3/greet.xml");
		
		LocalTime time = (LocalTime) factory.getBean("Time");
		
		if(time.getHour() >= 6 && time.getHour() < 12) {
			Greeting g = (Greeting) factory.getBean("morning");
			g.greet();
		}
		else if(time.getHour() >= 12 && time.getHour() < 17) {
			Greeting g = (Greeting) factory.getBean("afternoon");
			g.greet();
		}
		else if(time.getHour() >= 17 && time.getHour() < 22) {
			Greeting g = (Greeting) factory.getBean("evening");
			g.greet();
		}
		else{
			Greeting g = (Greeting) factory.getBean("night");
			g.greet();
		}
		((ClassPathXmlApplicationContext)factory).close();
	}
}
