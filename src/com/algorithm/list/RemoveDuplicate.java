package com.algorithm.list;

import java.util.HashSet;

import com.algorithm.list.CustomList.Node;

public class RemoveDuplicate {

	/**
	 * @param args
	 */
	
	public void removeDups(CustomList list) {
		Node root = list.root;
		
		HashSet<Integer> sets = new HashSet<Integer>();
		
		Node prev = null;
		while(root != null) {
			if (sets.contains(root.data)) {
				prev.next = root.next;
			}
			else {
				sets.add(root.data);
				prev=root;
			}
			root=root.next;
		}
	}
	public static void main(String[] args) {
		
		CustomList customList = new CustomList();
		customList.insert(1);
		customList.insert(2);
		customList.insert(1);
		customList.insert(3);
		
		System.out.println("***before remove duplicates*****");
		customList.display();
		RemoveDuplicate removeDuplicate = new RemoveDuplicate();
		removeDuplicate.removeDups(customList);
		System.out.println("***after remove duplicates*****");
		customList.display();
	}

}
