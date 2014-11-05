package cn.itcast.spring0401.di.annotation;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class PersonTest {
	@Test
	public void test(){
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("cn/itcast/spring0401/di/annotation/applicationContext.xml");
		Person person = (Person)context.getBean("person");
		person.say();
		context.close();
	}
}
