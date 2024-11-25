package main.java.com.example.branchsums;

import java.util.ArrayList;
import java.util.List;

public class BranchSums {
	// O(n) time | O(n) space, where n is the number of nodes in the Binary Tree
	public static List<Integer> branchSums(BinaryTree root) {
	    // Initialize a list to store branch sums.
	    List<Integer> sums = new ArrayList<Integer>();
	    
	    // Calculate the branch sums recursively.
	    calculateBranchSums(root, 0, sums);
	    
	    // Return the final list of branch sums.
	    return sums;
	}

	// Helper function to recursively calculate branch sums for each path from the root to a leaf node.
	public static void calculateBranchSums(BinaryTree node, int runningSum, List<Integer> sums) {
	    // If the node is null, return immediately.
	    if (node == null)
	        return;

	    // Update the running sum with the current node's value.
	    int newRunningSum = runningSum + node.value;

	    // If a leaf node is encountered, add the running sum to the list.
	    if (node.left == null && node.right == null) {
	        sums.add(newRunningSum);
	        
	     // Exit the function for this branch.
	        return;
	    }

	    // Recursively calculate branch sums for the left and right subtrees.
	    calculateBranchSums(node.left, newRunningSum, sums);
	    calculateBranchSums(node.right, newRunningSum, sums);
	}
}