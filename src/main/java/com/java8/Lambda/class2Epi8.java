package com.java8.Lambda;

public class class2Epi8 {

	public static void main(String[] args) {
		
//		Employee e =  new SE();
		Employee se = () -> "Software Engineer";
		System.out.println(se.getName());
		Employee editor = () -> "Editor";
		System.out.println(editor.getName());
	}
}
