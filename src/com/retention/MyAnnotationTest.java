package com.retention;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
 
@Retention(RetentionPolicy.CLASS)
@interface MyAnnotation{
     
    String key();
    String value();
}
 
public class MyAnnotationTest {
	
	String Name;
	int age;
	
	
 
    public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@MyAnnotation(key="site", value="java2novice.com")
    public void myAnnotationTestMethod(){
         
        try {
            Class<? extends MyAnnotationTest> cls = this.getClass();
            Method mth = cls.getMethod("myAnnotationTestMethod");
            MyAnnotation myAnno = mth.getAnnotation(MyAnnotation.class);
            System.out.println("key: "+myAnno.key());
            System.out.println("value: "+myAnno.value());
        } catch (SecurityException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (NoSuchMethodException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
     
    public static void main(String a[]){
         
        MyAnnotationTest mat = new MyAnnotationTest();
        Field []fields =  MyAnnotationTest.class.getDeclaredFields();
        ArrayList<String> fieldList = new ArrayList<String>();
        mat.myAnnotationTestMethod();
    }
}