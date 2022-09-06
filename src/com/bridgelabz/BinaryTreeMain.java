package com.bridgelabz;

public class BinaryTreeMain {

	public static void main(String[] args) {
		System.out.println("Welcome to binary Search program");
		
		BinarySearchTree binarySearchTree = new BinarySearchTree();
		
		binarySearchTree.root = binarySearchTree.toInsert(binarySearchTree.root, 56);
		binarySearchTree.toInsert(binarySearchTree.root, 30);
		binarySearchTree.toInsert(binarySearchTree.root, 70);
		
		binarySearchTree.toDisplay(binarySearchTree.root);
	}

}
