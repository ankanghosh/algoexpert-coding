# Function to evaluate a Binary Expression Tree mathematically.
# O(n) time | O(h) space, where n is the number of nodes in the Binary Expression Tree
# and h is the height of the Binary Expression Tree
def evaluateExpressionTree(tree):
    # Base case: If the node is a leaf node (positive value), return its value.
    if tree.value >= 0:
        return tree.value

    # Recursively evaluate the left and right subtrees.
    leftValue = evaluateExpressionTree(tree.left)
    rightValue = evaluateExpressionTree(tree.right)

    # Perform the operation based on the current node's value.
    if tree.value == -1:  # Addition.
        return leftValue + rightValue
    elif tree.value == -2:  # Subtraction.
        return leftValue - rightValue
    elif tree.value == -3:  # Division (rounded towards zero).
        return int(leftValue / rightValue)

    # Multiplication (only remaining case).
    return leftValue * rightValue