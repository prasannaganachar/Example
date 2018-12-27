package com.collection.singlelist;

public class LinkedList {

	Node head;
	static class Node {
		Integer data;
		Node next;
		
		Node(Integer val) {
			data = val;
			next = null;
		}
	}
	
	public void printList() {
		
		Node current = head;
		while(current != null) {
			System.out.println(current.data);
			current = current.next;
		}
	}
	
	
	public void insertAtFirst(LinkedList list, Node newNode) {
		
		newNode.next = list.head;
		list.head = newNode;
	}
	
	public void insertAfterNode(Node previousNode, Node NewNode) {
		
		if (previousNode == null) {
			return;
		}
		
		NewNode.next = previousNode.next;
		previousNode = NewNode;
	}
	public static void main(String[] args) {
		
		LinkedList list = new LinkedList();
		
		List
		
		list.head = new Node(1);
		Node second = new Node(2);
		Node thired = new Node(3);
		
		list.head.next = second;
		second.next=thired;
		
		list.printList();
		
		System.out.println(" insert first node-----");
		Node firstNode = new Node(10);
		list.insertAtFirst(list, firstNode);
		list.printList();
		
		System.out.println(" insert after a given node-----");
		Node firstNode2 = new Node(15);
		list.insertAfterNode(second,firstNode2);
		list.printList();
		
	}
}
