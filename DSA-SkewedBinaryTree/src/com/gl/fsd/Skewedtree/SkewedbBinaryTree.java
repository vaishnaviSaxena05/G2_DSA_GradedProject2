package com.gl.fsd.Skewedtree;

public class SkewedbBinaryTree {
	public Node node;
	public Node prevNode = null;
	public Node headNode = null;

	public void SkewedTree(Node root,int order) {
		if (root==null) {
			return;
		}
		if (order>0) {
			SkewedTree(root.right,order);
		}else {
			SkewedTree(root.left,order);
		}
		Node rightNode =root.right;
		Node leftNode = root.left;

		if(headNode==null) {

			headNode=root;

			root.left=null;

			prevNode=root;

		}else {
			prevNode.right =root;
			root.left = null;
			prevNode = root;
		}  if (order > 0) {
			SkewedTree(leftNode, order);
		} else {
			SkewedTree(rightNode, order);
		}

	}
	public void traverseRightSkewed(Node root) {
		if (root == null) {
			return;
		}
		
		System.out.print(root.value + " " );
		
		traverseRightSkewed(root.right);
	}
}
