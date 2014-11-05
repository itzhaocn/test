package cn.itcast.spring0401.extend;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class StudentTest {
	@Test
	public void test(){
		ApplicationContext context = new ClassPathXmlApplicationContext("cn/itcast/spring0401/extend/applicationContext.xml");
		
		Student student = (Student)context.getBean("student");
		
		student.say();
	}
}
