# Average: O(t*n^2) time | O(n^2) space;
# Worst: O(t*n^3) time | O(t*n^2) space;
# where t is the number of test cases and n is the length of the array
from four_number_sum import fourNumberSum

def run_tests():
    """
    Runs a series of test cases to validate the functionality of the fourNumberSum function.
    """

    # Test cases
    test_cases = [
        ([7, 6, 4, -1, 1, 2], 16),    # Test case 1: Expected: [[7, 6, 4, -1], [7, 6, 1, 2]]
        ([1, 2, 3, 4, 5, 6, 7], 10),    # Test case 2: Expected: [[1, 2, 3, 4]]
        ([5, -5, -2, 2, 3, -3], 0),    # Test case 3: Expected: [5, -5, -2, 2], [5, -5, 3, -3], [-2, 2, 3, -3]]
        ([-2, -1, 1, 2, 3, 4, 5, 6, 7, 8, 9], 4),    # Test case 4: Expected: [[-2, -1, 1, 6], [-2, 1, 2, 3], [-2, -1, 2, 5], [-2, -1, 3, 4]]
        ([-1, 22, 18, 4, 7, 11, 2, -5, -3], 30),    # Test case 5: Expected: [[-1, 22, 7, 2], [22, 4, 7, -3], [-1, 18, 11, 2], [18, 4, 11, -3], [22, 11, 2, -5]]
        ([-10, -3, -5, 2, 15, -7, 28, -6, 12, 8, 11, 5], 20),    # Test case 6: Expected: [[-5, 2, 15, 8], [-3, 2, -7, 28], [-10, -3, 28, 5], [-10, 28, -6, 8], [-7, 28, -6, 5], [-5, 2, 12, 11], [-5, 12, 8, 5]]
        ([1, 2, 3, 4, 5], 100),    # Test case 7: Expected: []
        ([1, 2, 3, 4, 5, -5, 6, -6], 5),    # Test case 8: Expected: [[2, 3, 5, -5], [1, 4, 5, -5], [2, 4, 5, -6], [1, 3, -5, 6], [2, 3, 6, -6], [1, 4, 6, -6]]
    ]

    # Run test cases
    for i, (array, targetSum) in enumerate(test_cases):
        result = fourNumberSum(array, targetSum)
        print(f"Test case {i + 1}: Array = {array}, Target Sum = {targetSum} -> Result: {result}")

# Execute the test cases if this script is run directly
if __name__ == "__main__":
    run_tests()