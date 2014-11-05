package cn.itcast.spring0401.initdestroy;

import java.util.ArrayList;
import java.util.List;

public class HelloWorld {
	
	public void say(){
		System.out.println("hello");
	}
	
	public void init(){
		System.out.println("init");
	}
	
	public void destroy(){
		System.out.println("destroy");
	}
	
	public HelloWorld(){
		System.out.println("aaa");
	}
}
