# O(n) time | O(1) space, where n is the length of the array.
def subarraySort(array):
    # Initialize variables to track the smallest and largest out-of-order elements.
    minOutOfOrder = float("inf")
    maxOutOfOrder = float("-inf")

    # Iterate through the array to identify any out-of-order elements.
    for i in range(len(array)):
        num = array[i]
        # Check if the current element is out of order using the helper function.
        if isOutOfOrder(i, num, array):
            # Update the smallest out-of-order value.
            minOutOfOrder = min(num, minOutOfOrder)
            # Update the largest out-of-order value.
            maxOutOfOrder = max(num, maxOutOfOrder)

    # If no out-of-order elements were found, the array is already sorted.
    if minOutOfOrder == float("inf"):
        return [-1, -1]

    # Find the left index of the subarray that needs to be sorted.
    subArrayLeftIdx = 0
    # Increment the left index until we find where the minOutOfOrder value belongs.
    while minOutOfOrder >= array[subArrayLeftIdx]:
        subArrayLeftIdx += 1

    # Find the right index of the subarray that needs to be sorted.
    subArrayRightIdx = len(array) - 1
    # Decrement the right index until we find where the maxOutOfOrder value belongs.
    while maxOutOfOrder <= array[subArrayRightIdx]:
        subArrayRightIdx -= 1

    # Return the starting and ending indices of the smallest subarray that needs to be sorted.
    return [subArrayLeftIdx, subArrayRightIdx]

def isOutOfOrder(i, num, array):
    # If the element is at the beginning of the array,
    # check if it is greater than the next element.
    if i == 0:
        return num > array[i + 1]
    # If the element is at the end of the array,
    # check if it is smaller than the previous element.
    elif i == len(array) - 1:
        return num < array[i - 1]
    # For each of the other elements, check if it is smaller than the previous element
    # or greater than the next element, indicating it is out of order.
    else:
        return num < array[i - 1] or num > array[i + 1]