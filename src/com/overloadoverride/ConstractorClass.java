package com.overloadoverride;

public class ConstractorClass {

	/** 
	 * this -> keyword is used to point current instance of class or object
	 * this() -> method is used to call current class constractor 
	 */
	int age;
	String name=null,address=null;
	
	ConstractorClass() {
		System.out.println(" Default Constrctor ");
		
	}
	ConstractorClass(int age) {
		//it is used to invoked current class constructor. 
		
		this();
		System.out.println(" Default Constrctor 123");
		this.age = age;
	}
	ConstractorClass(String name, String address) {
		this.name=name;
		this.address=address;
	}
	
}
