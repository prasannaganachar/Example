package com.algorithm;

public class FindBtreeISBSTree {

	Boolean isBSt(Node node, int minvalue, int maxValue) {
		
		if(node == null)
			return true;
		
		if(node.data < minvalue && node.data > maxValue
			&& isBSt(node.left,minvalue,node.data)
			&& isBSt(node.right,node.data,maxValue))
			return true;
		else 
			return false;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FindBtreeISBSTree fTree = new FindBtreeISBSTree();
		Node node = new Node(1);
		System.out.println(" isBst :" +fTree.isBSt(node, Integer.MIN_VALUE, Integer.MAX_VALUE));
	}
	

}
