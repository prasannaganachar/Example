package com.algorithm;

public class BSTree {

	class Node {
		int data;
		Node left;
		Node right;
	}
	
	
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
				//Node temp = root;
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

	void Inorder(Node root) {
		if(root == null) return;
	 
		Inorder(root.left);       //Visit left subtree
		System.out.println(root.data);  //Print data
		Inorder(root.right);      // Visit right subtree
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
		//root = bNode.insert(root, 10);
		
		bNode.deleteNode(root, 3);
		root = bNode.insert(root, 4);
		root = bNode.insert(root, 20);
		bNode.Inorder(root);
		System.out.println(" find min value : "+ bNode.FindMin(root).data);
		//System.out.println(bNode);

	}

}
