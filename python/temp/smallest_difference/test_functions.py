from smallest_difference import smallestDifference

# Function to test the smallestDifference function with various cases
# O(t * (n log n + m log m)) time | O(t * (n + m)) space;
# where t is the number of test cases, n is the length of arrayOne, and m is the length of arrayTwo
def run_tests():
    """
    Runs a series of test cases to validate the functionality of the smallestDifference function.
    """

    # Test cases: (arrayOne, arrayTwo) -> Expected output (pair with the smallest difference)
    test_cases = [
        ([1, 3, 15, 11, 2], [23, 127, 235, 19, 8]),  # Test case 1: [11, 8]
        ([10, 20, 30, 40], [25, 35, 45, 55]),  # Test case 2: [20, 25]
        ([5, 8, 15], [30, 12, 5]),  # Test case 3: [5, 5]
        ([3, 6, 9, 12], [7, 10, 13, 1]),  # Test case 4: [6, 7]
        ([1, 2, 3], [4, 5, 6]),  # Test case 5: [3, 4]
        ([4, 6, 10, 20], [3, 8, 15]),  # Test case 6: [4, 3]
        ([1, 100, 1000], [99, 200, 300]),  # Test case 7: [100, 99]
        ([-1, -5, 10], [-6, -2, 7]),  # Test case 8: [-5, -6]
        ([1, 4, 7], [2, 5, 8]),  # Test case 9: [1, 2]
        ([0, 2, 4, 6], [3, 5, 7, 9]),  # Test case 10: [2, 3]
    ]

    # Run test cases
    for i, (arrayOne, arrayTwo) in enumerate(test_cases):
        result = smallestDifference(arrayOne, arrayTwo)
        print(f"Test case {i + 1}: ArrayOne = {arrayOne}, ArrayTwo = {arrayTwo} -> Result: {result}")


# Execute the test cases if this script is run directly
if __name__ == "__main__":
    run_tests()