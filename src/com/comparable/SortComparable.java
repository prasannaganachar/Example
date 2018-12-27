package com.comparable;

import java.util.Comparator;
import java.util.function.Function;
import java.util.function.ToDoubleFunction;
import java.util.function.ToIntFunction;
import java.util.function.ToLongFunction;

public class SortComparable implements Comparable<SortComparable> {

	int age;
	String name;
	String lastName;
	
	public SortComparable(int age, String name, String lastName) {
		super();
		this.age = age;
		this.name = name;
		this.lastName = lastName;
	}
	
	public int compareTo(SortComparable o) {
		// TODO Auto-generated method stub
		
		return this.age - ((SortComparable) o).getAge();
	}

	@Override
	public String toString() {
		return "SortComparable [age=" + age + ", name=" + name + ", lastName="
				+ lastName + "]";
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	public static Comparator<SortComparable> compartorClass1 = new Comparator<SortComparable>() {

		public int compare(SortComparable o1, SortComparable o2) {
			// TODO Auto-generated method stub
			
			return ((SortComparable) o1).getName().compareTo(((SortComparable) o2).getName());
			
		}
	};
}
