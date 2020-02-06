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
@RequestMapping("linkedlist/v1")
@CrossOrigin(origins = "http://localhost:4200")

public class LinkedListController {

	@GetMapping ("new-linkedlist")
	public MyArrayList<String> getNewArraylist () {
		return new MyArrayList<String>();
	}
	
	@PostMapping ("addfirst")
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


