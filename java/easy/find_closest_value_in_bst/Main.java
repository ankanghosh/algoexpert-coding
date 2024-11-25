package main.java.com.example.findclosestvalueinbst;

public class Main {
	// O(n) time | O(n) space, where n is the number of nodes in the Binary Search Tree (BST)
	// Main function to create a sample BST and find the closest value.
	public static void main(String[] args) {
		// Construct a sample BST.
		BST root = new BST(10);
		root.left = new BST(5);
		root.right = new BST(15);
		root.left.left = new BST(2);
		root.left.left.left = new BST(1);
		root.left.right = new BST(5);
		root.right.left = new BST(13);
		root.right.right = new BST(22);
		root.right.left.right = new BST(14);

		// Set the target value for which we need to find the closest node in the BST.
		int target = 12;

		// Call the function to find the closest value to the target in the BST.
		int closest = FindClosestValueInBST.findClosestValueInBst(root, target);

		// Output the result.
		System.out.println("Closest value to " + target + " is: " + closest);
	}
}