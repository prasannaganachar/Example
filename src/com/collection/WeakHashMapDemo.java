package com.collection;
// Java program to illustrate 
// WeakHashmap 
import java.util.*;
class WeakHashMapDemo
{
    public static void main(String args[])throws Exception
    {
        WeakHashMap m = new WeakHashMap();
        Demo1 d = new Demo1();
         
        // puts an entry into WeakHashMap
        m.put(d," Hi "); 
        System.out.println(m);
         
        d = null;
         
        // garbage collector is called
        System.gc(); 
         
        // thread sleeps for 4 sec
        Thread.sleep(4000); 
         
        System.out.println(m);
    }
}
 
class Demo1
{
    public String toString()
    {
        return "demo";
    }
     
    // finalize method
    public void finalize()
    {
        System.out.println("finalize method is called");
    }
}
