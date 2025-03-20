from minimum_waiting_time import minimumWaitingTime

# Function to test the minimumWaitingTime() function with various cases.
# O(t * nlog(n)) time | O(t) space;
# where t is the number of test cases and n is the total number of queries
def run_tests():
    """
    Runs a series of test cases to validate the functionality of the minimumWaitingTime() function.
    """

    # Test cases: (queries) -> Expected output (minimum waiting time)
    test_cases = [
        [3, 2, 1, 2, 6],  # Test case 1 - Expected: 17
        [2, 1, 1, 1],  # Test case 2 - Expected: 6
        [1, 2, 4, 5, 2, 1],  # Test case 3 - Expected: 23
        [25, 30, 2, 1],  # Test case 4 - Expected: 32
        [1, 1, 1, 1, 1],  # Test case 5 - Expected: 10
        [7, 9, 2, 3],  # Test case 6 - Expected: 19
        [4, 3, 1, 1, 3, 2, 1, 8],  # Test case 7 - Expected: 45
        [2],  # Test case 8 - Expected: 0
        [7],  # Test case 9 - Expected: 0
        [8, 9],  # Test case 10 - Expected: 8
        [1, 9],  # Test case 11 - Expected: 1
        [5, 4, 3, 2, 1],  # Test case 12 - Expected: 20
        [1, 2, 3, 4, 5],  # Test case 13 - Expected: 20
        [1, 1, 1, 4, 5, 6, 8, 1, 1, 2, 1],  # Test case 14 - Expected: 81
        [17, 4, 3],  # Test case 15 - Expected: 10
    ]

    # Run test cases.
    for i, queries in enumerate(test_cases, 1):
        original_queries = queries[:]  # Copy before sorting
        result = minimumWaitingTime(queries)  # Function call
        print(f"Test case {i}: queries = {original_queries} -> Result: {result}")

# Execute the test cases if this script is run directly.
if __name__ == "__main__":
    run_tests()