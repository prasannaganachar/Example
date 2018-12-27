package com.lambda;

import java.util.Optional;
import java.util.stream.Stream;

/*
 * function interface
 */
interface Executable {
	void execute();
}

class Runner {
	public void run(Executable e) {
		System.out.println("Executeing code block...");
		e.execute();
	}
}

//()-> System.out.println("hell there.")

//==============return voide --------
//()->  {
// 	System.out.println("hell there.");
//  System.out.println("sec colum.");
// }

//==============return int --------
	/* ()->  {
	 	System.out.println("hell there.");
	  	System.out.println("sec colum.");
	 	return 8;
	 }
 */

//==============return only integer value --------
	/* ()->  8;
	 }
*/

//==============return integer value with parameter --------
	/* (int a)->  8 + a;
	 }
*/


public class App {

	public static void main(String[] args) {

		//Stream<Integer> numbers = Stream.of(1,2,3,4,5);
		
		//Optional<Integer> intOptional = numbers.reduce((i,j)->{return i*j;});
		//if(intOptional.isPresent()) System.out.println("Multiplication = "+intOptional.get()); //120
			/*Runner runner = new Runner();
			runner.run(new Executable() {
				
				@Override
				public void execute() {
					System.out.println(" hello there");
				}
			});*/
			
			
			System.out.println("===================");
			
			//runner.run()-> {System.out.println("hell there.");};

	}

}
