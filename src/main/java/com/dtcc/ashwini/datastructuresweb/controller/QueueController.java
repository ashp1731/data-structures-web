package com.dtcc.ashwini.datastructuresweb.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.dtcc.ashwini.datastructuresweb.util.Queue;
import com.dtcc.ashwini.datastructuresweb.util.Stack;

@RestController
@RequestMapping("queue/v1")
@CrossOrigin(origins = "http://localhost:4200")
public class QueueController {

	@GetMapping ("new-queue")
	public Queue getNewQueue () {
		return new Queue();
	}
	
	@PostMapping ("dequeue")
	public Queue dequeueQueue (@RequestBody Queue inQueue) {
		inQueue.dequeue();
		return inQueue;
	}
	
	@PostMapping ("enqueue")
	public Queue enqueueQueue (@RequestBody QueueEnqueueRequest inQueue) {
		inQueue.getInQueue().enqueue(inQueue.getInStr());		
		return inQueue.getInQueue();
	}
	
	@PostMapping ("peek")
	public String peekQueue (@RequestBody Queue inQueue) {
		String outStr = inQueue.peek();		
		return outStr;
	}
	
	@PostMapping ("isEmpty")
	public boolean isEmptyQueue (@RequestParam Queue inQueue) {
		boolean outIsEmpty = inQueue.isEmpty();
		return outIsEmpty;
	}
}

class QueueEnqueueRequest {
	private Queue inQueue;
	private String inStr;
	
	public Queue getInQueue() {
		return inQueue;
	}
	public void setInQueue(Queue inQueue) {
		this.inQueue = inQueue;
	}
	public String getInStr() {
		return inStr;
	}
	public void setInStr(String inStr) {
		this.inStr = inStr;
	}
	

}
