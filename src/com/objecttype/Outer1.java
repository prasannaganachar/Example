package com.objecttype;
public class Outer1 
{
    public static int temp1 = 1;
    private static int temp2 = 2;
    public int temp3 = 3;
    private int temp4 = 4;
     
    public static class Inner
    {
        private static int temp5 = 5;
         
        private static int getSum()
        {
        	// we can't acces non static variable inside the static method.
           // return (temp1 + temp2 + temp3 + temp4 + temp5);
        	return 1;
        }
    }
     
    public static void main(String[] args)
    {
        Outer1.Inner obj = new Outer1.Inner();
        System.out.println(obj.getSum());
    }
     
}

/*******************OUTPUT*******************
*a) 15
b) 9
c) 5
d) Compilation Error

Ans. (d)
Explanation: static inner classes cannot access non-static fields of the outer class.
*/