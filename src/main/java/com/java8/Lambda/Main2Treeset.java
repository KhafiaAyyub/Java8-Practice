package com.java8.Lambda;

import java.util.Set;
import java.util.TreeSet;

public class Main2Treeset {

	public static void main(String[] args) {
		//for order
		Set<Integer> s = new TreeSet<>();
		s.add(22);
		s.add(2);
		s.add(13);
		System.out.println("Before manual sorting : " + s);
		Set<Integer> ss = new TreeSet<Integer>((a,b) -> b-a);
		ss.add(22);
		ss.add(1);
		ss.add(13);
		System.out.println("After manual sorting: "+ ss);
	}
}
