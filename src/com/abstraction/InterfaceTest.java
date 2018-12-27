package com.abstraction;
/**
 * o Interfaces are declared with keyword ‘interface‘ and interfaces are implemented by the class using ‘implements‘ keyword.
 * o	Interfaces should contain only abstract methods. Interfaces should not contain a single concrete method.
 * o	Interface can have two types of members.  1) Fields     2) Abstract Methods.
 * o	By default, Every field of an interface is public, static and final (we will discuss about final keyword Later). 
 *     You can’t use any other modifiers other than these three for a field of an interface.
 * o  You can’t change the value of a field once they are initialized. Because they are static and final. Therefore, 
 *     sometimes fields are called as Constants. (We will discuss this feature in detail while covering ‘final’ keyword)
 * o  By default, All methods of an interface are public and abstract.
 * o Like classes, for every interface .class file will be generated after compilation.
 * o  While implementing any interface methods inside a class, that method must be declared as public. Because, 
    according to method overriding rule, you can’t reduce visibility of super class method. By default, 
    every member of an interface is public and while implementing you should not reduce this visibility.
 * o	By default, Interface itself is not public but by default interface itself is abstract like below,
 * o	SIB – Static Initialization Block and IIB – Instance Initialization Block are not allowed in interfaces.
 * o	As we all know that, any class in java can not extend more than one class. But class can implement more than one interfaces. 
 *    This is how multiple inheritance is implemented in java.
 *    


 */
interface InterfaceTest
{
//Some Abstract methods
	int age=10;
	//int getAge();
	//@Override
	//public int hashCode();
}


interface X {
	int getPhoneNo();
}

interface Y extends X {
	int getPhoneNo();
}
class AnyClass implements InterfaceTest
{
//Use 'implements' while implementing Interfaces
//Don't use 'extends'
}

