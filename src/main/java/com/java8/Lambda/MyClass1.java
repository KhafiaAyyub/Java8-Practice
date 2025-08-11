package com.java8.Lambda;

import java.util.Comparator;

public class MyClass1 implements Comparator<Integer> {

	@Override
	public int compare(Integer o1, Integer o2) {
		// TODO Auto-generated method stub
		return o2-o1;
	}

}
