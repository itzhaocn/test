package cn.itcast.spring0401.di.constructor;

import java.util.List;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class PersonTest {
	@Test
	public void test(){
		ApplicationContext context = new ClassPathXmlApplicationContext("cn/itcast/spring0401/di/constructor/applicationContext.xml");
		
		Person person = (Person)context.getBean("person");		
	
		System.out.println(person.getPid());
		
		System.out.println(person.getPname());
		
		person.getStudent().say();
	}
}
