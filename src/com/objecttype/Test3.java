package com.objecttype;
class Test3 {
    public static void main(String[] args) {
    	
    	// Case 1 :
    	/*
    	 * for(int i = 0; 1; i++) {
	            System.out.println("Hello");
	            break;
	        }
	        ###########OUTPUT#########
	        Compiler Error
    	 */
    	
    	/* Case 2:
    	 *  ################OUTPUT############
    	 *  Hello (only once)
    	 */
        for(int i = 0; true; i++) {
            System.out.println("Hello");
            break;
        }
        
        /* Case 3:
         * System.out.println(fun());
         * ##############OUTPUT###########
         * Compiler Error
         */
        
        
    }
    
    static int fun() {
    	int x= 0;
        return ++x;
        //return 20;
    } 
    
    
}
