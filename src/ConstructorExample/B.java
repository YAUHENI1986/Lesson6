package ConstructorExample;

public class B extends A {
	
	public B (String param) {
		super();
		System.out.println("B(.)" + param);
	}
	
	public B () {
		super();
	}

}
