package com.dtcc.ashwini.datastructuresweb.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.dtcc.ashwini.datastructuresweb.util.MyArrayList;
import com.dtcc.ashwini.datastructuresweb.util.Queue;
import com.dtcc.ashwini.datastructuresweb.util.Stack;

@RestController
@RequestMapping("arraylist/v1")
@CrossOrigin(origins = "http://localhost:4200")

public class ArrayListController {

	@GetMapping ("new-arraylist")
	public MyArrayList<String> getNewArraylist () {
		return new MyArrayList<String>();
	}
	
	@PostMapping ("add")
	public MyArrayList<String> add (@RequestBody ArrayListAdd inArrayList) {
		inArrayList.getInArrayList().add(inArrayList.getValue());
		return inArrayList.getInArrayList();
	}
	
	@PostMapping ("addAt")
	public MyArrayList<String> addAt (@RequestBody ArrayListAdd inArrayList) {
		inArrayList.getInArrayList().addAt(inArrayList.getIndex(), inArrayList.getValue());
		return inArrayList.getInArrayList();
	}
	
	@PostMapping ("delete")
	public MyArrayList<String> delete (@RequestBody ArrayListAdd inArrayList) {
		inArrayList.getInArrayList().delete(inArrayList.getValue());
		return inArrayList.getInArrayList();
	}
}

class ArrayListAdd {


	private MyArrayList inArrayList;
	private String value;
	private int index;
	
	public int getIndex() {
		return index;
	}
	public void setIndex(int index) {
		this.index = index;
	}

	public MyArrayList getInArrayList() {
		return inArrayList;
	}
	public void setInArrayList(MyArrayList inArrayList) {
		this.inArrayList = inArrayList;
	}
	public String getValue() {
		return value;
	}
	public void setValue(String value) {
		this.value = value;
	}
	
	
}
