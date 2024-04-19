package com.collection;// Java Program to demonstrate usage of BlockingQueue

import java.util.concurrent.*;

public class BlockingQueue {

	public static void main(String[] args)
		throws InterruptedException
	{

		// define capacity of ArrayBlockingQueue
		int capacity = 5;

		// create object of ArrayBlockingQueue
		//java.util.concurrent.BlockingQueue<String> queue
		//	= new ArrayBlockingQueue<String>(capacity);

		java.util.concurrent.BlockingQueue<String> queue
				= new LinkedBlockingQueue<String>(capacity);

		// Add elements to ArrayBlockingQueue using put
		// method
		queue.put("StarWars");
		queue.put("SuperMan");
		queue.put("Flash");
		queue.put("BatMan");
		queue.put("Avengers");
		//queue.put("Avengers2");

		// print Queue
		System.out.println("queue contains 1 " + queue);

		// remove some elements
		queue.remove();
		System.out.println("queue contains 2" + queue);
		queue.put("Avengers3");
		queue.remove();
		System.out.println("queue contains 3" + queue);

		// Add elements to ArrayBlockingQueue
		// using put method
		queue.put("CaptainAmerica");
		System.out.println("queue contains 4 " + queue);
		queue.put("Thor");

		System.out.println("queue contains 5" + queue);
	}
}
