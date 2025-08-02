package com.java8.defaultMethods;

//default methods -> come with body - after java8


interface P{
 
	default void sayHello() {
		System.out.println("Hello!!");
	}
}

class C implements P {
	@Override
	public void sayHello() {
		System.out.println("Child says Hello");
	}
}


public class Class1 {
 public static void main(String[] args) {
	C c = new C();
	c.sayHello();
}
}
