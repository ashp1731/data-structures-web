package com.dtcc.ashwini.datastructuresweb.util;

public class BinarySearchTree<E> {

	private Node root;
	
	public Node getRoot() {
		return root;
	}

	public void setRoot(Node root) {
		this.root = root;
	}

	public void insert(Node node, int value) {
		
		if(root == null) {
			root = new Node(value);
		}
		else {
			if(value < node.getElement()) {
				if (node.leftNode == null) {
					node.leftNode = new Node(value);
				} else {
					insert(node.leftNode, value);
				}
			}
			else {
				if (node.rightNode == null) {
					node.rightNode = new Node(value);
				} else {
					insert(node.rightNode, value);
				}
			}
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
		int[] keys = {50,40,60,45,35,20,42,90,110,100,92,10,37};
		
		for(int key : keys){
			tree.insert(root, key);
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
		
		Node parentNode = tree.getParent(tree.getRoot(), 50);
		
		if(parentNode != null)
			System.out.println("Parent Node : " + parentNode.getElement());
		
		// Delete a Node
		System.out.println("\nDeleteing 10");
		tree.deleteNode(tree.getRoot(), 10);
		System.out.println("Post Order after Delete");
		
		System.out.println("\nDeleting 40");
		tree.deleteNode(tree.getRoot(), 40);
		System.out.println("Post Order after Delete");
		// Post Order traversal
		tree.toStringPostOrder();
		System.out.println();
		
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
		return root.getElement();
	}

	private Node searchNode(int i) {
		if (root == null)
			return null;
		return root.searchNode(i);
	}

	public int getSize() {
		if (root == null)
			return 0;
		return root.getSize();
	}

	public int getHeight() {
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
	
	public Node deleteNode(Node node, int value) {
	
		// node is root
		
			if(node == null) {
				return null;
			}
			
			if(value < node.getElement()) {
				node.leftNode = deleteNode(node.leftNode, value);
			}
			else if (value > node.getElement()) {
				node.rightNode = deleteNode(node.rightNode, value);
			}
			else {
				if(node.leftNode == null || node.rightNode == null) {
					
					Node temp = null;
					temp = node.leftNode == null ? node.rightNode : node.leftNode;
					if(temp == null)
						return null;
					else
						if(root.getElement() == value) {
							
							temp = node.leftNode == null ? node.rightNode : node.leftNode;
							root.setElement(temp.getElement());
							node.leftNode = null;
							return root;
						} else {
							return temp;
						}
						
				}
				else {
					// find inOrder Succesor of value node, and replace value node with successor
					if(node.leftNode != null) {
						node = node.leftNode;
						return node;
					}
					else if(node.rightNode != null) {
						node = node.rightNode;
						return node;
					}
					else {
						// both are not null
					}
					return null;
				}
			}

			return node;
	}
	
	private Node getParent(Node node, int value) {
		
		if(node == null) {
			return null;
		}
		
		Node getParent = null;
		while(node != null) {
			
			if(value < node.getElement()) {
				getParent = node;
				node = node.leftNode;
			}
			else if(value > node.getElement()) {
				getParent = node;
				node = node.rightNode;
			}
			else {
				return getParent;
			}
			
		}
		return getParent;
	}
	
	private Node getSuccesor (Node node){
		
		Node temp = node.getRightNode();
		if(temp == null)
			return null;
		
		while(temp.getLeftNode() != null) {
			temp = temp.leftNode;
		}
		return temp;
	}
}

	
	

