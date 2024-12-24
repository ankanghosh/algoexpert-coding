package main.java.com.example.nodedepths;

public class NodeDepths {
	// Average case - When the tree is balanced: O(n) time | O(h) space, where n is
	// the number of nodes in the Binary Tree and h is the height of the Binary Tree
	// Function to calculate the sum of depths of all nodes in the binary tree.
	public static int nodeDepths(BinaryTree root) {
		return nodeDepthsHelper(root, 0);
	}

	// Helper function to perform the depth calculation.
	private static int nodeDepthsHelper(BinaryTree node, int depth) {
		// Base case: If the node is null, return 0 (no depth to add).
		if (node == null) {
			return 0;
		}
		// Recursive case:
		// 1. Add the current node's depth.
		// 2. Recursively calculate the sum of depths for the left and right subtrees,
		//    incrementing the depth by 1 for each child.
		return depth + nodeDepthsHelper(node.left, depth + 1) + nodeDepthsHelper(node.right, depth + 1);
	}
}