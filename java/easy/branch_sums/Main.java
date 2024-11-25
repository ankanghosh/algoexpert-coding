package main.java.com.example.branchsums;

import java.util.List;

public class Main {
	// Main function to create a sample Binary Tree and find the list of its branch sums.
	// O(n) time | O(n) space, where n is the number of nodes in the Binary Tree
	public static void main(String[] args) {
		// Construct a sample binary tree.
		BinaryTree root = new BinaryTree(1);
		root.left = new BinaryTree(2);
		root.right = new BinaryTree(3);
		root.left.left = new BinaryTree(4);
		root.left.right = new BinaryTree(5);
		root.right.left = new BinaryTree(6);
		root.right.right = new BinaryTree(7);
		root.left.left.left = new BinaryTree(8);
		root.left.left.right = new BinaryTree(9);
		root.left.right.left = new BinaryTree(10);

		// Call the branch sums function and get the result.
		List<Integer> sums = BranchSums.branchSums(root);

		// Output the branch sums.
		System.out.println("Branch sums: " + sums);
	}
}