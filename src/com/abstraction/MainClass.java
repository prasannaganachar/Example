package com.abstraction;
class A33 { }
class B33 extends A33 { }
class C33 extends B33 { }
interface ABC22
{
    void method(A33 a);
}
interface PQR22
{
    void method(B33 b);
}
class M implements ABC22, PQR22
{    
    public void method(A33 a)
    {
        System.out.println(2);
    }
    
    public void method(B33 b) 
    {
        System.out.println(3);
    }
}
public class MainClass
{
    public static void main(String[] args)
    {
        M m = new M();
        
        m.method(new A33());
        
        m.method(new B33());
        
        m.method(new C33());
    }
}