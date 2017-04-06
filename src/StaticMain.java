
public class StaticMain {

 /**
  * 1. The static method can not use non static data member or call non-static method directly.
  * 2. this and super cannot be used in static context.
  */
   int rollno;  
   String name;  
   static String college ="ITS";  
    
   //if use param name as variable name it will ot set value, due to this will get default value
   //like int varaible is 0, string variable is null, therefore we have to use this keyword
   /*StaticMain(int rollno,String name){  
	   rollno = rollno;  
	   name = name;  
   }  */
   
   StaticMain(int rollno,String name){  
	   this.rollno = rollno;  
	   this.name = name;  
   }  
   void display (){
	   System.out.println(rollno+" "+name+" "+college);
   }  
	 
  //The static method can not use non static data member
   static void change(String val) {
	   college = val;
   }
   
   //static block will executed at the time of class loading before the main method.
   static{
	   System.out.println(" static block");
   }
	 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		StaticMain s1 = new StaticMain(111,"Karan"); 
		s1.display(); 
		
		// if use object/instant will get warring, but will not get any run or compiler error
		s1.change("AIT2");
		
		StaticMain.change("MVJC");
		StaticMain s2 = new StaticMain(222,"Aryan");  
		 s2.display();  
	}

}
