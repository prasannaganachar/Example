package com.thread;

import java.util.Random;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

public class CallableEx {

	/**
	 * @param args
	 * @throws ExecutionException 
	 * @throws InterruptedException 
	 */
	public static void main(String[] args) throws InterruptedException, ExecutionException {
		// TODO Auto-generated method stub
		
		
		
		class Claable implements Callable<Integer> {

			@Override
			public Integer call() throws Exception {
				// TODO Auto-generated method stub
				
				Random random = new Random();
				
				Integer genInteger = random.nextInt(50);
				
				//Thread.sleep(genInteger * 1000);
				
				System.out.println(genInteger);
				return genInteger;
			}
			
		}
		
		FutureTask[] randomNumberTasks = new FutureTask[5];
		 
	    for (int i = 0; i < 5; i++)
	    {
	      Callable callable = new Claable();
	 
	      // Create the FutureTask with Callable
	      randomNumberTasks[i] = new FutureTask(callable);
	 
	      // As it implements Runnable, create Thread
	      // with FutureTask
	      Thread t = new Thread(randomNumberTasks[i]);
	      t.start();
	    }
	 
	    for (int i = 0; i < 5; i++)
	    {
	      // As it implements Future, we can call get()
	      System.out.println(randomNumberTasks[i].get());
	 
	      // This method blocks till the result is obtained
	      // The get method can throw checked exceptions
	      // like when it is interrupted. This is the reason
	      // for adding the throws clause to main
	    }
		Claable claable = new Claable();
		try {
			claable.call();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
