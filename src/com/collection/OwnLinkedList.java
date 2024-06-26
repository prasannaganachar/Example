package com.collection;

public class OwnLinkedList {
	
	private static int counter;
	private Node1 head;
 
	// Default constructor
	public OwnLinkedList() {}
	
	// appends the specified element to the end of this list.
	public void add(Object data) {
 
		// Initialize Node1 only incase of 1st element
		if (head == null) {
			head = new Node1(data);
		}
 
		Node1 crunchifyTemp = new Node1(data);
		Node1 crunchifyCurrent = head;
 
		// Let's check for NPE before iterate over crunchifyCurrent
		if (crunchifyCurrent != null) {
 
			// starting at the head node, crawl to the end of the list and then add element after last node
			/*while (((Object) crunchifyCurrent).getNext() != null) {
				crunchifyCurrent = crunchifyCurrent.getNext();
			}*/
 
			// the last node's "next" reference set to our new node
			crunchifyCurrent.setNext(crunchifyTemp);
		}
 
		// increment the number of elements variable
		incrementCounter();
	}
		
	public Object get(int index)
	// returns the element at the specified position in this list.
	{
		// index must be 1 or higher
		if (index <= 0)
			return null;
		Node1 crunchifyCurrent = null;
		if (head != null) {
			crunchifyCurrent = head.getNext();
			for (int i = 0; i < index; i++) {
				if (crunchifyCurrent.getNext() == null)
					return null;
 
				crunchifyCurrent = crunchifyCurrent.getNext();
			}
			return crunchifyCurrent.getData();
		}
		return crunchifyCurrent;
 
	}
	 
		// removes the element at the specified position in this list.
	public boolean remove(int index) {
 
		// if the index is out of range, exit
		if (index < 1 || index > size())
			return false;
 
		Node1 crunchifyCurrent = head;
		if (head != null) {
			for (int i = 0; i < index; i++) {
				if (crunchifyCurrent.getNext() == null)
					return false;
 
				crunchifyCurrent = crunchifyCurrent.getNext();
			}
			crunchifyCurrent.setNext(crunchifyCurrent.getNext().getNext());
 
			// decrement the number of elements variable
			decrementCounter();
			return true;
 
		}
		return false;
	}
 
	public int size() {
		return getCounter();
	}
	
	private static int getCounter() {
		return counter;
	}
 
	private static void incrementCounter() {
		counter++;
	}
 
	private void decrementCounter() {
		counter--;
	}
	 
}
