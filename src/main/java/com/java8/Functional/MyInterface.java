package com.java8.Functional;


//@FunctionalInterface
public interface MyInterface {
	//single abstract method
	
	public void sayHello();
	
//	public void sayBye();
	default void sayBye(); 
	
}


// can have only one abstract method
// can have multiple static and default methods
// we can invoke lambda expression here