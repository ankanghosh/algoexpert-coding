# O(t*n) time | O(t) space;
# where t is the number of test cases and n is the length of the array.
from subarray_sort import subarraySort

def run_tests():
    """
    Runs a series of test cases to validate the functionality of the subarraySort function.
    """

    # Test cases: (array) -> Expected output (start index, end index of the subarray to sort).
    test_cases = [
        [1, 2, 4, 7, 10, 11, 7, 12, 6, 7, 16, 18, 19],    # Test case 1: Expected: [3, 9]
        [1, 2],    # Test case 2: Expected: [-1, -1]
        [2, 1],    # Test case 3: Expected: [0, 1]
        [1, 2, 4, 7, 10, 11, 7, 12, 7, 7, 16, 18, 19],    # Test case 4: Expected: [4, 9]
        [1, 2, 4, 7, 10, 11, 7, 12, 13, 14, 16, 18, 19],    # Test case 5: Expected: [4, 6]
        [1, 2, 8, 4, 5],    # Test case 6: Expected: [2, 4]
        [4, 8, 7, 12, 11, 9, -1, 3, 9, 16, -15, 51, 7],    # Test case 7: Expected: [0, 12]
        [4, 8, 7, 12, 11, 9, -1, 3, 9, 16, -15, 11, 57],    # Test case 8: Expected: [0, 11]
        [-41, 8, 7, 12, 11, 9, -1, 3, 9, 16, -15, 11, 57],    # Test case 9: Expected: [1, 11]
        [-41, 8, 7, 12, 11, 9, -1, 3, 9, 16, -15, 51, 7],    # Test case 10: Expected: [1, 12]
        [1, 2, 3, 4, 5, 6, 8, 7, 9, 10, 11],    # Test case 11: Expected: [6, 7]
        [1, 2, 3, 4, 5, 6, 18, 7, 9, 10, 11, 12, 13, 14, 15, 16, 17, 19],    # Test case 12: Expected: [6, 16]
        [1, 2, 3, 4, 5, 6, 18, 21, 22, 7, 14, 9, 10, 11, 12, 13, 14, 15, 16, 17, 19, 4, 14, 11, 6, 33, 35, 41, 55],    # Test case 13: Expected: [4, 24]
        [1, 2, 20, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19],    # Test case 14: Expected: [2, 19]
        [1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 2],    # Test case 15: Expected: [2, 19]
        [1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20],    # Test case 16: Expected: [-1, -1]
        [0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89]    # Test case 17: Expected: [-1, -1]
    ]

    # Run the test cases.
    for i, array in enumerate(test_cases):
        result = subarraySort(array)
        print(f"Test case {i + 1}: Array = {array} -> Result: {result}")

# Execute the test cases if this script is run directly.
if __name__ == "__main__":
    run_tests()