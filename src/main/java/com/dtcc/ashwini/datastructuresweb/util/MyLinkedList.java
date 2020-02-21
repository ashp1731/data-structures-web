package com.dtcc.ashwini.datastructuresweb.util;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class MyLinkedList<E> {

	private LinkedNode<E> head, tail, node;
	private int size = 0; // Number of elements in the list
//	private MyLinkedList underlyingList = new MyLinkedList();

	public static void main(String[] args) {

		MyLinkedList underlyingList = new MyLinkedList();
		underlyingList.addLast(5);
		underlyingList.addLast(6);
		underlyingList.addLast(7);
		underlyingList.addLast(8);

		underlyingList.addFirst(4);

		underlyingList.addAt(2, 9);
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
		while (node.next != null) {
			node = node.next;
			System.out.println(node.getElement() + " " + node.getNext());
		}
		System.out.println("Tail Node : " + tail.getElement());
	}

	public void addFirst(E value) {
		LinkedNode<E> node = new LinkedNode<>(value);

		if (head == null) {
			head = node;
		} else {
			node.next = head;
			head = node;
		}
	}

	public void addLast(E value) {

		LinkedNode<E> node = new LinkedNode<>(value);
		node.next = null;

		if (head == null) {
			head = node;
		} else {
			LinkedNode<E> n = head;
			while (n.next != null) { // Traverse through all nodes until you find null
				n = n.next;
			}
			n.next = node;
			tail = node;//
		}

	}

	public void addAt(int index, E value) {

		LinkedNode<E> node = new LinkedNode(value);
		node.next = null;

		if (index == 0) {
			addFirst(value);
		} else {
			LinkedNode<E> n = head;
			for (int i = 0; i < index - 1; i++) {
				n = n.next;
			}
			node.next = n.next;
			n.next = node;
		}
	}

	public LinkedNode removeFirst() {

		LinkedNode<E> node = head;
		LinkedNode<E> node1 = node.next;
		node.next = null;
		head = node1;
		return node;
	}

	public LinkedNode removeLast() {

		LinkedNode<E> node = head;
		LinkedNode<E> prevNode = head;

		while (node.next != null) {

			prevNode = node;
			node = node.next;
		}

		prevNode.next = null;
//		node = null;
		tail = prevNode;
		return node;
	}

	public LinkedNode removeAt(int index) {

		if (index == 0) {
			head = head.next;
			return head;
		} else {

			LinkedNode<E> node = head;
			for (int i = 0; i < index - 1; i++) {
				node = node.next;
			}
			LinkedNode<E> nextNode = node.next;
			node.next = nextNode.next;
			System.out.println("Deleted Node" + nextNode.getElement());
			return nextNode;
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
	
	public LinkedNode() {
	}

	public LinkedNode(E element) {
		this.element = element;
	}

	public E getElement() {
		return element;
	}

	public void setElement(E element) {
		this.element = element;
	}
	
	public String getName () {
		return String.valueOf(element);
	}
	
	public LinkedNode<E> getNext() {
		return next;
	}

	public List<LinkedNode<E>> getChildren() {
		return next == null? Collections.EMPTY_LIST:Arrays.asList(next);
	}

	public void setChildren(List<LinkedNode<E>> array) {
		
	}
	public void setNext(LinkedNode<E> next) {
		this.next = next;
	}

}
