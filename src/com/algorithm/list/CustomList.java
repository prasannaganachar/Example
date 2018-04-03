package com.algorithm.list;

public class CustomList {

	/**
	 * @param args
	 */
	
	Node root;
	public class Node {
		Node next;
		int data;
		
		Node(int n) {
			this.data=n;
			this.next=null;
		}
	}
	
	public void insertAtBeginign(int n) {
		Node node = new Node(n);
		if (root == null) {
			root = node;
			return;
		}
		Node temp = root.next;
		node.next=root;
		root = node;
		
	}
	
	public void insert(int n) {
		
		Node node = new Node(n);
		if (root == null) {
			root = node;
			return;
		}
		Node head = root;
		
		while(head.next != null) {
			head = head.next;
		}
		head.next=node;
		return;
	}
	
	public void display() {
		if (root == null) {
			System.out.println("There is no record");
			return;
		}
		
		Node head = root;
		while(head.next != null) {
			System.out.println(head.data);
			head = head.next;
		}
		System.out.println(head.data);
	}
	
	
	public void deleteAtPostion(int index) {
		if (root == null) {
			return;
		}
		
		Node head = root;
		
		for (int i=0;i<index;i++) {
			if(head.next != null) {
				head = head.next;
			}
			else {
				return ;
			}
			
			if (i+1 == index) {
				
			}
		}
		head.next=head.next.next;
	}
	public void delete(int n) {
		if (root == null) {
			return;
		}
		else if(root.data == n) {
			if (root.next == null) {
				root = null;
			}
			else {
				Node temp = root.next;
				root = temp;
			}
			return;
		}
		else {
			Node head = root;
			while(head.next != null) {
				
				if(head.next.data == n) {
					Node temp = head.next.next;
					head.next= temp;
					return;
				}
				head = head.next;
			}
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CustomList customList = new CustomList();
		customList.insert(10);
		customList.insert(20);
		customList.insert(30);
		customList.insert(40);
		
		customList.display();
		customList.delete(40);
		System.out.println("***********AFTER DELETE 40************");
		customList.insertAtBeginign(15);
		customList.display();
		
		customList.delete(30);
		System.out.println("***********AFTER DELETE 30************");
		customList.display();
		
		customList.delete(10);
		System.out.println("***********AFTER DELETE 10************");
		customList.display();
		
	//	customList.delete(20);
		
		customList.deleteAtPostion(1);
		System.out.println("***********AFTER DELETE 20************");
		customList.display();
		
	}

}
