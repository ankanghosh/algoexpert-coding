package main.java.com.example.evaluateexpressiontree;

public class EvaluateExpressionTree {
	// O(n) time | O(h) space, where n is the number of nodes in the Binary Expression Tree
	// and h is the height of the Binary Expression Tree
	public static int evaluateExpressionTree(BinaryTree tree) {
		// Base case: If the node is a leaf node (positive value), return its value.
		if (tree.value >= 0) {
			return tree.value;
		}

		// Recursively evaluate the left and right subtrees.
		int leftValue = evaluateExpressionTree(tree.left);
		int rightValue = evaluateExpressionTree(tree.right);

		// Perform the operation based on the current node's value.
		if (tree.value == -1) {  // Addition.
			return leftValue + rightValue;
		} else if (tree.value == -2) {  // Subtraction.
			return leftValue - rightValue;
		} else if (tree.value == -3) {  // Division (rounded towards zero).
			return leftValue / rightValue;
		}

		// Multiplication (only remaining case).
		return leftValue * rightValue;
	}
}