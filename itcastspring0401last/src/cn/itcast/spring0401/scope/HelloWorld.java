package cn.itcast.spring0401.scope;

import java.util.ArrayList;
import java.util.List;

public class HelloWorld {
	
	public List<String> s = new ArrayList<String>();
	
	public void say(){
		System.out.println("hello");
	}
	
	public HelloWorld(){
		System.out.println("aaa");
	}
}
