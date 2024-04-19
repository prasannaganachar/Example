package com.lambda;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/*
 * function interface
 */
interface Executable {
	void execute();
}

interface Sayable{  
    public String say(String name);  
}  

class Runner {
	public void run(Executable e) {
		System.out.println("Executeing code block...");
		e.execute();
	}
}

class Product{  
    int id;  
    String name;  
    float price;  
    public Product(int id, String name, float price) {  
        super();  
        this.id = id;  
        this.name = name;  
        this.price = price;  
    }
    
    public int getId() {  
        return id;  
    }  
    public String getName() {  
        return name;  
    }  
    public float getPrice() {  
        return price;  
    }  
    
	@Override
	public String toString() {
		return "Product [id=" + id + ", name=" + name + ", price=" + price + "]";
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
		
		Executable ex = () -> {
			System.out.println("Firest Lambda Expresssion");
		};
		
		ex.execute();
		
		Sayable sy = name -> "Print " + name;
		
		System.out.println("********************Basic*****************8");
		System.out.println(sy.say("prasanna"));
		
		/************Java Lambda Expression Example: Foreach Loop*****************/
		List<String> list=new ArrayList<String>();  
	        list.add("ankit");  
	        list.add("mayank");  
	        list.add("irfan");  
	        list.add("jai");

	          
	   System.out.println("*****************Java Lambda Expression Example: Foreach Loop***********");
	   list.forEach(n->System.out.println("element:"+n));
	   
	   
	   Runnable r1 = () -> {
		   System.out.println("Runnable interface with lambda");
	   };
	   
	   Thread t1 = new Thread(r1);
	   System.out.println("*******************Runnable Inteface***************");
	   t1.start();
	   
	   
	   List<Product> prdList=new ArrayList<>();  
	   prdList.add(new Product(1,"Samsung A5",17000f));  
	   prdList.add(new Product(3,"Iphone 6S",65000f));  
	   prdList.add(new Product(2,"Sony Xperia",25000f));  
	   prdList.add(new Product(4,"Nokia Lumia",15000f));  
	   prdList.add(new Product(5,"Redmi4 ",26000f));  
	   prdList.add(new Product(6,"Lenevo Vibe",19000f));
	   
	  Stream<Product> stPrd = prdList.stream().filter(p -> p.price > 2000);
	  Optional<Product> opPrd = prdList.stream().max((p1,p2)->(int)p1.price-(int)p2.price);
	  
	  System.out.println(opPrd.get());
	  
	  Collections.sort(prdList, (p1,p2) -> p1.name.compareTo(p2.name));
	  
	  List<Float> collList = prdList.stream().filter(p -> p.price > 2000).map(p ->p.price+2).collect(Collectors.toList());
	  
	  System.out.println(collList);
	  
	  Map<Object, Object> mapPrd = prdList.stream().collect(Collectors.toMap(p -> p.name, p->p.price));
	  
	  System.out.println("Map Res :"+mapPrd);
	  
	  Map<Object, Object> mapPrd2 = prdList.stream().collect(Collectors.toMap(Product::getName,Product::getPrice));
	  
	  System.out.println("Map Res2 :"+mapPrd2);
	  
	  prdList.stream().filter(p -> p.price > 2000).forEach(System.out::println);
	  
	  System.out.println("***************Java Lambda Expression Example: Filter Collection Data*************");
	  stPrd.forEach(p -> System.out.println(p.name +" "+p.price));
	  
	  System.out.println("*********sorting***********");
	  prdList.forEach(p -> System.out.println(p.name +" "+p.price));
       
       

		/*Stream<Integer> numbers = Stream.of(1,2,3,4,5);
		
		List<Integer> list = new ArrayList<Integer>();
		 
        for(int i = 1; i< 10; i++){
            list.add(i);
        }

        Stream<Integer> stream = list.stream();
        stream.forEach(p -> System.out.println(p));
		
		Optional<Integer> intOptional = numbers.reduce((i,j)->{return i*j;});
		if(intOptional.isPresent()) System.out.println("Multiplication = "+intOptional.get()); //120
			/*Runner runner = new Runner();
			runner.run(new Executable() {
				
				@Override
				public void execute() {
					System.out.println(" hello there");
				}
			});
			
			
			System.out.println("===================");
			
			//runner.run()-> {System.out.println("hell there.");};*/

	}

}
