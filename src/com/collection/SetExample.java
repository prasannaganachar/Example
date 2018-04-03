package com.collection;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetExample {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<ClassA> set = new HashSet<ClassA>();
		
		for(int i=0;i<100;i++) {
			set.add(new ClassA("Name"));
		}
		System.out.println(set.size());
		System.out.println("Contains:"+set.contains(new ClassA("Name")));

	}

}
