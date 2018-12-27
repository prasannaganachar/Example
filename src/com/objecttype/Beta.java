package com.objecttype;
class Alpha
{
    public String type = "a ";
    public Alpha() {  System.out.print("alpha "); }
}
 
public class Beta extends Alpha
{
    public Beta()  {  System.out.print("beta ");  }
 
    void go()
    {
        type = "b "; // its overriding super type also
        System.out.print(this.type + super.type);
    }
 
    public static void main(String[] args)
    {
        new Beta().go();
    }
}

/************OUTPUT*************
* alpha beta b b 
*/