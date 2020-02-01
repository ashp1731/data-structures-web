package com.dtcc.ashwini.datastructuresweb.util;

import java.util.Arrays;
public class ArrayList {
	
	private static final int INITIAL_CAPACITY = 16;
	private int[] data = new  int[INITIAL_CAPACITY];
	private int size = 0;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public void add(int value) {
		ensureCapacity();
		data[data.length] = value;
		size++;
	}
	
	public void addAt(int index, int value) {
		for(int i = size - 1; i >= index; i--) {
			data[i+1] = data[i];
			data[index] = value;
			size++;
		}
	}
	
	public void ensureCapacity() {

		if(size >= data.length) {
			int[] newData = new int[size * 2 + 1]; // double the size of array and create new one
			System.arraycopy(data, 0, newData, 0, size);
			data = newData;
		}
	}
	
	public void delete(int value) {
		// Removes all the elements of array equal to input values
		int index = getIndex(value);
		for(int i = data.length-1; i>= index; i--) {
			data[i] = data[i+1];
			size--;
		}
		
		
		data[size-1] = 0;
		
	}
	
	public void clear() {
		data = new int[INITIAL_CAPACITY];
		size = 0;
	}
	
	 private void checkIndex(int index) {
		    if (index < 0 || index >= size)
		      throw new IndexOutOfBoundsException
		        ("Index: " + index + ", Size: " + size);
	 }
	 
	 public int getIndex(int value) {
		 int index = 0;
		 for (int i = 0; i < data.length; i++) {
			 if(data[i] == value)
				 index = i;
		 }
		 return index;
	 }
}
