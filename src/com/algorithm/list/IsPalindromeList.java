package com.algorithm.list;

import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.LinkedList;

import org.apache.log4j.Logger;

public class IsPalindromeList {

	static Logger log = Logger.getLogger(IsPalindromeList.class.getName());
	public Boolean isPalindrome(CustomList list) {
		
		//1. revers and compare both the list 
		CustomList node = new CustomList();
		
		com.algorithm.list.CustomList.Node root = list.root;
		com.algorithm.list.CustomList.Node head = root;
		while(root != null) {
			node.insertAtBeginign(root.data);
			root=root.next;
		}
		
		System.out.println("************reveres***********");
		node.display();
		
		com.algorithm.list.CustomList.Node revNode = node.root;
		while(head != null && revNode != null) {
			if(head.data != revNode.data) {
				return false;
			}
			head = head.next;
			revNode = revNode.next;
		}
		
		return true;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashMap<Integer,Integer> test = new HashMap<>();
		CustomList customList = new CustomList();
		customList.insert(1);
		customList.insert(2);
		customList.insert(1);
		customList.insert(3);
		
		customList.display();
		
		IsPalindromeList isPalindromeList = new IsPalindromeList();
		System.out.println("is palndrom : " +isPalindromeList.isPalindrome(customList));
		
		log.debug("Hello this is a debug message");
	    log.info("Hello this is an info message");

	}

}
