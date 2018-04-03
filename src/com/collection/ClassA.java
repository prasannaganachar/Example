package com.collection;


public class ClassA {

	String name;
	
	ClassA(String name1) {
		this.name=name1;
	}
	public boolean equals(ClassA othobj) {
		 return this.name.equals(othobj.name);
	  }

	  public final int hashcode() {
		  //return 1;
		  //return (int) Math.round(Math.random());
		  return this.name.hashCode();
	  }
}
