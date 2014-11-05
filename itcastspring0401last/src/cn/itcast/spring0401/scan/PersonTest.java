package cn.itcast.spring0401.scan;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class PersonTest {
	@Test
	public void test(){
		ApplicationContext context = new ClassPathXmlApplicationContext("cn/itcast/spring0401/scan/applicationContext.xml");
		
		Person person = (Person)context.getBean("person");
		
		person.say();
	}
}
