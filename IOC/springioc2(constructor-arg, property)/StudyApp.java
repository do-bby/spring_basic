package exam2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class StudyApp {

	public static void main(String[] args) {
		ApplicationContext factory =
				   new ClassPathXmlApplicationContext("exam2/bean2.xml");
		
		Student s1 = (Student) factory.getBean("st1");
		System.out.println(s1.toString());
		Student s2 = (Student) factory.getBean("st2");
		System.out.println(s2.toString());
		Student s3 = (Student) factory.getBean("st3");
		System.out.println(s3.toString());

	}

}
