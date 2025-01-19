from evaluate_expression_tree import evaluateExpressionTree
from binary_tree import BinaryTree

# Function to create a sample Binary Expression Tree and evaluate the same mathematically.
# O(n) time | O(h) space, where n is the number of nodes in the Binary Expression Tree
# and h is the height of the Binary Expression Tree
def run_tests():
    # Construct a sample Binary Expression Tree.
    root = BinaryTree(-1)
    root.left = BinaryTree(-2)
    root.right = BinaryTree(-3)
    root.left.left = BinaryTree(-4)
    root.left.right = BinaryTree(2)
    root.right.left = BinaryTree(8)
    root.right.right = BinaryTree(3)
    root.left.left.left = BinaryTree(2)
    root.left.left.right = BinaryTree(3)

    # Call the evaluateExpressionTree() function and get the evaluated result.
    result = evaluateExpressionTree(root)

    # Output the evaluated result of the Binary Expression Tree.
    print(f"Binary Expression Tree evaluation result: {result}")

# Execute the test case if this script is run directly.
if __name__ == "__main__":
    run_tests()