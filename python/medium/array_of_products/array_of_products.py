# O(n) time | O(n) space, where n is the length of the input array
def arrayOfProducts(array):
    # Create an array to store the result products. Initialize with 1s.
    products = [1 for _ in range(len(array))]

    # Compute the left-running product for each index.
    # This is the product of all numbers to the left of the current index.
    leftRunningProduct = 1
    for i in range(len(array)):
        products[i] = leftRunningProduct  # Store the current left-running product.
        leftRunningProduct *= array[i]   # Update the left-running product.

    # Compute the right-running product for each index.
    # Multiply it with the left-running product already stored in "products".
    rightRunningProduct = 1
    for i in reversed(range(len(array))):
        products[i] *= rightRunningProduct  # Multiply the left- and right-running product for each index.
        rightRunningProduct *= array[i]    # Update the right-running product.

    # Return the final array where each element represents the product of all elements except the current index.
    return products