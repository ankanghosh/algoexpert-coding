from monotonic_array import isMonotonic

# Function to test the isMonotonic function with various cases
# O(t * n) time | O(t) space;
# where t is the number of test cases and n is the length of the array
def run_tests():
    """
    Runs a series of test cases to validate the functionality of the isMonotonic function.
    """

    # Test cases: (array) -> Expected output (True / False if the array is monotonic)
    test_cases = [
        [-1, -5, -10, -1100, -1100, -1101, -1102, -9001],  # Test case 1: True
        [1, 2, 3, 4, 5],  # Test case 2: True
        [5, 4, 3, 2, 1],  # Test case 3: True
        [10, 20, 20, 30, 40],  # Test case 4: True
        [1, 2, 2, 3, 4, 5],  # Test case 5: True
        [100, 100, 100],  # Test case 6: True
        [1, 3, 2, 4],  # Test case 7: False
        [7, 5, 8, 6],  # Test case 8: False
        [10, 20, 30, 20],  # Test case 9: False
        [5, 3, 4, 2],  # Test case 10: False
    ]

    # Run test cases
    for i, array in enumerate(test_cases):
        result = isMonotonic(array)
        print(f"Test case {i + 1}: Array = {array} -> Result: {result}")


# Execute the test cases if this script is run directly
if __name__ == "__main__":
    run_tests()