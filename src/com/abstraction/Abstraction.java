package com.abstraction;
/**
 * o	Abstract classes and abstract methods are declared using ‘abstract‘ keyword. We can’t 
 *    create objects to those classes which are declared as abstract. But, we can create objects to sub classes of abstract class, 
 *    provided they must implement abstract methods.
 * o	The methods which are not implemented or which don’t have definitions must be declared with ‘abstract’ keyword and 
 *     the class which contains it must be also declared as abstract.
 * o	It is not compulsory that abstract class must have abstract methods. It may or may not have abstract methods. 
 *      But the class which has at least one abstract method must be declared as abstract.
 * o	You can’t create objects to abstract class even though it does not contain any abstract methods.
 * o	Abstract Class can be a combination of concrete and abstract methods.
 * o	Any class extending an abstract class must implement all abstract methods. If it does not implement, 
 *      it must be declared as abstract.
 * o  Inside abstract class, we can keep any number of constructors. If you are not keeping any constructors, 
 *      then compiler will keep default constructor.
 * o  Abstract methods can not be private. Because, abstract methods must be implemented somehow in the sub classes. 
 *     If you declare them as private, then you can’t use them outside the class.
 * o	Constructors and fields can not be declared as abstract.
 * o	Abstract methods can not be static.
 *
 */
public class Abstraction
{
	abstract class AbstractClass
	{
		int age;
		// o	Abstract methods can not be static.
	    abstract void abstractMethod();
	     public AbstractClass() {
			// TODO Auto-generated constructor stub
		}
	     
	     AbstractClass(int page) {
	    	 this.age = page;
	     }
	     
	     final private int getAge() {
	    	 return 0;
	     }
	}

	class ConcreteClass extends AbstractClass
	{
		void abstractMethod()
		{
		     System.out.println("Abstract Method Implemented");
		}
	}
	
	class ConcreteClass2 extends AbstractClass
	{
		void abstractMethod()
		{
		     System.out.println("Abstract Method Implemented2");
		}
		
		public int getAge() {
			return 10;
		}
	}

	interface Test {
		interface test2 {
			String getName();
		}
	}
	
	class interfaceImpl implements Test {
		public String getName() {
			return "prasanna";
		}
	}
	public static void main(String[] args)
	{
		//AbstractClass A = new AbstractClass(); Can't create objects to Abstract class
		
		interfaceImpl intIm = new Abstraction().new interfaceImpl();
		System.out.println("Name:" +intIm.getName());
		ConcreteClass C = new Abstraction(). new ConcreteClass();
		
		ConcreteClass2 C2 = new Abstraction(). new ConcreteClass2();
		//ConcreteClass implements abstract method,
		//so we can create object to ConcreteClass
		AbstractClass A1 = C;
		AbstractClass A2 = C2;
		A1.abstractMethod();
		A2.abstractMethod();
		
		System.out.println("age :" + A2.getAge());
		
		Test t1 = null;
		
		//ConcreteClass object is auto-upcasted to AbsractClass
	}
}

