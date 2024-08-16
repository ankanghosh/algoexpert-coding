from sorted_squared_array import sortedSquaredArray
# O(t * n) time | O(t * n) space, where t is the number of test cases and n is the length of the array
def run_tests():
    # Test cases: array as input
    test_cases = [
        [-7, -3, 1, 9, 22],  # Test case 1: [1, 9, 49, 81, 484]
        [-5, -4, -3, -2, -1],  # Test case 2: [1, 4, 9, 16, 25]
        [1, 2, 3, 4, 5],  # Test case 3: [1, 4, 9, 16, 25]
        [-10, -3, 0, 2, 5],  # Test case 4: [0, 4, 9, 25, 100]
        [0],  # Test case 5: [0]
        [1],  # Test case 6: [1]
        [-1],  # Test case 7: [1]
        [-3, -2, -1, 0, 1, 2, 3],  # Test case 8: [0, 1, 1, 4, 4, 9, 9]
        [2, 4, 6, 8],  # Test case 9: [4, 16, 36, 64]
        [-9, -8, -5, -4]  # Test case 10: [16, 25, 64, 81]
    ]

    # Run test cases
    for i, array in enumerate(test_cases):
        result = sortedSquaredArray(array)
        print(f"Test case {i + 1}: {result}")

    # Execute the test cases if this script is run directly

if __name__ == "__main__":
    run_tests()