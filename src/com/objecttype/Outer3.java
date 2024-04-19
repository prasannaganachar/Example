package com.objecttype;
interface Anonymous2
{
    public int getValue();
}
public class Outer3 
{
    private int data = 15;
    public static void main(String[] args)
    {
        /*Anonymous inner = new Anonymous()
                {
                    int data = 5;
                    public int getValue()
                    {
                        return data;
                    }
                    public int getData()
                    {
                        return data;
                    }
                };
        Outer3 outer = new Outer3();*/
       // System.out.println(inner.getValue() + inner.getData() + outer.data);
    }
}

/*******************OUTPUT******************
*
*   a) 25
	b) Compilation error
	c) 20
	d) Runtime error
	
	Ans. (b)
	Explanation: the method getData() is undefined in Anonymous class which causes the compilation error.
*/