package com.generics;

import java.util.List;

/*
 * Bounded class
 */
class GenericBoundedClass<T extends Number>    //Declaring Number class as upper bound of T
{
    T t;
    public GenericBoundedClass(T t)
    {
        this.t = t;
    }
    public T getT()
    {
        return t;
    }
    
    //Bounded method
    public static <T extends Number> void printNumbers(T[] t)
    {
        for (int i = 0; i < t.length; i++)
        {
            System.out.println(t[i]);
        }
    }
    
    public void printNumbers1(T[] t)
    {
        for (int i = 0; i < t.length; i++)
        {
            System.out.println(t[i]);
        }
    }
    
    public static <T extends Object & Comparable<? super T>>
       T max(List<? extends T> list, int begin, int end) {
		   T maxElem = list.get(begin);
		    for (++begin; begin < end; ++begin)
		        if (maxElem.compareTo(list.get(begin)) < 0)
		            maxElem = list.get(begin);
		    return maxElem;
   }
}