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
		Set<StringBuffer> set1 = new HashSet<>();
		set1.add(new StringBuffer("test"));
		set1.add(new StringBuffer("test234"));
		
		System.out.println(set1);
		
		Set<StringBuffer> str = new TreeSet<>(); 
        str.add(new StringBuffer("Sohan")); 
        str.add(new StringBuffer("Raja")); 
        str.add(new StringBuffer("Harish")); 
        str.add(new StringBuffer("Ram")); 
        System.out.println(str); 
		
		for(int i=0;i<100;i++) {
			set.add(new ClassA("Name"));
		}
		System.out.println(set.size());
		System.out.println("Contains:"+set.contains(new ClassA("Name")));

	}

}
