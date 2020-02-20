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

	@GetMapping ("new-binarytree")
	public BinarySearchTree<String> getNewBinaryTree () {
		return new BinarySearchTree<String>();
	}
	
	@PostMapping ("insert")
	public BinarySearchTree<String> insert (@RequestBody BinaryTreeObject inBinaryTree) {
		inBinaryTree.getInBinaryTree().insert(inBinaryTree.getInBinaryTree().getRoot(), inBinaryTree.getValue());
		return inBinaryTree.getInBinaryTree();
	}
//	
	@PostMapping ("delete")
	public BinarySearchTree<String> delete (@RequestBody BinaryTreeObject inBinaryTree) {
		inBinaryTree.getInBinaryTree().deleteNode(inBinaryTree.getInBinaryTree().getRoot(), inBinaryTree.getValue());
		return inBinaryTree.getInBinaryTree();
	}
	
	@PostMapping ("tree-height")
	public int getHeight (@RequestBody BinaryTreeObject inBinaryTree) {
		return inBinaryTree.getInBinaryTree().getHeight();
	}
	
	@PostMapping ("tree-size")
	public int getSize (@RequestBody BinaryTreeObject inBinaryTree) {
		return inBinaryTree.getInBinaryTree().getSize();
	}
//

}

class BinaryTreeObject {
	
	private BinarySearchTree inBinaryTree;
//	private Node node;
	int value;

	
	public int getValue() {
		return value;
	}
	public void setValue(int value) {
		this.value = value;
	}
	public BinarySearchTree getInBinaryTree() {
		return inBinaryTree;
	}
	public void setInBinaryTree(BinarySearchTree binaryTree) {
		this.inBinaryTree = binaryTree;
	}
//	public Node getNode() {
//		return node;
//	}
//	public void setNode(Node node) {
//		this.node = node;
//	}
	
	
	
}
