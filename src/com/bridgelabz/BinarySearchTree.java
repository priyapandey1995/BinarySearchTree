package com.bridgelabz;
/**
 * 
 * @author pande
 *
 */

public class BinarySearchTree {
	/**
	 * 
	 */

	Node root;
	/**
	 * In this class all the operations are performed for binary tree
	 * Firstly root node is created of type Node
	 * 
	 * later on,methods like toAddNode and display are performed
	 */
	
	public Node toInsert(Node node ,int data) {
		if(node == null) {
			Node newNode = new Node(data);
			node = newNode;
			return node;
		}else if( data <= node.data) {
			node.left = toInsert(node.left,data);
			return node;
		}else {
			node.right = toInsert(node.right , data);
			return node;
		}
		
		
		
	}
	
	public void toDisplay(Node root) {
		if(root == null) {
			return;
		}else {
			toDisplay(root.left);
			System.out.println(root.data + " " );
			toDisplay(root.right);
		}
	}
}
