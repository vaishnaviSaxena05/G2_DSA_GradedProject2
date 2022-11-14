package com.gl.fsd.Skewedtree;

public class BinarySearchTree {

	public static void main(String[] args) {
		 SkewedbBinaryTree tree = new  SkewedbBinaryTree();
	     tree.node = new Node(50);
	     tree.node.left = new Node(30);
	     tree.node.right = new Node(60);
	     tree.node.left.left = new Node(10);
	     tree.node.right.left = new Node(55);
	    
	     int order = 0;
	     tree.SkewedTree(tree.node, order);
	     System.out.println("The Converted Binary Search Tree Into A Skewed Tree is: ");
	     tree.traverseRightSkewed(tree.headNode);
	}
}
