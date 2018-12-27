package com.objecttype;
public class Outer4
{
    private int data = 10;
     
    class Inner
    {
        private int data = 20;
        private int getData()
        {
            return data;
        }
        public void main(String[] args)
        {
            Inner inner = new Inner();
            System.out.println(inner.getData());
             
        }
    }
    private int getData()
    {
        return data;
    }
    public static void main(String[] args)
    {
        Outer4 outer = new Outer4();
        Outer4.Inner inner = outer.new Inner();
        System.out.printf("%d\n", outer.getData());
        inner.main(args);
    }
}

/*****************OUTPUT******************
a) 2010
b) 1020
c) Compilation Error
d) None of these

Ans. (b)
Explanation: Inner class defined above though, have access to the private variable data of the Outer class, but declaring a variable data inside an in
ner class makes it specific to the Inner class with no conflicts in term of variable declaration. For more see Shadowing
*/