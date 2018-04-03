package com.comparable;

import java.util.ArrayList;
import java.util.Collections;

public class Main {
	
	static void add() {
		System.out.println("add");
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		//System.out.println("Main");
		Main m1 = new Main();
		m1.add();
		// TODO Auto-generated method stub
		
		ArrayList<SortComparable> list = new ArrayList<SortComparable>();
		
		list.add(new SortComparable(10, "prasanna1","Kumar"));
		list.add(new SortComparable(20, "Kuprasanna2","Kumar"));
		list.add(new SortComparable(15, "Adprasanna3","Kumar"));
		list.add(new SortComparable(70, "ttprasanna4","Kumar"));
		list.add(new SortComparable(8, "Bprasanna5","Kumar"));
		
		SortComparable test1 = new SortComparable(25, "Bprasanna5","Kumar");
		
		System.out.println("list :"+list);

		//LegacyMergeSort
		Collections.sort(list);
		
		System.out.println("sort list:"+list);
		
		Collections.sort(list, SortComparable.compartorClass1);
		
		System.out.println("after cCollections sort list:"+list);
		
		list.sort(SortComparable.compartorClass1);
		
		System.out.println("after compartor sort list:"+list);

	}

}
