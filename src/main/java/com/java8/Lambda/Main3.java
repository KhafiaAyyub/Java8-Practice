package com.java8.Lambda;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main3 {
	public static void main(String[] args) {
		//custom objects sorting
		Student s1 = new Student(2,"Vipul");
		Student s2 = new Student(3,"Vipul1");
		Student s3 = new Student(44,"Vipul2");
		
		List<Student> li = new ArrayList<Student>();
		li.add(s1);
		li.add(s2);
		li.add(s3);
		Collections.sort(li, (a,b) -> b.id - a.id);
		System.out.println(li);
		
	}

}
