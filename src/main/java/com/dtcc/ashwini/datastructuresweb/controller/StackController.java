package com.dtcc.ashwini.datastructuresweb.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.dtcc.ashwini.datastructuresweb.util.Stack;

@RestController
@RequestMapping("stack/v1")
public class StackController {

	@GetMapping ("new-stack")
	public Stack getNewStack () {
		return new Stack();
	}
	
	@GetMapping ("pop")
	public Stack popStack (@RequestParam Stack inStack) {
		inStack.pop();
		return inStack;
	}
	
	@GetMapping ("push")
	public Stack pushStack (@RequestParam Stack inStack, @RequestParam String inStr) {
		inStack.push(inStr);		
		return inStack;
	}
	
	@GetMapping ("peek")
	public String peekStack (@RequestParam Stack inStack) {
		String outStr = inStack.peek();		
		return outStr;
	}
	
	@GetMapping ("isEmpty")
	public boolean isEmptyStack (@RequestParam Stack inStack) {
		boolean outIsEmpty = inStack.isEmpty();
		return outIsEmpty;
	}
}
