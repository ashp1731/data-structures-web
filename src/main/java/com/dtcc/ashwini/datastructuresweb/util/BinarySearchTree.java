package com.dtcc.ashwini.datastructuresweb.util;

public class BinarySearchTree {

	private Node root;
	
	
	public Node getRoot() {
		return root;
	}

	public void setRoot(Node root) {
		this.root = root;
	}

	public static  Node insert(Node root, int value) {
		
		if(root == null) {
			return new Node(value);
		}
		else {
			if(value < root.getData()) {
				root.leftNode = insert(root.leftNode, value);
				System.out.println("inserting Left Node : " + value);
			}
			else {
				root.rightNode = insert(root.rightNode, value);
				System.out.println("Inserting Right Node : " + value);
			}
			return root;
		}
	}
	
	public void clear () {
		if (root != null) {
			root.clear(root);
			root = null;
		}
	}
	
	public boolean isEmpty () {
		if (root == null) {
			return true;
		}
		return root.isEmpty();
	}
	
	
	public static void main(String[]args) {
		BinarySearchTree tree = new BinarySearchTree();
		Node root = null;
		
		// Inserting Nodes into Tree
		int[] keys = {50,40,60,45,35,20,42,90,110,100,92,10};
		
		for(int key : keys){
			root = insert(root, key);
			if(tree.getRoot() == null)
			tree.setRoot(root);
			
			tree.root.leftNode = root.leftNode;
			tree.root.rightNode = root.rightNode;
		}

		
		// Search Node
		System.out.println(tree.search(100));
		System.out.println();
		
		System.out.println("Post Order");
		// Post Order traversal
		tree.toStringPostOrder();
		System.out.println();
		
		System.out.println("In Order");
		// In Order Traversal
		tree.toStringInOrder();
		
		// Depth of Binary Tree
		int depth = tree.getHeight();
		System.out.println("Depth of Tree : " + depth);
		
		// Size of Binary Tree
		System.out.println("Size of Tree : " + tree.getSize());
		
//		// Clear the Tree
//		root.clearStatic(root.searchNode(100));
		tree.clear();
		System.out.println("******************************************");
		// In Order Traversal
		tree.toStringInOrder();
		
		// Size of Binary Tree
		System.out.println("Size of Tree : " + tree.getSize());
		
//		 Check if the tree is empty
		System.out.println( "\nNode " + tree.getData() + " is Empty? " + tree.isEmpty());
	}

	private int getData() {
		if (root == null)
			return -1;
		return root.getData();
	}

	private Node searchNode(int i) {
		if (root == null)
			return null;
		return root.searchNode(i);
	}

	private int getSize() {
		if (root == null)
			return 0;
		return root.getSize();
	}

	private int getHeight() {
		if (root == null)
			return 0;
		return root.getHeight();
	}

	private void toStringInOrder() {
		if (root != null)
			root.toStringInOrder();
	}

	private void toStringPostOrder() {
		if (root != null)
			root.toStringPostOrder();
		
	}

	private boolean search(int i) {
		if (root == null)
			return false;
		// TODO Auto-generated method stub
		return root.search(i);
	}
}
	
	

