package cn.itcast.spring0401.scan;

import javax.annotation.Resource;

import org.springframework.stereotype.Component;
/**
 * @Component=<bean id="student" class="..Student">
 * @author Administrator
 *
 */
@Component
public class Student {
	@Resource(name="ss")
	private String ss;
	public void say(){
		System.out.println("student");
	}
}
