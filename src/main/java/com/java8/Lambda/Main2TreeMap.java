package com.java8.Lambda;

import java.util.Map;
import java.util.TreeMap;


public class Main2TreeMap {

	public static void main(String[] args) {
		Map<Integer,String> m = new TreeMap<>();
		m.put(2,"z");
		m.put(3,"f");
		m.put(1,"y");
		System.out.println("Before manual sorting : " + m);
		Map<Integer,String> mm = new TreeMap<>();
		mm.put(2,"z");
		mm.put(3,"f");
		mm.put(1,"y");
		System.out.println("Before manual sorting : " + mm);
	}
}
