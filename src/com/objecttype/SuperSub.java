package com.objecttype;
class SuperSub {
    public void Print() {
        System.out.println("Base");
    }         
}
 
class Derived extends SuperSub {    
    public void Print() {
        System.out.println("Derived");
    }
}
 
public class test1 {
    public static void DoPrint( SuperSub o ) {
        o.Print();   
    }
    public static void main(String[] args) {
        SuperSub x = new SuperSub();
        SuperSub y = new Derived();
        Derived z = new Derived();
        DoPrint(x);
        DoPrint(y);
        DoPrint(z);
    }
}