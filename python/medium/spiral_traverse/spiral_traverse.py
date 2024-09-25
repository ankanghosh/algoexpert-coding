# O(n) time | O(n) space, where n is the total number of elements
# in the two-dimensional array
def spiralTraverse(array):
    # Initialize an empty list to store the result
    result = []

    # Define the boundaries for the rows and columns
    startRow, endRow = 0, len(array) - 1
    startCol, endCol = 0, len(array[0]) - 1

    # Loop until all of the boundaries have been crossed
    while startRow <= endRow and startCol <= endCol:
        # Traverse from left to right across the current top row
        for col in range(startCol, endCol + 1):
            result.append(array[startRow][col])  # Add the current element to result

        # Traverse from top to bottom down the current right-most column
        for row in range(startRow + 1, endRow + 1):
            result.append(array[row][endCol])  # Add the current element to result

        # Traverse from right to left across the current bottom row
        for col in reversed(range(startCol, endCol)):
            # Break if there is only one row left to prevent duplication
            if startRow == endRow:
                break
            result.append(array[endRow][col])  # Add the current element to result

        # Traverse from bottom to top up the current left-most column
        for row in reversed(range(startRow + 1, endRow)):
            # Break if there is only one column left to prevent duplication
            if startCol == endCol:
                break
            result.append(array[row][startCol])  # Add the current element to result

        # Move the boundaries inward for the next layer
        startRow += 1  # Move the startRow down
        endRow -= 1  # Move the endRow up
        startCol += 1  # Move the startCol right
        endCol -= 1  # Move the endCol left

    return result