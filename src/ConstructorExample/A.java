package ConstructorExample;

public class A {
	
	String value;
	public A () {
		this("Hello World");
	}
	
	public A (String value) {
		this.value = value;
	}

}
