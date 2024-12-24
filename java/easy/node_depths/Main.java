package main.java.com.example.nodedepths;

public class Main {
	// Main function to create a sample Binary Tree and find the sum of depths of all nodes in the Binary Tree.
	// Average case - When the tree is balanced: O(n) time | O(h) space, where n is
	// the number of nodes in the Binary Tree and h is the height of the Binary Tree
	public static void main(String[] args) {
		// Construct a sample Binary Tree.
		BinaryTree root = new BinaryTree(1);
		root.left = new BinaryTree(2);
		root.right = new BinaryTree(3);
		root.left.left = new BinaryTree(4);
		root.left.right = new BinaryTree(5);
		root.right.left = new BinaryTree(6);
		root.right.right = new BinaryTree(7);
		root.left.left.left = new BinaryTree(8);
		root.left.left.right = new BinaryTree(9);

		// Call the nodeDepths() function and get the result.
		int sumOfDepths = NodeDepths.nodeDepths(root);

		// Output the sum of node depths.
		System.out.println("Sum of node depths: " + sumOfDepths);
	}
}