package com.statice;

public class Base {
	
    // Static method in base class which will be hidden in subclass 
    public static void display() {
        System.out.println("Static or class method from Base");
    }
     
     // Non-static method which will be overridden in derived class 
     public void print()  {
         System.out.println("Non-static or Instance method from Base");
    }
     
     public static void print(int a)  {
         System.out.println("Non-static or Instance method from Base");
    }

}

class Derived  extends Base{
	
	Derived() {
		super();
	}
	// Static is removed here (Causes Compiler Error) 
	//public void display() {
   public static void display() {
        System.out.println("Non-static method from Derived");
    }
     
    // Static is added here (Causes Compiler Error) 
    //public static void print() {
    public void print() {
        System.out.println("Static method from Derived");
   }
	
}
