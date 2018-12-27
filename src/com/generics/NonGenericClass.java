package com.generics;
class NonGenericClass
{    
	public <T> NonGenericClass(T t1)
    {
        T t2 = t1;
        
        System.out.println(t2);
    }
    static <T> void genericMethod(T t1)
    {
        T t2 = t1;
        
        System.out.println(t2);
    }
    
    class GenericSuperClass<T>
    {
        T t;
        /*public GenericSuperClass(T t)
        {
            this.t = t;
        }*/
    }
    class GenericSubClass<T> extends GenericSuperClass<T>
    {
        public GenericSubClass(T t)
        {
            //super(t);
        }
    }
}