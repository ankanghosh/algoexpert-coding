package main.java.com.example.findclosestvalueinbst;

public class FindClosestValueInBST {
	// Average: O(log(n)) time | O(1) space, where n is the number of nodes in the Binary Search Tree (BST).
	// Worst: O(n) time | O(1) space, where n is the number of nodes in the BST
	// Function to find the closest value to the target in a BST.
	public static int findClosestValueInBst(BST tree, int target) {
		// Call the helper function starting with the root node and the initial closest value.
		return findClosestValueInBstHelper(tree, target, tree.value);
	}

	// Helper function that traverses the BST and finds the closest value.
	public static int findClosestValueInBstHelper(BST tree, int target, int closest) {
		BST currentNode = tree;  // Start with the root node.

		// Traverse the tree until reaching a leaf node.
		while (currentNode != null) {
			// If the current node's value is closer to the target than the closest, update the closest value.
			if (Math.abs(target - closest) > Math.abs(target - currentNode.value)) {
				closest = currentNode.value;
			}

			// If the target is smaller than the current node's value, move to the left child.
			if (currentNode.value > target) {
				currentNode = currentNode.left;
			}
			// If the target is larger than the current node's value, move to the right child.
			else if (currentNode.value < target) {
				currentNode = currentNode.right;
			}
			// If the target matches the current node's value, we have found the closest value.
			else {
				break;
			}
		}

		// Return the closest value found.
		return closest;
	}
}