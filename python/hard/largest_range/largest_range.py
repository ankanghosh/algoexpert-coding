# O(n) time | O(n) space, where n is the number of elements in the array
def largestRange(array):
    # Initialize variables to store the best range and the length of the longest range found so far
    bestRange = []
    longestLength = 0
    # Create a dictionary to keep track of the numbers that have been visited
    nums = {}

    # Populate the dictionary, setting all numbers to True, indicating they have not been visited yet
    for num in array:
        nums[num] = True

    # Iterate through each number in the array
    for num in array:
        # If the number has already been visited, skip it
        if not nums[num]:
            continue

        # Mark the number as visited
        nums[num] = False
        # Initialize the length of the current range to 1 (the current number itself)
        currentLength = 1
        # Set up pointers to check numbers to the left and right of the current number
        left = num - 1
        right = num + 1

        # Expand the range to the left
        while left in nums:
            # Mark the left number as visited
            nums[left] = False
            # Increase the length of the current range
            currentLength += 1
            # Move the left pointer further left
            left -= 1

        # Expand the range to the right
        while right in nums:
            # Mark the right number as visited
            nums[right] = False
            # Increase the length of the current range
            currentLength += 1
            # Move the right pointer further right
            right += 1

        # If the current range is longer than the longest range found so far, update the best range
        if currentLength > longestLength:
            longestLength = currentLength
            # Store the range as [left + 1, right - 1], since left and right are one step beyond the actual range
            bestRange = [left + 1, right - 1]

    # Return the best (largest) range found
    return bestRange