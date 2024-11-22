package main.java.com.example.arrayofproducts;

public class ArrayOfProducts {
	// O(n) time | O(n) space, where n is the length of the input array
	public static int[] arrayOfProducts(int[] array) {
		// Create an array to store the result products.
		int[] products = new int[array.length];

		// Compute the left-running product for each index.
		// This is the product of all numbers to the left of the current index.
		int leftRunningProduct = 1;
		for (int i = 0; i < array.length; i++) {
			products[i] = leftRunningProduct; // Store the current left-running product.
			leftRunningProduct *= array[i];  // Update the left-running product.
		}

		// Compute the right-running product for each index.
		// Multiply it with the left-running product already stored in "products".
		int rightRunningProduct = 1;
		for (int i = array.length - 1; i >= 0; i--) {
			products[i] *= rightRunningProduct; // Multiply the left- and right-running product for each index.
			rightRunningProduct *= array[i];   // Update the right-running product.
		}

		// Return the final array where each element represents the product of all elements except the current index.
		return products;
	}
}