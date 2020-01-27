package com.dtcc.ashwini.datastructuresweb.util;


import java.util.ArrayList;

public class Stack {

	private ArrayList<String> myStack = new ArrayList<String>();

	public static void main(String[] args) {
		Stack stack = new Stack();

		stack.push("Ashwini");
		stack.push("Amogh");
		stack.push("Saanvi");
		stack.push("Sahana");

		for (int i = 0; i < stack.myStack.size(); i++) {
			System.out.println("Index : " + i + " " + stack.myStack.get(i));
		}

		stack.pop();
		System.out.println("\nAfter Pop");
		for (int i = 0; i < stack.myStack.size(); i++) {
			System.out.println("Index : " + i + " " + stack.myStack.get(i));
		}

		System.out.println("Peek Element : " + stack.peek());
		System.out.println("\nAfter peek");
		for (int i = 0; i < stack.myStack.size(); i++) {
			System.out.println("Index : " + i + " " + stack.myStack.get(i));
		}

		System.out.println("\nSize of Stack : " + stack.getSize());
		System.out.println("\nIs Empty : " + stack.isEmpty());
	}

	public void push(String s) {
		myStack.add(0, s);
	}

	public void pop() {
		if (myStack.size() > 0)
			myStack.remove(0);
	}

	public String peek() {
		if (myStack.size() > 0)
			return myStack.get(0);
		else
			return null;
	}

	public void clear() {
		myStack = new ArrayList<String>();
	}
	
	public boolean isEmpty() {
		return (myStack.size() <= 0);
	}
	
	public int getSize() {
		return myStack.size();
	}

	// Method to return Stack
	public ArrayList<String> getData() {
		return myStack;
	}
}
