package com.objecttype;

  
// This class contains an instance of Tes
class Test1 {    
    Test3 t1 = new Test3();   
  
    Test1(int i) { t1 = new Test3(); } 
  
    public static void main(String[] args) {    
         Test1 t2 = new Test1(5);
    }
}

class Test2 {   
    Test2(int x) {
        System.out.println("Constructor called " + x);
    }
}

/******************OUTPut**********
*
*	Constructor called 10
*	Constructor called 5
*
*/