# O(n log n + m log m) time | O(1) space
# where n is the length of arrayOne and m is the length of arrayTwo
def smallestDifference(arrayOne, arrayTwo):
    # Sort both arrays to allow for efficient comparison
    arrayOne.sort()
    arrayTwo.sort()

    # Initialize the indices for arrayOne and arrayTwo
    idxOne = 0
    idxTwo = 0

    # Initialize variables to track the smallest difference and the current difference
    smallestDiff = float("inf")
    currentDiff = float("inf")

    # Initialize an array to store the pair with the smallest difference
    smallestDiffPair = []

    # Iterate through both arrays until we exhaust one of them
    while idxOne < len(arrayOne) and idxTwo < len(arrayTwo):
        firstNum = arrayOne[idxOne]
        secondNum = arrayTwo[idxTwo]

        # If the current number in arrayOne is smaller, update the cuurent difference and move to the next number in arrayOne
        if firstNum < secondNum:
            currentDiff = secondNum - firstNum
            idxOne += 1
        # If the current number in arrayTwo is smaller, update the current difference and move to the next number in arrayTwo
        elif secondNum < firstNum:
            currentDiff = firstNum - secondNum
            idxTwo += 1
        # If the numbers are equal, then that is the smallest difference possible, so return the pair
        else:
            smallestDiffPair = [firstNum, secondNum]
            return smallestDiffPair

        # Update the smallest difference and the pair with the smallest difference if the current difference is smaller
        if currentDiff < smallestDiff:
            smallestDiff = currentDiff
            smallestDiffPair = [firstNum, secondNum]

    # Return the pair with the smallest difference found
    return smallestDiffPair