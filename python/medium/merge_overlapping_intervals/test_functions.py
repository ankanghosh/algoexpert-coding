from merge_overlapping_intervals import mergeOverlappingIntervals

# Function to test the mergeOverlappingIntervals() function with various cases.
# O(t * nlog(n)) time | O(t * n) space;
# where t is the number of test cases and n is the length of the input array
def run_tests():
    """
    Runs a series of test cases to validate the functionality of the mergeOverlappingIntervals() function.
    """

    # Test cases: (intervals) -> Expected output (merged intervals)
    test_cases = [
        [[1, 2], [3, 5], [4, 7], [6, 8], [9, 10]], # Test case 1 - Expected: [[1, 2], [3, 8], [9, 10]]
        [[1, 3], [2, 8], [9, 10]], # Test case 2 - Expected: [[1, 8], [9, 10]]
        [[1, 10], [10, 20], [20, 30], [30, 40], [40, 50], [50, 60], [60, 70], [70, 80], [80, 90], [90, 100]], # Test case 3 - Expected: [[1, 100]]
        [[1, 10], [11, 20], [21, 30], [31, 40], [41, 50], [51, 60], [61, 70], [71, 80], [81, 90], [91, 100]], # Test case 4 - Expected: [[1, 10], [11, 20], [21, 30], [31, 40], [41, 50], [51, 60], [61, 70], [71, 80], [81, 90], [91, 100]]
        [[100, 105], [1, 104]], # Test case 5 - Expected: [[1, 105]]
        [[89, 90], [-10, 20], [-50, 0], [70, 90], [90, 91], [90, 95]], # Test case 6 - Expected: [[-50, 20], [70, 95]]
        [[-5, -4], [-4, -3], [-3, -2], [-2, -1], [-1, 0]], # Test case 7 - Expected: [[-5, 0]]
        [[43, 49], [9, 12], [12, 54], [45, 90], [91, 93]], # Test case 8 - Expected: [[9, 90], [91, 93]]
        [[0, 0], [0, 0], [0, 0], [0, 0], [0, 0], [0, 0], [0, 0]], # Test case 9 - Expected: [[0, 0]]
        [[0, 0], [0, 0], [0, 0], [0, 0], [0, 0], [0, 0], [0, 1]], # Test case 10 - Expected: [[0, 1]]
        [[1, 22], [-20, 30]], # Test case 11 - Expected: [[-20, 30]]
        [[20, 21], [22, 23], [0, 1], [3, 4], [23, 24], [25, 27], [5, 6], [7, 19]], # Test case 12 - Expected: [[0, 1], [3, 4], [5, 6], [7, 19], [20, 21], [22, 24], [25, 27]]
        [[2, 3], [4, 5], [6, 7], [8, 9], [1, 10]], # Test case 13 - Expected: [[1, 10]]
    ]

    # Run test cases.
    for i, intervals in enumerate(test_cases):
        result = mergeOverlappingIntervals(intervals)
        print(f"Test case {i + 1}: intervals = {intervals} -> Result: {result}")

# Execute the test cases if this script is run directly.
if __name__ == "__main__":
    run_tests()