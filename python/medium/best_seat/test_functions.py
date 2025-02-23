from best_seat import bestSeat

# Function to test the bestSeat() function with various cases.
# O(t * n) time | O(t) space;
# where t is the number of test cases and n is the total number of seats in a row
def run_tests():
    """
    Runs a series of test cases to validate the functionality of the bestSeat() function.
    """

    # Test cases: (seats) -> Expected output (best seat index)
    test_cases = [
        [1],  # Test case 1 - Expected: -1
        [1, 0, 1, 0, 0, 0, 1],  # Test case 2 - Expected: 4
        [1, 0, 1],  # Test case 3 - Expected: 1
        [1, 0, 0, 1],  # Test case 4 - Expected: 1
        [1, 1, 1],  # Test case 5 - Expected: -1
        [1, 0, 0, 1, 0, 0, 1],  # Test case 6 - Expected: 1
        [1, 0, 0, 0, 0, 0, 0, 1, 0, 0, 1],  # Test case 7 - Expected: 3
        [1, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 1],  # Test case 8 - Expected: 4
        [1, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 1],  # Test case 9 - Expected: 4
        [1, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1],  # Test case 10 - Expected: 13
        [1, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 1],  # Test case 11 - Expected: 13
        [1, 0, 0, 0, 1, 0, 0, 0, 0, 1],  # Test case 12 - Expected: 6
        [1, 1, 1, 0, 1, 0, 1, 1, 1, 0, 1],  # Test case 13 - Expected: 3
        [1, 1, 1, 0, 1, 0, 0, 1, 1, 1, 0, 0, 1],  # Test case 14 - Expected: 5
    ]

    # Run test cases.
    for i, seats in enumerate(test_cases):
        result = bestSeat(seats)
        print(f"Test case {i + 1}: seats = {seats} -> Result: {result}")

# Execute the test cases if this script is run directly.
if __name__ == "__main__":
    run_tests()