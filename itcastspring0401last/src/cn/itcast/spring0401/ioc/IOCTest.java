package cn.itcast.spring0401.ioc;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * 控制反转
 * @author Administrator
 *
 */
public class IOCTest {
	/**
	 * 启动spring容器
	 * 		创建spring容器对象就相当于启动spring容器
	 * spring容器做的工作：
	 *   * 创建对象
	 */
	@Test
	public void testHelloWorld(){
		ApplicationContext  context = new ClassPathXmlApplicationContext("cn/itcast/spring0401/ioc/applicationContext.xml");
		HelloWorld helloWorld = (HelloWorld)context.getBean("helloWorld");
		helloWorld.say();
	}
}
