# O(w * h) time | O(w * h) space, where w is the width
# of the matrix and h is the height
def transposeMatrix(matrix):
    # Create an empty list to hold the transposed matrix
    transposedMatrix = []

    # Iterate over each column in the original matrix
    for col in range(len(matrix[0])):
        # Create a new row for the transposed matrix
        newRow = []

        # Iterate over each row in the original matrix
        for row in range(len(matrix)):
            # Append the value at matrix[row][col] to the new row
            newRow.append(matrix[row][col])

        # Add the new row to the transposed matrix
        transposedMatrix.append(newRow)

    # Return the transposed matrix
    return transposedMatrix