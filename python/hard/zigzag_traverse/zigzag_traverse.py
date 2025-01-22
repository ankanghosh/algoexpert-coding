# Function to return the result of zigzag traversal in a Two-Dimensional (2D) array.
# O(n) time | O(n) space, where n is the total number of elements in the 2D input array
def zigzagTraverse(array):
    # Calculate the height (last row index) of the array.
    height = len(array) - 1
    # Calculate the width (last column index) of the array.
    width = len(array[0]) - 1
    # Initialize the result list to store the traversal.
    result = []
    # Start from the top-left corner.
    row, col = 0, 0
    # Flag to determine the direction of traversal.
    goingDown = True

    # Continue traversal until the indices go out of bounds.
    while not isOutOfBounds(row, col, height, width):
        # Add the current element to the result list.
        result.append(array[row][col])

        # If the current direction is downward.
        if goingDown:
            # Check if we hit the bottom row or the first column.
            if col == 0 or row == height:
                # Change the direction to upward.
                goingDown = False
                # Move right if at the bottom row, otherwise move down
                if row == height:
                    col += 1
                else:
                    row += 1
            else:
                # Otherwise, move diagonally down-left.
                row += 1
                col -= 1
        # If the current direction is upward.
        else:
            # Check if we hit the top row or the last column.
            if row == 0 or col == width:
                # Change the direction to downward.
                goingDown = True
                # Move down if at the last column, otherwise move right.
                if col == width:
                    row += 1
                else:
                    col += 1
            else:
                # Otherwise, move diagonally up-right.
                row -= 1
                col += 1

    # Return the zigzag traversal result.
    return result

# Helper function to check if the indices are out of bounds.
def isOutOfBounds(row, col, height, width):
    return row < 0 or row > height or col < 0 or col > width