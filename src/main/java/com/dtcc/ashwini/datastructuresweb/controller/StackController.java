package com.dtcc.ashwini.datastructuresweb.controller;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.dtcc.ashwini.datastructuresweb.util.Stack;

@RestController
@RequestMapping("stack/v1")
@CrossOrigin(origins = "http://localhost:4200")
public class StackController {

	@GetMapping ("new-stack")
//	@RequestMapping(name = "new-stack", method = RequestMethod.GET)
	public Stack getNewStack () {
		return new Stack();
	}
	
	@PostMapping ("pop")
	public Stack popStack (@RequestBody Stack inStack) {
		inStack.pop();
		return inStack;
	}
	
	@PostMapping ("push")
	public Stack pushStack (@RequestBody StackPushRequest inStack) {
		inStack.getInStack().push(inStack.getInStr());		
		return inStack.getInStack();
	}
	
	@PostMapping (value = "peek")
	public String peekStack (@RequestBody Stack inStack) {
		String outStr = inStack.peek();
		return outStr;
	}
	
	@PostMapping ("isEmpty")
	public boolean isEmptyStack (@RequestParam Stack inStack) {
		boolean outIsEmpty = inStack.isEmpty();
		return outIsEmpty;
	}
}

class StackPushRequest {
	private Stack inStack;
	private String inStr;
	
	public Stack getInStack() {
		return inStack;
	}
	
	public void setInStack(Stack inStack) {
		this.inStack = inStack;
	}
	
	public String getInStr() {
		return inStr;
	}
	
	public void setInStr(String inStr) {
		this.inStr = inStr;
	}
}
