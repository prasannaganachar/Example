package com.algorithm;

public class BSTreeExample {

	public int findHeight(Node root) {
		if (root == null)
			return -1;
		return Math.max(findHeight(root.left), findHeight(root.right)) + 1;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Node node = new Node(10);
	}

}
