from non_constructible_change import nonConstructibleChange

# Function to test the nonConstructibleChange function with various cases
# O(t * nlogn) time | O(t * n) space;
# where t is the number of test cases and n is the number of coins
def run_tests():
    """
    Runs a series of test cases to validate the functionality of the nonConstructibleChange function.
    """

    # Test cases: (array) -> Expected output (minimum amount of change that cannot be created)
    test_cases = [
        [5, 7, 1, 1, 2, 3, 22],         # Test case 1: 20
        [1, 1, 1, 1, 1],                # Test case 2: 6
        [1, 5, 1, 1, 1, 10, 15, 20, 100], # Test case 3: 55
        [6, 4, 5, 1, 1, 8, 9],          # Test case 4: 3
        [],                             # Test case 5: 1
        [87],                           # Test case 6: 1
        [5, 6, 1, 1, 2, 3, 4, 9],       # Test case 7: 32
        [5, 6, 1, 1, 2, 3, 43],         # Test case 8: 19
        [1, 1],                         # Test case 9: 3
        [2],                            # Test case 10: 1
        [1],                            # Test case 11: 2
        [109, 2000, 8765, 19, 18, 17, 16, 8, 1, 1, 2, 4], # Test case 12: 87
        [1, 2, 3, 4, 5, 6, 7],          # Test case 13: 29
    ]

    # Run test cases
    for i, coins in enumerate(test_cases):
        original_coins = coins[:]  # Make a copy of the original unsorted coins list
        result = nonConstructibleChange(coins)
        print(f"Test case {i + 1}: Coins = {original_coins} -> Result: {result}")


# Execute the test cases if this script is run directly
if __name__ == "__main__":
    run_tests()