package com.lambda;

import java.util.function.BiFunction;

public class MethodRefrence {
	
	interface Sayable{  
	    void say();
	    
	    public default void sayableTest() {
	    	System.out.println("Test");
	    }
	    
	    public default void sayableTest1() {
	    	System.out.println("Test");
	    }
	} 
	
	interface ExSayable extends Sayable {
		
		@Override
		public default void sayableTest() {
			System.out.println("child nteface");
		}
	}

	interface Addtion {  
	    Integer add(Integer a1,Integer b1,Integer c1);
	    //Integer add(Integer a1,Integer b1);
	} 
	public static void saySomething(){  
        System.out.println("Hello, this is static method.");  
    }  
	
	public static Integer add(Integer a,Integer b) {
		return (a+b);
	}
	
	public static Integer add(Integer a,Integer b, Integer c) {
		return (a+b+c);
	}
	public static void main(String[] args) {
		
		Sayable sayable = MethodRefrence::saySomething;  
        // Calling interface method  
        sayable.say();  
        
        BiFunction<Integer, Integer, Integer> bb = MethodRefrence::add;
        
        System.out.println("Add:"+bb.apply(10, 10));
        
        Addtion addtion = MethodRefrence::add;
        System.out.println(addtion.add(20, 10,10));

	}

}
