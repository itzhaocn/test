package cn.itcast.spring0401.createbean;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class CreateBeanTest {
	/**
	 * 在HelloWorld中写如下代码
	 * 		public HelloWorld(){
				System.out.println("new helloworld");
			}
			输出为："new helloworld"
		说明
		   *  spring容器默认调用类的默认的构造器来创建对象的
		   *  如果在HelloWorld中，没有默认的构造器，则spring在创建helloWorld对象时，会报错
		      因为找不到默认的构造器
	 */
	@Test
	public void testConstructor(){
		ApplicationContext context = new ClassPathXmlApplicationContext("cn/itcast/spring0401/createbean/applicationContext.xml");
		
		HelloWorld helloWorld = (HelloWorld)context.getBean("helloWorld");
		helloWorld.say();
	}
	/**
	 * spring容器做的事情：
	 *    *  spring容器调用了工厂类的工厂方法
	 *    *  真正创建对象new HelloWorld()是由程序员来完成的
	 */
	@Test
	public void testFactory(){
		ApplicationContext context = new ClassPathXmlApplicationContext("cn/itcast/spring0401/createbean/applicationContext.xml");
		
		HelloWorld helloWorld = (HelloWorld)context.getBean("helloWorld1");
		helloWorld.say();
	}
}
