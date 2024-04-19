package com.algorithm;

import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;

public class BSTree {

	class Node {
		int data;
		Node left;
		Node right;
	}
	
	/*
	 * Follwing operation
	 * 1. Insert
	 * 2. find Height
	 * 3. find Min
	 * 4. Find Max
	 * 5. delete Node1
	 * 6. In order
	 * 7. levelOrder
	 */
	
	public Node insert(Node node, int val) {
		if (node == null) {
			return createNewNode(val);
		}
		
		if (val <= node.data) {
			node.left = insert(node.left, val);
		}
		else if (val > node.data) {
			node.right = insert(node.right,val);
		}
		return node;
	}
	
	public int findHeight(Node root) {
		if (root == null)
			return -1;
		return Math.max(findHeight(root.left), findHeight(root.right)) + 1;
	}
	
	private Node createNewNode(int val) {
		
		Node node  = new Node();
		node.data=val;
		node.left=null;
		node.right=null;
		return node;
	}
	
	
	public Node deleteNode(Node root, int data) {
		
		if (root == null) {
			return null;
		}
		
		if(root.data > data) {
			root.right = deleteNode(root.right,data);
		}
		else if(root.data < data) {
			root.left = deleteNode(root.left, data);
		}
		else {
			// find the data in node
			//1 case no child
			if(root.left == null && root.right == null) {
				//Node1 temp = root;
				root = null;
			}
			else if(root.left == null) {
				Node temp = root;
				root = root.right;
			}
			else if (root.right == null) {
				root = root.left;
			}
			// case 3: 2 children
			else { 
				Node temp = FindMin(root.right);
				root.data = temp.data;
				root.right = deleteNode(root.right,temp.data);
			}
		}
		return root;
	}
	private Node FindMin(Node right) {
		// TODO Auto-generated method stub
		
		while(right.left != null) {
			right = right.left;
		}
		return right;
	}
	
	
	private Node FindMax(Node node) {
		// TODO Auto-generated method stub
		
		while(node.right != null) {
			node = node.right;
		}
		return node;
	}

	void Inorder(Node root) {
		if(root == null) return;
	 
		Inorder(root.left);       //Visit left subtree
		System.out.println(root.data);  //Print data
		Inorder(root.right);      // Visit right subtree
	}
	
	public void levelOrder(Node node) {
		ArrayBlockingQueue<Node> queue = new ArrayBlockingQueue<Node>(10);
		
		queue.add(node);
		System.out.println("level order" +queue.element());
		
		while(!queue.isEmpty()) {
			Node temNode = queue.poll();
			System.out.println(temNode.data);
			if(temNode.left != null) {
				queue.add(temNode.left);
			}
			if(temNode.right != null) {
				queue.add(temNode.right);
			}
		}
	}
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		BSTree bNode = new BSTree();
		Node root = null;
		
		root = bNode.insert(root, 8);
		root = bNode.insert(root, 3);
		root = bNode.insert(root, 9);
		root = bNode.insert(root, 10);
		
		System.out.println(" find height value : "+ bNode.findHeight(root));
		/*bNode.deleteNode(root, 3);
		root = bNode.insert(root, 4);
		root = bNode.insert(root, 20);
		bNode.Inorder(root);
		System.out.println(" find min value : "+ bNode.FindMin(root).data);*/
		//System.out.println(bNode);
		
		bNode.levelOrder(root);

	}

}
