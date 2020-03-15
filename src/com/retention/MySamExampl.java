package com.retention;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
 
@Retention(RetentionPolicy.RUNTIME)
public @interface MySamExampl {
 
    String name();
    String desc();
}
 
class MyAnnTest{
     
    @MySamExampl(name = "test1", desc = "testing annotations")
    public void myTestMethod(){
        //method implementation
    }
}


/*s*/