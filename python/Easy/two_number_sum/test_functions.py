# O(t*n) time | O(t*n) space; t is the number of test cases
from two_number_sum import twoNumberSum

# Function to test the twoNumberSum function with various cases
def run_tests():
    """
    Runs a series of test cases to validate the functionality of the twoNumberSum function.
    """

    # Test cases
    test_cases = [
        ([3, 5, -4, 8, 11, 1, -1, 6], 10),  # Expected: [-1, 11]
        ([2, 7, 11, 15], 9),  # Expected: [7, 2]
        ([0, 2, 3, 4], 5),  # Expected: [3, 2]
        ([3, 2, 4], 6),  # Expected: [4, 2]
        ([1, 2, 3], 7),  # Expected: []
        ([3, 3], 6),  # Expected: [3, 3]
        ([1, 2, 3, 4, 5], 10),  # Expected: []
        ([5, -2, 8, -3, 7], 5)  # Expected: [8, -3]
    ]

    # Run test cases
    for i, (array, targetSum) in enumerate(test_cases):
        result = twoNumberSum(array, targetSum)
        print(f"Test case {i + 1}: Array = {array}, Target Sum = {targetSum} -> Result: {result}")


# Execute the test cases if this script is run directly
if __name__ == "__main__":
    run_tests()