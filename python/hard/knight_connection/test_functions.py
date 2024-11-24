from knight_connection import knightConnection

# Function to test the knightConnection function with various cases.
# O(t * n * m) time | O(t * n * m) space;
# where t is the number of test cases,
# and n and m are the horizontal and vertical distances between the two knights, respectively
def run_tests():
    """
    Runs a series of test cases to validate the functionality of the knightConnection function.
    """

    # Test cases: (knightA, knightB) -> Expected output (minimum turns for one knight to capture the other)
    test_cases = [
        ([0, 0], [0, 0]), # Test case 1 - Expected: 0
        ([15, -12], [15, -12]), # Test case 2 - Expected: 0
        ([1, 0], [0, 0]), # Test case 3 - Expected: 2
        ([0, 0], [1, 0]), # Test case 4 - Expected: 2
        ([1, 1], [0, 0]), # Test case 5 - Expected: 1
        ([0, 0], [-1, -1]), # Test case 6 - Expected: 1
        ([2, 1], [0, 0]), # Test case 7 - Expected: 1
        ([3, 3], [0, 0]), # Test case 8 - Expected: 1
        ([2, 1], [-1, -2]), # Test case 9 - Expected: 1
        ([2, 1], [-2, -4]), # Test case 10 - Expected: 2
        ([5, 2], [-2, -4]), # Test case 11 - Expected: 3
        ([10, 10], [-10, -10]), # Test case 12 - Expected: 7
        ([15, 15], [-10, -10]), # Test case 13 - Expected: 9
        ([-15, 2], [-3, 20]), # Test case 14 - Expected: 5
        ([20, 20], [0, 0]), # Test case 15 - Expected: 7
        ([18, -13], [0, 12]) # Test case 16 - Expected: 8
    ]

    # Run test cases.
    for i, (knightA, knightB) in enumerate(test_cases):
        result = knightConnection(knightA, knightB)
        print(f"Test case {i + 1}: knightA = {knightA}, knightB = {knightB} -> Result: {result}")

# Execute the test cases if this script is run directly.
if __name__ == "__main__":
    run_tests()