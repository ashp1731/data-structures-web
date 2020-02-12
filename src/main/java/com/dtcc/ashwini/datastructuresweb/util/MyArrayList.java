package com.dtcc.ashwini.datastructuresweb.util;

import java.util.Arrays;
public class MyArrayList<T> {
	
	private static final int INITIAL_CAPACITY = 16;
	private T[] underlyingArrayList = (T[])new Object[INITIAL_CAPACITY];
	private int size = 0;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		MyArrayList myArrayList = new MyArrayList();
		for(int i = 0; i < 5; i++) {
			myArrayList.underlyingArrayList[i] = i+1;
			myArrayList.size++;
		}
		
		myArrayList.add(6);
		
		System.out.println("After Add : ");
		for(int i = 0; i < myArrayList.underlyingArrayList.length; i++) {
			System.out.println(myArrayList.underlyingArrayList[i]);
		}
		
		
		myArrayList.addAt(1, 7);
		System.out.println("After Add At : ");
		for(int i = 0; i < myArrayList.underlyingArrayList.length; i++) {
			System.out.println(myArrayList.underlyingArrayList[i]);
		}		
		
		myArrayList.delete(7);
		System.out.println("After Delete : ");
		for(int i = 0; i < myArrayList.underlyingArrayList.length; i++) {
			System.out.println(myArrayList.underlyingArrayList[i]);
		}
		
		myArrayList.clear();
		System.out.println(Arrays.toString(myArrayList.getUnderlyingArrayList()));
		
	}

	public void add(T t) {
		ensureCapacity();
		underlyingArrayList[size] = t;
		size++;
	}
	
	public void addAt(int index, T t) {
		int oldSize = size;
		size = max (size + 1, index + 1);
		ensureCapacity();
		if (oldSize > 0) {
			for(int i = oldSize - 1; i >= index; i--) {
				underlyingArrayList[i+1] = underlyingArrayList[i];
			}
		}
		underlyingArrayList[index] = t;
	}
	
	private int max(int i, int j) {
		return i > j? i: j;
	}

	public void ensureCapacity() {
		if(size >= underlyingArrayList.length) {
			T[] newData = (T[])new Object[size * 2 + 1]; // double the size of array and create new one
			System.arraycopy(underlyingArrayList, 0, newData, 0, underlyingArrayList.length);
			underlyingArrayList = newData;
		}
	}
	
	public void delete(T t) {
		// Removes first occurence input value in array
		int index = getIndex(t);
		for(int i = 0; i < underlyingArrayList.length; i++) {
			if(underlyingArrayList[i] == t) {
				index = i;
			break;	
			}
		}

		
		for(int i = index+1; i< size; i++) {
			underlyingArrayList[i-1] = underlyingArrayList[i];		
		}
		size--;
		underlyingArrayList[underlyingArrayList.length-1] = null;
		
	}
	
	public void clear() {
		underlyingArrayList = (T[])new Object[INITIAL_CAPACITY];
		size = 0;
	}
	
	 private void checkIndex(int index) {
		    if (index < 0 || index >= size)
		      throw new IndexOutOfBoundsException
		        ("Index: " + index + ", Size: " + size);
	 }
	 
	 public int getIndex(T t) {
		 int index = 0;
		 for (int i = 0; i < underlyingArrayList.length; i++) {
			 if(underlyingArrayList[i].equals(t))
				 index = i;
		 }
		 return index;
	 }

	public T[] getUnderlyingArrayList() {
		return Arrays.copyOf(underlyingArrayList, size)	;
	}

	public void setUnderlyingArrayList(T[] underlyingArrayList) {
		this.underlyingArrayList = underlyingArrayList;
	}

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}
	 
	 
}
