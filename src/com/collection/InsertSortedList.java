package com.collection;

public class InsertSortedList {

	Node head = null;
	class Node {
		Node next = null;
		Integer data;
		
		Node(Integer val) {
			data = val;
			next = null;
		}
	}
	
	public Node NewNode(Integer val) {
		Node node = new Node(val);
		
		return node;
	}
	
	public void sortedNode(Node newnode) {
		
		 Node current;
		 
         /* Special case for head node */
         if (head == null || head.data >= newnode.data)
         {
        	 newnode.next = head;
            head = newnode;
         }
         else {
 
            /* Locate the node before point of insertion. */
            current = head;
 
            while (current.next != null &&
                   current.next.data < newnode.data)
                  current = current.next;
 
            newnode.next = current.next;
            current.next = newnode;
         }

	}
	
	public void printList() {
		Node current = head;
		while(current.next != null) {
			System.out.println(current.data);
			current = current.next;
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("starting.........");
		InsertSortedList insertSortedList = new InsertSortedList();
		Node n1 = insertSortedList.NewNode(1);
		insertSortedList.sortedNode(n1);
		
		Node n2 = insertSortedList.NewNode(5);
		insertSortedList.sortedNode(n2);
		
		Node n3 = insertSortedList.NewNode(8);
		insertSortedList.sortedNode(n3);
		
		Node n4 = insertSortedList.NewNode(2);
		insertSortedList.sortedNode(n4);
		
		insertSortedList.printList();

	}

}
