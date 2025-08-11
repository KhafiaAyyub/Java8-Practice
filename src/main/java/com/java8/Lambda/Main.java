package com.java8.Lambda;

public class Main {

	public static void main(String[] args) {
		
		//1.
//		MyClass myClass = new MyClass();
//		Thread thread = new Thread(myClass);
//		thread.run();
		
		//2.
//		MyClass myClass = new MyClass();
//		Thread Cthread = new Thread(myClass);
//		Cthread.run();	
//		for(int i=1;i<=10;i++) {
//			System.out.println("Bye"+i);
//		}
		
		//3.
		Runnable runnable = () -> {
			for(int i=0;i<=10;i++) {
				System.out.println("Hello"+ i);
			}
		};
		
		Thread childThread = new Thread(runnable);
		childThread.run();
		
		
	}
}
