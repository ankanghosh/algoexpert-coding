from spiral_traverse import spiralTraverse

# Function to test the spiralTraverse function with various cases
# O(t * n) time | O(t * n) space;
# where t is the number of test cases and n is the total number of
# elements in the two-dimensional array
def run_tests():
    """
    Runs a series of test cases to validate the functionality of the spiralTraverse function.
    """

    # Test cases: (array) -> Expected output (one-dimensional array of all the array’s elements in spiral order)
    test_cases = [
        ([
            [1, 2, 3, 4],
            [12, 13, 14, 5],
            [11, 16, 15, 6],
            [10, 9, 8, 7]
        ]),  # Test case 1: [1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16]

        ([
            [1]
        ]),  # Test case 2: [1]

        ([
            [1, 2],
            [4, 3]
        ]),  # Test case 3: [1, 2, 3, 4]

        ([
            [1, 2, 3],
            [8, 9, 4],
            [7, 6, 5]
        ]),  # Test case 4: [1, 2, 3, 4, 5, 6, 7, 8, 9]

        ([
            [19, 32, 33, 34, 25, 8],
            [16, 15, 14, 13, 12, 11],
            [18, 31, 36, 35, 26, 9],
            [1, 2, 3, 4, 5, 6],
            [20, 21, 22, 23, 24, 7],
            [17, 30, 29, 28, 27, 10]
        ]),  # Test case 5: [19, 32, 33, 34, 25, 8, 11, 9, 6, 7, 10, 27, 28, 29, 30, 17, 20, 1, 18, 16, 15, 14, 13, 12, 26, 5, 24, 23, 22, 21, 2, 31, 36, 35, 4, 3]

        ([
            [4, 2, 3, 6, 7, 8, 1, 9, 5, 10],
            [12, 19, 15, 16, 20, 18, 13, 17, 11, 14]
        ]),  # Test case 6: [4, 2, 3, 6, 7, 8, 1, 9, 5, 10, 14, 11, 17, 13, 18, 20, 16, 15, 19, 12]

        ([
            [27, 12, 35, 26],
            [25, 21, 94, 11],
            [19, 96, 43, 56],
            [55, 36, 10, 18],
            [96, 83, 31, 94],
            [93, 11, 90, 16]
        ]),  # Test case 7: [27, 12, 35, 26, 11, 56, 18, 94, 16, 90, 11, 93, 96, 55, 19, 25, 21, 94, 43, 10, 31, 83, 36, 96]

        ([
            [1, 2, 3, 4],
            [10, 11, 12, 5],
            [9, 8, 7, 6]
        ]),  # Test case 8: [1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12]

        ([
            [1, 2, 3],
            [12, 13, 4],
            [11, 14, 5],
            [10, 15, 6],
            [9, 8, 7]
        ]),  # Test case 9: [1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15]

        ([
            [1, 11],
            [2, 12],
            [3, 13],
            [4, 14],
            [5, 15],
            [6, 16],
            [7, 17],
            [8, 18],
            [9, 19],
            [10, 20]
        ]),  # Test case 10: [1, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 10, 9, 8, 7, 6, 5, 4, 3, 2]

        ([
            [1, 3, 2, 5, 4, 7, 6]
        ]),  # Test case 11: [1, 3, 2, 5, 4, 7, 6]

        ([
            [1],
            [3],
            [2],
            [5],
            [4],
            [7],
            [6]
        ])  # Test case 12: [1, 3, 2, 5, 4, 7, 6]
    ]

    # Run test cases
    for i, (array) in enumerate(test_cases):
        result = spiralTraverse(array)
        print(f"Test case {i + 1}: Result: {result}")

# Execute the test cases if this script is run directly
if __name__ == "__main__":
    run_tests()