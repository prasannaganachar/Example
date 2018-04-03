package com.comparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;

public class SortEmployee implements Comparable<SortEmployee>{

	String name;
	Integer age;
	Date dob;
	
	public SortEmployee() {
		// TODO Auto-generated constructor stub
	}
	
	public SortEmployee(String name,int age,Date dob) {
		this.name=name;
		this.age=age;
		this.dob=dob;
	}
	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<SortEmployee> list = new ArrayList<SortEmployee>();
		
		list.add(new SortEmployee("darshan", 32, new Date(2017 - 1900, 04, 30)));
		list.add(new SortEmployee("Prasanna", 12, new Date(2016 - 1900, 04, 30)));
		list.add(new SortEmployee("suresh", 20, new Date(2017 - 1900, 07, 30)));
		list.add(new SortEmployee("raju", 50, new Date(2015 - 1900, 04, 30)));
		list.add(new SortEmployee("mahesha", 38, new Date(2014 - 1900, 04, 30)));
		list.add(new SortEmployee("zerro", 42, new Date(2013 - 1900, 04, 30)));
		
		
		System.out.println(list);
		
		Collections.sort(list);
		System.out.println("*****************AFTER SORT ************");
		System.out.println(list);
		//SortEmployee s1 = new SortEmployee("orasanna", 32, new Date(2017, 04, 30));

	}

	@Override
	public int compareTo(SortEmployee o) {
		
		return o.name.compareTo(this.name) + o.age.compareTo(this.age) + o.dob.compareTo(this.dob);
		
		//return this.name.compareTo(o.name) + this.age.compareTo(o.age) +this.dob.compareTo(o.dob);
	}
	
	public String toString() {
		return String.format("name : %s age : %s Dob : %s\n",this.name,this.age,this.dob);
		//return "name : " + this.name + " age :"+this.age + " Dob :"+this.dob;
	}

}
