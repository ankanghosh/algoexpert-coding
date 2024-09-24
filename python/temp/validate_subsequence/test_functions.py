from validate_subsequence import isValidSubsequence

# Function to test the isValidSubsequence function with various cases
# O(t*n) time | O(t*n) space; t is the number of test cases and n is the length of the array or the sequence, whichever is greater
def run_tests():
    """
    Runs a series of test cases to validate the functionality of the isValidSubsequence function.
    """

    # Test cases
    test_cases = [
        ([5, 1, 22, 25, 6, -1, 8, 10], [1, 6, -1, 10]),  # Test case 1: True
        ([5, 1, 22, 25, 6, -1, 8, 10], [5, 1, 22, 22, 6, -1, 8, 10]),  # Test case 2: False
        ([1, 2, 3, 4, 5], [2, 4]),  # Test case 3: True
        ([1, 2, 3, 4, 5], [2, 5, 3]),  # Test case 4: False
        ([1, 2, 3, 4, 5], [1, 2, 3, 4, 5]),  # Test case 5: True
        ([1, 2, 3, 4, 5], [0]),  # Test case 6: False
        ([1, 2, 3, 4, 5], []),  # Test case 7: True
        ([], [1]),  # Test case 8: False
        ([1, 2, 3, 4, 5], [5, 4, 3, 2, 1]),  # Test case 9: False
        ([10, 20, 30, 40, 50], [20, 40]),  # Test case 10: True
    ]
    # Run test cases
    for i, (array, sequence) in enumerate(test_cases):
        result = isValidSubsequence(array, sequence)
        print(f"Test case {i + 1}: Array = {array}, Sequence = {sequence} -> Result: {result}")


# Execute the test cases if this script is run directly
if __name__ == "__main__":
    run_tests()