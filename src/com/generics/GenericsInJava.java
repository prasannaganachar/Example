package com.generics;

import java.util.ArrayList;
import java.util.List;

public class GenericsInJava
{
	
    public static void main(String[] args)
    {
    	NonGenericClass ng = new NonGenericClass(new String("prasanna"));
        NonGenericClass.genericMethod(new Integer(123));     //Passing Integer type as an argument 
        
        NonGenericClass.genericMethod("I am string");        //Passing String type as an argument
        
        NonGenericClass.genericMethod(new Double(25.89));    //Passing Double type as an argument
        
        //*********************BOUNDED TYPE***************
        System.out.println("************BOUNDED TYPE **********");
        GenericBoundedClass<Double> g1 = new GenericBoundedClass<Double>(123.45);
        System.out.println("bounded type va;ue:" + g1.getT());
        
        GenericBoundedClass.printNumbers(new Integer[] {new Integer(10), new Integer(20), new Integer(30), new Integer(40)} );
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(10);
        list.add(8);
        list.add(20);
        list.add(18);
        list.add(11);
        list.add(87);
        System.out.println("max el:"+GenericBoundedClass.max(list, 0,6));
        
        //*****************88WILD CARD EXAMPLE************
        
        System.out.println("**********WILD CARD TESTING********");
        WildCardGene wc = new WildCardGene();
        ArrayList<Integer> a1 = new ArrayList<>();
        a1.add(10);
        a1.add(20);
        a1.add(30);
        WildCardGene.processElements(a1);
        //Arraylist containing strings
        ArrayList<String> a2 = new ArrayList<>();
        a2.add("One");
        a2.add("Two");
        a2.add("Three");
        WildCardGene.processElements(a2);
        
        //********************
        ArrayList<Object> test = new ArrayList<Object>();
        ArrayList<String> strObj = new ArrayList<String>();
        
        List l1 = test;
        
        //strObj = test;
        //test = strObj;
    }
}