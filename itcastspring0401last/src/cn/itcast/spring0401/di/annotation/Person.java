package cn.itcast.spring0401.di.annotation;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;

@Scope(value="prototype")
public class Person {
	@Qualifier
	@Autowired
	@Resource(name="s")
	private Student studen;
	
	public void say(){
		this.studen.say();
	}
	
	@PostConstruct
	public void init(){
		System.out.println("init");
	}
	
	@PreDestroy
	public void destroy(){
		System.out.println("destroy");
	}
}
