# O(t*n^2) time | O(t*n) space; t is the number of test cases
from three_number_sum import threeNumberSum

# Function to test the threeNumberSum function with various cases
def run_tests():
    """
    Runs a series of test cases to validate the functionality of the threeNumberSum function.
    """

    # Test cases
    test_cases = [
        ([12, 2, 1, 3, -6, 5, -8, 6], 0),  # Test case 1: Expected: [[-8, 2, 6], [-8, 3, 5], [-6, 1, 5]]
        ([1, 2, -2, -1, 0], 0),  # Test case 2: Expected: [[-2, 0, 2], [-1, 0, 1]]
        ([0, 0, 0, 0], 0),  # Test case 3: Expected: [[0, 0, 0], [0, 0, 0]]
        ([-2, -1, -1, 0, 1, 2, 3], 0),  # Test case 4: Expected: [[-2, -1, 3], [-2, 0, 2], [-1, -1, 2], [-1, 0, 1]]
        ([-5, -2, 0, 1, 2, 3, 4], 3),  # Test case 5: Expected: [[-2, 1, 4], [-2, 2, 3], [0, 1, 2]]
        ([1, 2, 3, 4, 5, 6], 10),  # Test case 6: Expected: [[1, 4, 5], [1, 3, 6], [2, 3, 5]]
        ([-3, -2, -1, 2, 4, 7], 3),  # Test case 7: Expected: [[-3, -1, 7], [-3, 2, 4]]
        ([1, 2, 3, 4, 5, 6, 7, 8, 9, 10], 15),  # Test case 8: Expected: [[1, 4, 10], [1, 5, 9], [1, 6, 8], [2, 3, 10], [2, 4, 9], [2, 5, 8], [2, 6, 7], [3, 4, 8], [3, 5, 7], [4, 5, 6]]
        ([1, 1, 1, 1, 1, 1], 3),  # Test case 9: Expected: [[1, 1, 1], [1, 1, 1], [1, 1, 1], [1, 1, 1], [1, 1, 1], [1, 1, 1]]
        ([-10, -5, -2, 0, 2, 5, 10], 0)  # Test case 10: Expected: [[-10, 0, 10], [-5, 0, 5], [-2, 0, 2]]
    ]
    # Run test cases
    for i, (array, targetSum) in enumerate(test_cases):
        result = threeNumberSum(array, targetSum)
        print(f"Test case {i + 1}: Array = {array}, Target Sum = {targetSum} -> Result: {result}")


# Execute the test cases if this script is run directly
if __name__ == "__main__":
    run_tests()