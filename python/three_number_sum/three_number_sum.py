# O(n^2) time | O(n) space
def threeNumberSum(array, targetSum):
    # Sort the array to enable the two-pointer technique.
    array.sort()

    # Initialize the list to store the triplets that sum up to targetSum.
    triplets = []

    # Iterate through the array to fix the first element of the triplet.
    for i in range(len(array) - 2):
        left = i + 1  # Initialize the left pointer to the element right after i.
        right = len(array) - 1  # Initialize the right pointer to the last element.

        # Use the two-pointer technique to find pairs that, along with array[i], sum up to targetSum.
        while left < right:
            # Calculate the current sum of the triplet.
            currentSum = array[i] + array[left] + array[right]

            if currentSum == targetSum:
                # If the current sum matches the target, add the triplet to the list.
                triplets.append([array[i], array[left], array[right]])

                # Move both pointers to find new potential triplets.
                right -= 1
                left += 1
            elif currentSum < targetSum:
                # If the current sum is less than the target, move the left pointer to increase the sum.
                left += 1
            else:
                # If the current sum is greater than the target, move the right pointer to decrease the sum.
                right -= 1

    # Return the list of triplets that sum up to targetSum.
    return triplets