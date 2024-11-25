from branch_sums import branchSums
from binary_tree import BinaryTree

# Function to create a sample Binary Tree and find the list of its branch sums.
# O(n) time | O(n) space, where n is the number of nodes in the Binary Tree
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
    root.left.right.left = BinaryTree(10)

    # Call the branch sums function and get the result.
    sums = branchSums(root)

    # Output the branch sums.
    print(f"Branch sums: {sums}")

# Execute the test case if this script is run directly.
if __name__ == "__main__":
    run_tests()