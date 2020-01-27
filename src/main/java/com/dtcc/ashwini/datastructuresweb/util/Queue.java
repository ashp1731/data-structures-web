	package com.dtcc.ashwini.datastructuresweb.util;

import java.util.ArrayList;

public class Queue {

	private ArrayList<String> myQueue = new ArrayList<String>();

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Queue queue = new Queue();

		queue.enqueue("Ashwini");
		queue.enqueue("Amogh");
		queue.enqueue("Saanvi");
		queue.enqueue("Sahana");

		for (int i = 0; i < queue.myQueue.size(); i++) {
			System.out.println("Index : " + i + " " + queue.myQueue.get(i));
		}

		queue.dequeue();
		System.out.println("\nAfter Dequeue");
		for (int i = 0; i < queue.myQueue.size(); i++) {
			System.out.println("Index : " + i + " " + queue.myQueue.get(i));
		}

		System.out.println("Peek Element : " + queue.peek());
		System.out.println("\nAfter peek");
		for (int i = 0; i < queue.myQueue.size(); i++) {
			System.out.println("Index : " + i + " " + queue.myQueue.get(i));
		}

		System.out.println("Is Empty : " + queue.isEmpty());
	}

	public void enqueue(String s) {
		myQueue.add(0, s);
	}

	public void dequeue() {
		if (myQueue.size() > 0)
			myQueue.remove(myQueue.size() - 1);
	}

	public String peek() {

		String peek;
		if (myQueue.size() > 0)
			return peek = myQueue.get(myQueue.size() - 1);
		else
			return null;
	}

	public boolean isEmpty() {
		return (myQueue.size() <= 0);
	}
}
