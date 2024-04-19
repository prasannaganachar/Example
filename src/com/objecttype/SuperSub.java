package com.objecttype;
class test1 {
    public void Print() {
        System.out.println("Base");
    }         
}
 
class Derived extends test1 {
    public void Print() {
        System.out.println("Derived");
    }
}
 
public class SuperSub {
   /* public static void DoPrint( SuperSub o ) {
        o.Print();   
    }*/
    public static void main(String[] args) {
        SuperSub x = new SuperSub();
        SuperSub y = new SuperSub();
        Derived z = new Derived();
        //DoPrint(x);
        //DoPrint(y);
        //DoPrint(z);
    }
}