package main.java.com.example.evaluateexpressiontree;


public class Main {
	// Main function to create a sample Binary Expression Tree and evaluate the same mathematically.
	// O(n) time | O(h) space, where n is the number of nodes in the Binary Expression Tree
	// and h is the height of the Binary Expression Tree
	public static void main(String[] args) {
		// Construct a sample Binary Expression Tree.
		BinaryTree root = new BinaryTree(-1);
		root.left = new BinaryTree(-2);
		root.right = new BinaryTree(-3);
		root.left.left = new BinaryTree(-4);
		root.left.right = new BinaryTree(2);
		root.right.left = new BinaryTree(8);
		root.right.right = new BinaryTree(3);
		root.left.left.left = new BinaryTree(2);
		root.left.left.right = new BinaryTree(3);

		// Call the evaluateExpressionTree() function and get the evaluated result.
		int result = EvaluateExpressionTree.evaluateExpressionTree(root);

		// Output the evaluated result of the Binary Expression Tree.
		System.out.println("Binary Expression Tree evaluation result: " + result);
	}
}