from collections import deque
import math

# O(n * m) time | O(n * m) space;
# where n and m are the horizontal and vertical distances between the two knights, respectively
def knightConnection(knightA, knightB):
    # Define all possible moves a knight can make on the chess board (L-shaped moves).
    possibleMoves = [[-2, 1], [-1, 2], [1, 2], [2, 1], [2, -1], [1, -2], [-1, -2], [-2, -1]]

    # Initialize the queue with the starting position of knightA and a move count of 0.
    queue = deque([[knightA[0], knightA[1], 0]])

    # Set to track visited positions to avoid revisiting them during the Breadth-First Search (BFS).
    visited = {positionToString(knightA)}

    # Begin BFS and continue until the list is empty.
    while True:
        # Dequeue the front position from the queue for processing.
        currentPosition = queue.popleft()

        # If we reach knightB's position, return the number of moves (half the total number of steps).
        if currentPosition[0] == knightB[0] and currentPosition[1] == knightB[1]:
            # Return the number of moves divided by 2.
            return math.ceil(currentPosition[2] / 2)

        # Explore all possible knight moves from the current position.
        for possibleMove in possibleMoves:
            # Calculate the new position by applying the possible move.
            position = [currentPosition[0] + possibleMove[0], currentPosition[1] + possibleMove[1]]

            # Convert the new position to a string for use in the visited set.
            positionString = positionToString(position)

            # If the new position has not been visited in the past, process further.
            if positionString not in visited:
                # Append the new position to the queue with an incremented move count.
                position.append(currentPosition[2] + 1)
                queue.append(position)

                # Mark the new position as visited.
                visited.add(positionString)

def positionToString(position):
    # Convert a position (a list of coordinates) to a string "x,y" format for easy storage in the visited set.
    return ", ".join(map(str, position))