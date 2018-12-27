package com.objecttype;


interface Anonymous
{
    public int getValue();
}

public class InnerClass {

	private static int data = 10;
	private int data2 = 15;
    private static int LocalClass()
    {
        class Inner
        {
            public int data = 20;
            private int getData()
            {
                return data;
            }
        };
        Inner inner = new Inner();
        return inner.getData();
    }
     
    public static void main(String[] args)
    {
        System.out.println(data * LocalClass());
        
        
        Anonymous inner = new Anonymous()
        {
            int data = 5;
            public int getValue()
            {
                return data;
            }
            /*public int getData()
            {
                return data;
            }*/
        };
        InnerClass outer = new InnerClass();
        System.out.println(inner.getValue() + /*inner.getData() +*/ outer.data);
    }

}
