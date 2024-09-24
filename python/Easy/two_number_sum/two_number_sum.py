# O(n) time | O(n) space
def twoNumberSum(array, targetSum):
    """
    Finds two numbers in the array that add up to the targetSum.

    Parameters:
    array (list): List of integers.
    targetSum (int): The target sum to find in the array.

    Returns:
    list: A list containing the two numbers that add up to targetSum, or an empty list if no such numbers are found.
    """
    # Dictionary to store numbers we've seen so far
    dict = {}

    # Iterate through each number in the array
    for num in array:
        # Calculate the difference needed to reach targetSum
        diff = targetSum - num

        # Check if the difference is already in the dictionary
        if diff in dict:
            # If found, return the pair of numbers that add up to targetSum
            return [num, diff]
        else:
            # Otherwise, add the current number to the dictionary
            dict[num] = True

    # Return an empty list if no pair is found
    return []