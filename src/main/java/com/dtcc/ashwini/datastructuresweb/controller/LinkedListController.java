package com.dtcc.ashwini.datastructuresweb.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.dtcc.ashwini.datastructuresweb.util.MyArrayList;
import com.dtcc.ashwini.datastructuresweb.util.MyLinkedList;
import com.dtcc.ashwini.datastructuresweb.util.Queue;
import com.dtcc.ashwini.datastructuresweb.util.Stack;

@RestController
@RequestMapping("linkedlist/v1")
@CrossOrigin(origins = "http://localhost:4200")
public class LinkedListController {

	@GetMapping("new-linkedlist")
	public MyLinkedList<String> getNewArraylist() {
		MyLinkedList underlyingList = new MyLinkedList();
		return underlyingList;
	}

	@PostMapping("addFirst")
	public MyLinkedList<String> addFirst(@RequestBody LinkedListUpdate inLinkedList) {
		inLinkedList.getInLinkedList().addFirst(inLinkedList.getValue());
		return inLinkedList.getInLinkedList();
	}

	@PostMapping("addAt")
	public MyLinkedList<String> addAt(@RequestBody LinkedListUpdate inLinkedList) {
		inLinkedList.getInLinkedList().addAt(inLinkedList.getIndex(), inLinkedList.getValue());
		return inLinkedList.getInLinkedList();
	}

	@PostMapping("addLast")
	public MyLinkedList<String> addLast(@RequestBody LinkedListUpdate inLinkedList) {
		inLinkedList.getInLinkedList().addLast(inLinkedList.getValue());
		return inLinkedList.getInLinkedList();
	}

	@PostMapping("removeFirst")
	public MyLinkedList<String> removeFirst(@RequestBody LinkedListUpdate inLinkedList) {
		inLinkedList.getInLinkedList().removeFirst();
		return inLinkedList.getInLinkedList();
	}

	@PostMapping("removeAt")
	public MyLinkedList<String> removeAt(@RequestBody LinkedListUpdate inLinkedList) {
		inLinkedList.getInLinkedList().removeAt(inLinkedList.getIndex());
		return inLinkedList.getInLinkedList();
	}

	@PostMapping("removeLast")
	public MyLinkedList<String> removeLast(@RequestBody LinkedListUpdate inLinkedList) {
		inLinkedList.getInLinkedList().removeLast();
		return inLinkedList.getInLinkedList();
	}
}

class LinkedListUpdate {

	private MyLinkedList inLinkedList;
	private int index;
	private String value;


	public MyLinkedList getInLinkedList() {
		return inLinkedList;
	}

	public void setInLinkedList(MyLinkedList inLinkedList) {
		this.inLinkedList = inLinkedList;
	}

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}

	public int getIndex() {
		return index;
	}

	public void setIndex(int index) {
		this.index = index;
	}

}
