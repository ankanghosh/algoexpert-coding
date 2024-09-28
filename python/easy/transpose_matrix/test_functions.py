from transpose_matrix import transposeMatrix

# Function to test the transposeMatrix function with various cases
# O(t * w * h) time | O(t * w * h) space;
# where t is the number of test cases, w is the width of the matrix, and h is the height
def run_tests():
    """
    Runs a series of test cases to validate the functionality of the transposeMatrix function.
    """

    # Test cases: (2D matrix) -> Expected output (transposed matrix)
    test_cases = [
        [[1]],                                             # Test case 1 - Expected: [[1]]
        [[1], [-1]],                                       # Test case 2 - Expected: [[1, -1]]
        [[1, 2, 3]],                                       # Test case 3 - Expected: [[1], [2], [3]]
        [[1], [2], [3]],                                   # Test case 4 - Expected: [[1, 2, 3]]
        [[1, 2, 3], [4, 5, 6]],                            # Test case 5 - Expected: [[1, 4], [2, 5], [3, 6]]
        [[0, 0, 0], [1, 1, 1]],                            # Test case 6 - Expected: [[0, 1], [0, 1], [0, 1]]
        [[0, 1], [0, 1], [0, 1]],                          # Test case 7 - Expected: [[0, 0, 0], [1, 1, 1]]
        [[0, 0, 0], [0, 0, 0]],                            # Test case 8 - Expected: [[0, 0], [0, 0], [0, 0]]
        [[1, 4], [2, 5], [3, 6]],                          # Test case 9 - Expected: [[1, 2, 3], [4, 5, 6]]
        [[-7, -7], [100, 12], [-33, 17]],                  # Test case 10 - Expected: [[-7, 100, -33], [-7, 12, 17]]
        [[1, 2, 3], [4, 5, 6], [7, 8, 9]],                 # Test case 11 - Expected: [[1, 4, 7], [2, 5, 8], [3, 6, 9]]
        [[1, 4, 7], [2, 5, 8], [3, 6, 9]],                 # Test case 12 - Expected: [[1, 2, 3], [4, 5, 6], [7, 8, 9]]
        [[5, 6, 3, -3, 12], [-3, 6, 5, 2, -1], [0, 0, 3, 12, 3]],  # Test case 13 - Expected: [[5, -3, 0], [6, 6, 0], [3, 5, 3], [-3, 2, 12], [12, -1, 3]]
        [[0, -1, -2, -3], [4, 5, 6, 7], [2, 3, -2, -3], [42, 100, 30, -42]],  # Test case 14 - Expected: [[0, 4, 2, 42], [-1, 5, 3, 100], [-2, 6, -2, 30], [-3, 7, -3, -42]]
        [[1234, 6935, 4205], [-23459, 314159, 0], [100, 3, 987654]],  # Test case 15 - Expected: [[1234, -23459, 100], [6935, 314159, 3], [4205, 0, 987654]]
    ]

    # Run test cases
    for i, matrix in enumerate(test_cases):
        result = transposeMatrix(matrix)
        print(f"Test case {i + 1}: matrix = {matrix} -> Result: {result}")

# Execute the test cases if this script is run directly
if __name__ == "__main__":
    run_tests()