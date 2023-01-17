package exam1;

import java.time.LocalTime;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class GreetingTest {

	public static void main(String[] args) {
		ApplicationContext factory = 
			       new ClassPathXmlApplicationContext("exam1/greet.xml");
		
		LocalTime time = (LocalTime) factory.getBean("Time");
		
		if(time.getHour() >= 6 && time.getHour() < 12) {
			MorningGreetingImpl TT = (MorningGreetingImpl) factory.getBean("morning");
			TT.greet();
		}
		else if(time.getHour() >= 12 && time.getHour() < 17) {
			AfternoonGreetingImpl TT = (AfternoonGreetingImpl) factory.getBean("afternoon");
			TT.greet();
		}
		else if(time.getHour() >= 17 && time.getHour() < 22) {
			EveningGreetingImpl TT = (EveningGreetingImpl) factory.getBean("evening");
			TT.greet();
		}
		else{
			NightGreetingImpl TT = (NightGreetingImpl) factory.getBean("night");
			TT.greet();
		}
		((ClassPathXmlApplicationContext)factory).close();
	}
}
