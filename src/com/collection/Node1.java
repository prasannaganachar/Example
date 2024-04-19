package com.collection;

public class Node1 {
	// reference to the next node in the chain, or null if there isn't one.
	Node1 next;

	// data carried by this node. could be of any type you need.
	Object data;

	// Node1 constructor
	public Node1(Object dataValue) {
		//next = null;
		data = dataValue;
	}

	// another Node1 constructor if we want to specify the node to point to.
	@SuppressWarnings("unused")
	/*public Node1(Object dataValue, Node1 nextValue) {
		next = nextValue;
		data = dataValue;
	}*/

	// these methods should be self-explanatory
	public Object getData() {
		return data;
	}

	@SuppressWarnings("unused")
	public void setData(Object dataValue) {
		data = dataValue;
	}

	public Node1 getNext() {
		return next;
	}

	public void setNext(Node1 nextValue) {
		next = nextValue;
	}
	
}
