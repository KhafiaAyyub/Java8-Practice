package com.java8.Static;
//static keyword
//contain definition of function - whole body
//cannot override or changed in implementation class

interface A{
	static void sayHello() {
		System.out.println("Hello");
	}
	
	default void sayBye() {
		System.out.println("Bye!!..");
	}
}

public class Class1 implements A{

	public static void main(String[] args) {
		Class1 obj = new Class1();
//		obj.sayHello();  //cannot call
		A.sayHello();
		obj.sayBye();
		
	}
}

//cannot call static method -> obj ref. or from implementation 
//only possible by interface

// we cannot override bcoz they will not be available


