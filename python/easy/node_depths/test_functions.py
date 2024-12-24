from node_depths import nodeDepths
from binary_tree import BinaryTree

# Function to create a sample Binary Tree and find the sum of depths of all nodes in the Binary Tree.
# Average case - When the tree is balanced: O(n) time | O(h) space, where n is
# the number of nodes in the Binary Tree and h is the height of the Binary Tree
def run_tests():
    # Construct a sample binary tree.
    root = BinaryTree(1)
    root.left = BinaryTree(2)
    root.right = BinaryTree(3)
    root.left.left = BinaryTree(4)
    root.left.right = BinaryTree(5)
    root.right.left = BinaryTree(6)
    root.right.right = BinaryTree(7)
    root.left.left.left = BinaryTree(8)
    root.left.left.right = BinaryTree(9)

    # Call the nodeDepths() function and get the result.
    sumOfDepths = nodeDepths(root)

    # Output the sum of node depths.
    print(f"Sum of node depths: {sumOfDepths}")

# Execute the test case if this script is run directly.
if __name__ == "__main__":
    run_tests()