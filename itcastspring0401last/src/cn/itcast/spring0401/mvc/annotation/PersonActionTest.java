package cn.itcast.spring0401.mvc.annotation;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class PersonActionTest {
	@Test
	public void test(){
		ApplicationContext context = new ClassPathXmlApplicationContext("cn/itcast/spring0401/mvc/annotation/applicationContext.xml");
		
		PersonAction personAction = (PersonAction)context.getBean("personAction");
		personAction.updatePerson();
	}
}
