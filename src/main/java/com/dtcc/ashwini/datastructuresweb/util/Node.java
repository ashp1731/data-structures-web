package com.dtcc.ashwini.datastructuresweb.util;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

// Binary Search tree Example
public class Node {

	private int element;
	public Node leftNode, rightNode;

	public int getElement() {
		return element;
	}

	public void setElement(int element) {
		this.element = element;
	}

	public Node getLeftNode() {
		return leftNode;
	}

	public void setLeftNode(Node leftNode) {
		this.leftNode = leftNode;
	}

	public Node getRightNode() {
		return rightNode;
	}

	public void setRightNode(Node rightNode) {
		this.rightNode = rightNode;
	}
	
	public List<Node> getChildren () {
		if (leftNode == null && rightNode == null) {
			return Collections.EMPTY_LIST;
		} else if (leftNode == null) {
			return Arrays.asList(rightNode);
		} else if (rightNode == null) {
			return Arrays.asList(leftNode);
		}
		return Arrays.asList(rightNode, leftNode);
	}

	public void setChildren(List<Node> children) {
	}

	public Node() {
	}

	public Node(int data) {
		this.element = data;
		leftNode = rightNode = null;
	}

//	public void insert(int value) {
//		if (data != value) {
//			if (value > data) {
//				if (rightNode == null) {
//					rightNode = new Node(value);
//					System.out.println("Right Node " + value + " inserted");
//				} else {
//					rightNode.insert(value);
//				}
//			}
//
//			else if (value < data) {
//				if (leftNode == null) {
//					leftNode = new Node(value);
//					System.out.println("Left Node " + value + " inserted");
//				} else {
//					leftNode.insert(value);
//				}
//			}
//		}
//	}

	public boolean search(int value) {
		if (value == element) {
			return true;
		} else if (value > element && rightNode != null) {
			return rightNode.search(value);
		} else if (value < element && leftNode != null) {
			return leftNode.search(value);
		} else {
			return false;
		}
	}

	public Node searchNode(int value) {
		if (value == element) {
			return this;
		} else if (value > element && rightNode != null) {
			return rightNode.searchNode(value);
		} else if (value < element && leftNode != null) {
			return leftNode.searchNode(value);
		} else {
			return null;
		}
	}

	// LRN (Post Order)
	public void toStringPostOrder() {
		if (leftNode != null) {
			leftNode.toStringPostOrder();
		}
		if (rightNode != null) {
			rightNode.toStringPostOrder();
		}
		System.out.println(element);
	}

	// LNR (In Order)
	public void toStringInOrder() {
		if (leftNode != null) {
			leftNode.toStringPostOrder();
		}
		System.out.println(element);
		if (rightNode != null) {
			rightNode.toStringPostOrder();
		}
	}

	public void clear(Node node) {
		if (node.element == element) {
			if (leftNode != null) {
				System.out.println("Deleting Node : " + leftNode.getElement() );
				leftNode.clear(leftNode);
				leftNode = null;
			}
			
			if(rightNode != null) {
				System.out.println("Deleting Node : " + rightNode.getElement() );
				rightNode.clear(rightNode);
				rightNode = null;
			}
		} else if (rightNode != null && node.element > element) {
			rightNode.clear(node);
			if (rightNode.element == node.element)
				rightNode = null;
		} else if (leftNode != null && node.element < element) {
			leftNode.clear(node);
			if (leftNode.element == node.element)
				leftNode = null;
		}
	}

	public int getHeight() {
		if (element == 0) {
			return 0;
		} else {

			int lHeight = 0;
			int rHeight = 0;

			if (leftNode != null) {
				lHeight = leftNode.getHeight();
			}

			if (rightNode != null) {
				rHeight = rightNode.getHeight();
			}

			return Math.max(lHeight, rHeight) + 1;
		}
	}

	public int getSize() {
		if (element == 0) {
			return 0;
		} else {
			int lSize = 0;
			int rSize = 0;

			if (leftNode != null) {
				lSize = leftNode.getSize();
			}

			if (rightNode != null) {
				rSize = rightNode.getSize();
			}
			return lSize + rSize + 1;
		}
	}
	
	public boolean isEmpty() {
		if(element == 0) {
			return true;
		}
		else {
			if (leftNode == null && rightNode == null) {
				return true;
			}
			else {
				return false;
			}
		}
	}
	
	public Node delete(Node node) {
		
		if(element == 0) {
			return null;
		}
		else {
			
			if(node.getElement() == element) {
				Node newRoot;
				if(leftNode != null)
					newRoot = leftNode;
				else if(rightNode != null)
					newRoot = rightNode;
				else
					newRoot = null;
			}
			else {
				
			}

			return node;
		}
	}
}
