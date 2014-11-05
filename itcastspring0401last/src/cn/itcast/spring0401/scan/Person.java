package cn.itcast.spring0401.scan;

import javax.annotation.Resource;

import org.springframework.stereotype.Component;
/**
 * @Component=<bean id="person" class="..Person">
 * @Component("p")=<bean id="p" class="..Person">
 * @author Administrator
 *
 */
@Component
public class Person {
	@Resource(name="student")
	private Student student;
	
	public void say(){
		this.student.say();
	}
}
