package main.java.com.example.minrewards;

import java.util.Arrays;

public class MinRewards {
	// O(n) time | O(n) space, where n is the length of the input array
	public static int minRewards(int[] scores) {
		// Initialize the rewards array with 1 reward for each student.
		int[] rewards = new int[scores.length];
		Arrays.fill(rewards, 1);

		// Forward pass: Ensure rewards increase for increasing scores from left to right, based on the provided rules.
		for (int i = 1; i < scores.length; i++) {
			if (scores[i] > scores[i - 1]) {
				rewards[i] = rewards[i - 1] + 1;
			}
		}

		// Backward pass: Ensure rewards increase for increasing scores from right to left, based on the provided rules.
		for (int i = scores.length - 2; i >= 0; i--) {
			if (scores[i] > scores[i + 1]) {
				rewards[i] = Math.max(rewards[i], rewards[i + 1] + 1);
			}
		}

		// Calculate the total sum of rewards.
		int totalRewards = 0;
		for (int reward : rewards) {
			totalRewards += reward;
		}

		// Return the total sum of rewards.
		return totalRewards;
	}
}
