package com.dtcc.ashwini.datastructuresweb.util;

import java.util.ArrayList;

public class MyLinkedList<E>{
	
	  private LinkedNode<E> head, tail, node;
	  private int size = 0; // Number of elements in the list

	public static void main(String[] args) {

		MyLinkedList underlyingList = new MyLinkedList();
		underlyingList.add(5);
		underlyingList.add(6);
		underlyingList.add(7);
		underlyingList.add(8);
		
		underlyingList.addFirst(4);
		
		underlyingList.addAt(2,  9);
		underlyingList.show();
		
		System.out.println("\nAfter removing first element");
		underlyingList.removeFirst();
		underlyingList.show();
		
		System.out.println("\nAfter removing specified element");
		underlyingList.removeAt(2);
		underlyingList.show();
		
		System.out.println("\nAfter removing last element");
		underlyingList.removeLast();
		underlyingList.show();
		
	}
	
	public void show() {
		
		LinkedNode<E> node = head;
		System.out.println("Head Node : " + head.getElement());
		while(node.next != null) {
			node = node.next;
			System.out.println(node.getElement() + " " + node.getNext());
		}
		System.out.println("Tail Node : " + tail.getElement());
	}

	public void addFirst(E value) {
		LinkedNode node = new LinkedNode(value);

		
		if(head == null) {
			head = node;
		} else {
			node.next = head;
			head = node;
		}
	}
	
	public void add(E value) {
		
		LinkedNode<E> node = new LinkedNode(value);
		node.next = null;
		
		if(head == null) {
			head = node;
		}
		else {
			LinkedNode<E> n = head;
			while(n.next!= null) {  // Traverse through all nodes until you find null
				n = n.next;
			}
			n.next = node; 
			tail = node;// 
		}
		
		
	}
	
	public void addAt(int index, E value) {
		
		LinkedNode<E> node = new LinkedNode(value);
		node.next = null;
		
		if(index == 0) {
			addFirst(value);
		}
		else {
			LinkedNode<E> n = head;
			for(int i = 0; i < index-1; i++) {
				n = n.next;
			}
			node.next = n.next;
			n.next = node;
		}
	}
	
	public void removeFirst() {
		
		LinkedNode<E> node = head;
		LinkedNode<E> node1 = node.next;
		node.next = null;
		head = node1;
	}
	
	public void removeLast() {
		
		LinkedNode<E> node = head;
		LinkedNode<E> prevNode = head;
		
		while(node.next != null) {
			
			prevNode = node;
			node = node.next;
		}
		
		prevNode.next = null;
		node = null;
		tail = prevNode;

	}
	
	public void removeAt(int index) {
		
		if(index == 0) {
			head = head.next;
		}
		else {
			
			LinkedNode<E> node = head;
			for(int i = 0; i < index-1; i++) {
				node = node.next;
			}
			LinkedNode<E> nextNode = node.next;
			node.next = nextNode.next;
			System.out.println("Deleted Node" + nextNode.getElement());
		}

	}

	
	public LinkedNode<E> getHead() {
		return head;
	}

	public void setHead(LinkedNode<E> head) {
		this.head = head;
	}

	public LinkedNode<E> getTail() {
		return tail;
	}

	public void setTail(LinkedNode<E> tail) {
		this.tail = tail;
	}

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}
	
	
	
}

class LinkedNode<E> {
	
    E element;
    LinkedNode<E> next;

    public LinkedNode(E element) {
      this.element = element;
    }

	public E getElement() {
		return element;
	}

	public void setElement(E element) {
		this.element = element;
	}

	public LinkedNode<E> getNext() {
		return next;
	}

	public void setNext(LinkedNode<E> next) {
		this.next = next;
	}
	
	
}
