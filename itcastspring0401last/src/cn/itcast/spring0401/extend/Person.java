package cn.itcast.spring0401.extend;

public class Person {
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public void say(){
		System.out.println(this.getName());
	}
}
