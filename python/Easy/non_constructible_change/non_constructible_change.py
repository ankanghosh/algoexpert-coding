# O(nlogn) time | O(1) space, where n is the number of coins
def nonConstructibleChange(coins):
    # Check if the coins array is empty
    if len(coins) == 0:
        # If there are no coins, the minimum non-constructible change is 1
        return 1

    # Sort the coins in ascending order
    coins.sort()

    # Track the maximum amount of change we can create
    currentChangeCreated = 0

    # Iterate over each coin in the sorted coins array
    for coin in coins:
        # If the current coin is greater than the current amount of change we can create + 1,
        # then we cannot create currentChangeCreated + 1
        if coin > currentChangeCreated + 1:
            return currentChangeCreated + 1

        # Add the current coin to the running total of change we can create
        currentChangeCreated += coin

    # If all of the coins are processed, return the next non-constructible change
    return currentChangeCreated + 1