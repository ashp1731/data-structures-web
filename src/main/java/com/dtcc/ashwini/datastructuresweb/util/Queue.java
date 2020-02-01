package com.dtcc.ashwini.datastructuresweb.util;

import java.util.ArrayList;

public class Queue {

	private ArrayList<String> underlyingData = new ArrayList<String>();

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Queue queue = new Queue();

		queue.enqueue("Ashwini");
		queue.enqueue("Amogh");
		queue.enqueue("Saanvi");
		queue.enqueue("Sahana");

		for (int i = 0; i < queue.underlyingData.size(); i++) {
			System.out.println("Index : " + i + " " + queue.underlyingData.get(i));
		}

		queue.dequeue();
		System.out.println("\nAfter Dequeue");
		for (int i = 0; i < queue.underlyingData.size(); i++) {
			System.out.println("Index : " + i + " " + queue.underlyingData.get(i));
		}

		System.out.println("Peek Element : " + queue.peek());
		System.out.println("\nAfter peek");
		for (int i = 0; i < queue.underlyingData.size(); i++) {
			System.out.println("Index : " + i + " " + queue.underlyingData.get(i));
		}

		System.out.println("Is Empty : " + queue.isEmpty());
	}

	public void enqueue(String s) {
		underlyingData.add(0, s);
	}

	public void dequeue() {
		if (underlyingData.size() > 0)
			underlyingData.remove(underlyingData.size() - 1);
	}

	public String peek() {
		String peek;
		if (underlyingData.size() > 0)
			return peek = underlyingData.get(underlyingData.size() - 1);
		else
			return null;
	}

	public boolean isEmpty() {
		return (underlyingData.size() <= 0);
	}

	public ArrayList<String> getUnderlyingData() {
		return underlyingData;
	}

	public void setUnderlyingData(ArrayList<String> data) {
		this.underlyingData = data;
	}
}
