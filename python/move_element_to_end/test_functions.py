from move_element_to_end import moveElementToEnd

# Function to test the moveElementToEnd function with various cases
# O(t * n) time | O(t) space, where t is the number of test cases and n is the length of the input array
def run_tests():
    """
    Runs a series of test cases to validate the functionality of the moveElementToEnd function.
    """

    # Test cases: (array, toMove) -> Expected output (array with all instances of toMove moved to the end)
    test_cases = [
        ([2, 1, 2, 2, 2, 3, 4, 2], 2),  # Test case 1: [1, 3, 4, 2, 2, 2, 2, 2]
        ([1, 3, 4, 5, 6, 2, 2, 2], 2),  # Test case 2: [1, 3, 4, 5, 6, 2, 2, 2]
        ([2, 2, 2, 2, 2, 2], 2),  # Test case 3: [2, 2, 2, 2, 2, 2]
        ([5, 1, 6, 2, 3, 2], 2),  # Test case 4: [5, 1, 6, 3, 2, 2]
        ([0, 0, 1, 2, 0, 0, 3], 0),  # Test case 5: [3, 1, 2, 0, 0, 0, 0]
        ([1, 2, 3, 4, 5], 6),  # Test case 6: [1, 2, 3, 4, 5]
        ([6, 6, 6, 6], 6),  # Test case 7: [6, 6, 6, 6]
        ([2, 1, 2, 3, 2, 4], 3),  # Test case 8: [2, 1, 2, 4, 2, 3]
        ([1, 9, 2, 7, 2, 8], 7),  # Test case 9: [1, 9, 2, 8, 2, 7]
        ([4, 2, 2, 4, 2, 4, 2], 4)  # Test case 10: [2, 2, 2, 2, 4, 4, 4]
    ]

    # Run test cases
    for i, (array, toMove) in enumerate(test_cases):
        result = moveElementToEnd(array, toMove)
        print(f"Test case {i + 1}: {result}")

# Execute the test cases if this script is run directly
if __name__ == "__main__":
    run_tests()