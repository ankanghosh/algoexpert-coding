# Average: O(log(n)) time | O(1) space, where n is the number of nodes in the Binary Search Tree (BST).
# Worst: O(n) time | O(1) space, where n is the number of nodes in the BST
# Function to find the closest value to the target in a BST.
def findClosestValueInBst(tree, target):
    # Call the helper function starting with the root node and the initial closest value.
    return findClosestValueInBstHelper(tree, target, tree.value)

# Helper function that traverses the BST and finds the closest value.
def findClosestValueInBstHelper(tree, target, closest):
    currentNode = tree  # Start with the root node.

    # Traverse the tree until reaching a leaf node.
    while currentNode is not None:
        # If the current node's value is closer to the target than the closest, update the closest value.
        if abs(target - closest) > abs(target - currentNode.value):
            closest = currentNode.value

        # If the target is smaller than the current node's value, move to the left child.
        if currentNode.value > target:
            currentNode = currentNode.left
        # If the target is larger than the current node's value, move to the right child.
        elif currentNode.value < target:
            currentNode = currentNode.right
        # If the target matches the current node's value, we have found the closest value.
        else:
            break

    # Return the closest value found.
    return closest