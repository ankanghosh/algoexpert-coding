# Average: O(n^2) time | O(n^2) space;
# Worst: O(n^3) time | O(n^2) space;
# where n is the length of the array
def fourNumberSum(array, targetSum):
    # Initialize a dictionary to store pairs of numbers and their sums
    allPairSums = {}
    # Initialize a list to store the resulting quadruplets
    quadruplets = []

    # Iterate over the array starting from the second element up to the second last element
    for i in range(1, len(array) - 1):
        # Iterate over the elements to the right of the current element
        for j in range(i + 1, len(array)):
            currentSum = array[i] + array[j]  # Calculate the sum of the current pair
            difference = targetSum - currentSum  # Calculate the difference required to reach the targetSum

            # If the difference is in the dictionary, it means we have found some pairs that can form quadruplets
            if difference in allPairSums:
                for pair in allPairSums[difference]:
                    # Append the quadruplet to the result list
                    quadruplets.append(pair + [array[i], array[j]])

        # Iterate over the elements to the left of the current element
        for k in range(i):
            currentSum = array[i] + array[k]  # Calculate the sum of the current pair
            # Store the pair sum and the pair itself in the dictionary
            if currentSum not in allPairSums:
                allPairSums[currentSum] = [[array[k], array[i]]]
            else:
                allPairSums[currentSum].append([array[k], array[i]])

    return quadruplets  # Return the list of all quadruplets found