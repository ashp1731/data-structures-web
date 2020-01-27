package com.dtcc.ashwini.datastructuresweb.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.dtcc.ashwini.datastructuresweb.util.ArrayList;
import com.dtcc.ashwini.datastructuresweb.util.Queue;
import com.dtcc.ashwini.datastructuresweb.util.Stack;

@RestController
@RequestMapping("arraylist/v1")
public class ArrayListController {

	@GetMapping ("new-arraylist")
	public ArrayList getNewArraylist () {
		return new ArrayList();
	}
	
	@GetMapping ("dequeue")
	public Queue dequeueQueue (@RequestParam Queue inQueue) {
		inQueue.dequeue();
		return inQueue;
	}
	
	@GetMapping ("enqueue")
	public Queue enqueueQueue (@RequestParam Queue inQueue, @RequestParam String inStr) {
		inQueue.enqueue(inStr);		
		return inQueue;
	}
	
	@GetMapping ("peek")
	public String peekQueue (@RequestParam Queue inQueue) {
		String outStr = inQueue.peek();		
		return outStr;
	}
	
	@GetMapping ("isEmpty")
	public boolean isEmptyQueue (@RequestParam Queue inQueue) {
		boolean outIsEmpty = inQueue.isEmpty();
		return outIsEmpty;
	}
}
