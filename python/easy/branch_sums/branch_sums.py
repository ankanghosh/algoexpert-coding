# O(n) time | O(n) space, where n is the number of nodes in the Binary Tree
def branchSums(root):
    # Initialize a list to store branch sums.
    sums = []

    # Calculate the branch sums recursively.
    calculateBranchSums(root, 0, sums)

    # Return the final list of branch sums.
    return sums

# Helper function to recursively calculate branch sums for each path from the root to a leaf node.
def calculateBranchSums(node, runningSum, sums):
    # If the node is None, return immediately.
    if node is None:
        return

    # Update the running sum with the current node's value.
    newRunningSum = runningSum + node.value

    # If a leaf node is encountered, add the running sum to the list.
    if node.left is None and node.right is None:
        sums.append(newRunningSum)

        # Exit the function for this branch.
        return

    # Recursively calculate branch sums for the left and right subtrees.
    calculateBranchSums(node.left, newRunningSum, sums)
    calculateBranchSums(node.right, newRunningSum, sums)