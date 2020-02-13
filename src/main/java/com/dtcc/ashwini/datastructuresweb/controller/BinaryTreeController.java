package com.dtcc.ashwini.datastructuresweb.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.dtcc.ashwini.datastructuresweb.util.BinarySearchTree;
import com.dtcc.ashwini.datastructuresweb.util.Node;


@RestController
@RequestMapping("binarytree/v1")
@CrossOrigin(origins = "http://localhost:4200")
public class BinaryTreeController {

//	@GetMapping ("new-binarytree")
//	public MyArrayList<String> getNewArraylist () {
//		return new MyArrayList<String>();
//	}
//	
//	@PostMapping ("insert")
//	public MyArrayList<String> insert (@RequestBody binaryTreeObject inBinaryTree) {
//		inBinaryTree.getBinaryTree().insert(inBinaryTree.getBinaryTree().getRoot(), inBinaryTree.getValue())
//	}
//	
//	@PostMapping ("delete")
//	public MyArrayList<String> delete (@RequestBody binaryTreeObject inBinaryTree) {
//		inArrayList.getInArrayList().addAt(inArrayList.getIndex(), inArrayList.getValue());
//		return inArrayList.getInArrayList();
//	}
//
//	@PostMapping ("search")
//	public MyArrayList<String> search (@RequestBody binaryTreeObject inBinaryTree) {
//		inArrayList.getInArrayList().addAt(inArrayList.getIndex(), inArrayList.getValue());
//		return inArrayList.getInArrayList();
//	}
}

class binaryTreeObject {
	
	private BinarySearchTree binaryTree;
	private Node node;
	int value;
	
	
	public int getValue() {
		return value;
	}
	public void setValue(int value) {
		this.value = value;
	}
	public BinarySearchTree getBinaryTree() {
		return binaryTree;
	}
	public void setBinaryTree(BinarySearchTree binaryTree) {
		this.binaryTree = binaryTree;
	}
	public Node getNode() {
		return node;
	}
	public void setNode(Node node) {
		this.node = node;
	}
	
	
	
}
