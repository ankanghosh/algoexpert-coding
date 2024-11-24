package main.java.com.example.knightconnection;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Set;

public class KnightConnection {
	// O(n * m) time | O(n * m) space;
	// where n and m are the horizontal and vertical distances between the two knights, respectively
	public static int knightConnection(int[] knightA, int[] knightB) {
		// Define all possible moves a knight can make on the chess board (L-shaped moves).
		int[][] possibleMoves = {
				{-2, 1}, {-1, 2}, {1, 2}, {2, 1},
				{2, -1}, {1, -2}, {-1, -2}, {-2, -1}
		};

		// Initialize the queue with the starting position of knightA and a move count of 0.
		Queue<int[]> queue = new LinkedList<>();
		queue.add(new int[]{knightA[0], knightA[1], 0});


		// Set to track visited positions to avoid revisiting them during the Breadth-First Search (BFS).
		Set<String> visited = new HashSet<>();
		visited.add(positionToString(knightA));

		// Begin BFS and continue until the list is empty.
		while (!queue.isEmpty()) {
			// # Dequeue the front position from the queue for processing.
			int[] currentPosition = queue.poll();

			// If we reach knightB's position, return the number of moves (half the total number of steps).
			if (currentPosition[0] == knightB[0] && currentPosition[1] == knightB[1]) {
				// Return the number of moves divided by 2.
				return (int) Math.ceil(currentPosition[2] / 2.0);
			}

			// Explore all possible knight moves from the current position.
			for (int[] move : possibleMoves) {
				// Calculate the new position by applying the possible move.
				int[] position = {
						currentPosition[0] + move[0],
						currentPosition[1] + move[1]
				};

				// Convert the new position to a string for use in the visited set.
				String positionString = positionToString(position);

				// If the new position has not been visited in the past, process further.
				if (!visited.contains(positionString)) {
					// Append the new position to the queue with an incremented move count.
					queue.add(new int[]{position[0], position[1], currentPosition[2] + 1});

					// Mark the new position as visited.
					visited.add(positionString);
				}
			}
		}

		// Return -1 if no solution is found (should not happen on an infinite board).
		return -1;
	}

	// Convert a position (a list of coordinates) to a string "x, y" format for easy storage in the visited set.
	private static String positionToString(int[] position) {
		return position[0] + ", " + position[1];
	}
}