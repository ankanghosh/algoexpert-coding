package main.java.com.example.nodedepths;

// Class to represent nodes in the Binary Tree.
public class BinaryTree {
	int value;
	BinaryTree left;
	BinaryTree right;

	BinaryTree(int value) {
		this.value = value;
		this.left = null;
		this.right = null;
	}
}