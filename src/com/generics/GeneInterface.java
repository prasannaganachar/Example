package com.generics;

import java.util.ArrayList;

/**
 * 1. Only generic classes can implement generic interfaces. 
 *    Normal classes can’t implement generic interfaces. For example, above generic interface can be implemented as,
 * 2. A normal class can implement a generic interface if type parameter of generic interface is a wrapper class. For example, 
 *   below implementation of GenericInterface is legal.
 * 3. Class implementing generic interface at least must have same number and same type of parameters and 
 *    at most can have any number and any type of parameters.
 * 4. You can change the type of parameter passed to generic interface while implementing it. When changed, the class which is 
 *   implementing should have new type as parameter and also,you have to change old type with new type while implementing the methods.
 * 5. Generic interface can have any number of type parameters. Class implementing generic interface at least must have  
 *   same type of parameters and at most can have any number of parameters.
 * 6.Class can implement more than one generic interfaces. If implemented, class should have type parameters of both the interfaces.
 * 7. A generic class can extend a non-generic class.
 * 8. Generic class can also extend another generic class. When generic class extends another generic class, sub class should have 
 *   at least same type and same number of type parameters and at most can have any number and any type of parameters.
 * 9. When generic class extends another generic class, the type parameters are passed from sub class to super class 
 *    same as in the case of constructor chaining where super class constructor is called by sub class constructor by passing 
 *    required arguments. For example, in the below program  ‘T’ in ‘GenericSuperClass’ will be replaced by String.
 * 10.A generic class can extend only one generic class and one or more generic interfaces. Then it’s type parameters should be
 *  union of type parameters of generic class and generic interface(s).
 * 11. Non-generic class can’t extend generic class except of those generic classes which have already pre defined types as their type parameters.
 * 12. Non-generic class can extend generic class by removing the type parameters. i.e as a raw type. But, it gives a warning.
 * 13. While extending a generic class having bounded type parameter, type parameter must be replaced by either upper bound or it’s sub classes.
 * 14. Generic methods of super class can be overrided in the sub class like normal methods.
 */

public class GeneInterface {
	
	
	<T> GeneInterface(T t2) {
		System.out.println(t2);
	}
	//Generic method
	static <T> void printName(T t) {
		System.out.println(t);
	}
	
	
	//Upper Bounder
	static <T extends Number> void printName2(T t) {
		System.out.println(t);
	}
	
	static void processElements(ArrayList<?> a)
	{
		for (Object element : a)
		{
			System.out.println(element);
		}
	}


	class GenClass<V extends Number> {
		V v;
		void setT(V t) {
			v = t;
		}
	    V getT() {
	    	return v;
	    }
	}
	interface GenericInterface<T extends Object>
	{
	    void setT(T t);    
	    T getT();
	}
	
	interface GenericInterfaceWrapper<Integer>
	{
	    void setT(Integer t);    
	    Integer getT();
	}
	
	class gerericClassWrapper implements GenericInterfaceWrapper<Integer> {

		@Override
		public void setT(java.lang.Integer t) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public java.lang.Integer getT() {
			// TODO Auto-generated method stub
			return null;
		}
		
	}
	
	// COMPILE TIME ERROR
	 //class GenericClass implements GenericInterface<T>
	
	
	class GenericClass<V extends Object> implements GenericInterface<V>
	{
	    V t;
	    @Override
	    public void setT(V t)
	    {
	        this.t = t;
	    }
	    @Override
	    public V getT()
	    {
	        return t;
	    }
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GenericClass<Integer> gC = new GeneInterface(10000).new GenericClass<Integer>();
		
		gC.setT(10);
		System.out.println(gC.getT());
	
		GenericClass<Double> gClass = new GeneInterface("prasanna constr").new GenericClass<>();
		gClass.setT(10.10);
		System.out.println(gClass.getT());
		
		GeneInterface.printName(new String("kumar"));
		
		GeneInterface.printName(new java.lang.Integer(20));
		
		GeneInterface.printName2(1020130);
		
		ArrayList<Integer> a1 = new ArrayList<>();

		a1.add(10);

		a1.add(20);

		a1.add(30);
		
		GeneInterface.printName(a1);
		GeneInterface.processElements(a1);

	}

}
