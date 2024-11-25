from bst import BST
from find_closest_value_in_bst import findClosestValueInBst

# Function to create a sample BST and find the closest value.
# O(n) time | O(n) space, where n is the number of nodes in the Binary Search Tree (BST)
def run_tests():
    # Construct a sample BST.
    root = BST(10)
    root.left = BST(5)
    root.right = BST(15)
    root.left.left = BST(2)
    root.left.left.left = BST(1)
    root.left.right = BST(5)
    root.right.left = BST(13)
    root.right.right = BST(22)
    root.right.left.right = BST(14)

    # Set the target value for which we need to find the closest node in the BST.
    target = 12

    # Call the function to find the closest value to the target in the BST.
    closest = findClosestValueInBst(root, target)

    # Output the result.
    print(f"Closest value to {target} is: {closest}")

# Execute the test case if this script is run directly.
if __name__ == "__main__":
    run_tests()