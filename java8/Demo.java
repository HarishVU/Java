package com.java8;
interface I{
	void show();
	void see();
	default void sea() {	
	}
	default void sh() {}
	static void showw() {
		System.out.println("hi");
	}
}

class A implements I{
	public void show(){
		System.out.println("vela illaya unaku");
	}
	public void see() {}
	public void sea() {}

}
public class Demo {
public static void main(String[] args) {
	I.showw();
	A iu = new A();
	iu.show();
	I ui = new A();
	ui.sea();
	Object obj;
}
}
