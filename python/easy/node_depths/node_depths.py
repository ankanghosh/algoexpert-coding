# Average case - When the tree is balanced: O(n) time | O(h) space, where n is
# the number of nodes in the Binary Tree and h is the height of the Binary Tree
# Function to calculate the sum of depths of all nodes in a Binary Tree.
def nodeDepths(root, depth=0):
    # Base case: If the node is None, return 0 (no depth to add).
    if root is None:
        return 0

    # Recursive case:
    # 1. Add the current node's depth.
    # 2. Recursively calculate the sum of depths for the left and right subtrees,
    #    incrementing the depth by 1 for each child.
    return depth + nodeDepths(root.left, depth + 1) + nodeDepths(root.right, depth + 1)