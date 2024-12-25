# Solution 1. To use Solution 1, uncomment Solution 1, and comment out Solution 2 instead.
# O(n) time | O(n) space, where n is the length of the input array
# Function to return the first duplicate value in an array.
# def firstDuplicateValue(array):
#     # Create a set to track the seen values.
#     seen = set()
#
#     # Iterate through the array.
#     for value in array:
#         # If the value is already in the set, return it as the first duplicate.
#         if value in seen:
#             return value
#
#         # Add the current value to the set.
#         seen.add(value)
#
#     # If no duplicate is found, return -1.
#     return -1

# Solution 2.
# O(n) time | O(1) space, where n is the length of the input array
# Function to return the first duplicate value in an array.
def firstDuplicateValue(array):
    # Iterate through the array.
    for value in array:
        # Get the absolute value of the current element.
        absValue = abs(value)

        # Check if the value at index (absValue - 1) is negative.
        if array[absValue - 1] < 0:
            return absValue # The value is a duplicate, return it as the first duplicate.

        # Mark the value at index (absValue - 1) as visited by making it negative.
        array[absValue - 1] *= -1

    # If no duplicate is found, return -1.
    return -1
