package cn.itcast.spring0401.aop.annotation;

import java.util.List;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
/**
 * 
 * @author Administrator
 *
 */
public class AOPAnnotationTest {
	@Test
	public void test() throws Exception{
		
		ApplicationContext context = new ClassPathXmlApplicationContext("cn/itcast/spring0401/aop/annotation/applicationContext.xml");
		
		PersonDao personDao = (PersonDao)context.getBean("personDao");
		
		List<Person> personList = personDao.getPerson();
		
		System.out.println(personList.size());
	}
}
