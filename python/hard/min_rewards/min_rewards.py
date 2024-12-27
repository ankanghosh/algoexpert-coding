# O(n) time | O(n) space, where n is the length of the input array
# Function to return the minimum number of rewards to be given out to students based on their scores in an array.
def minRewards(scores):
    # Initialize the rewards array with 1 reward for each student.
    rewards = [1 for _ in scores]

    # Forward pass: Ensure rewards increase for increasing scores from left to right, based on the provided rules.
    for i in range(1, len(scores)):
        if scores[i] > scores[i - 1]:
            rewards[i] = rewards[i - 1] + 1

    # Backward pass: Ensure rewards increase for increasing scores from right to left, based on the provided rules.
    for i in reversed(range(len(scores) - 1)):
        if scores[i] > scores[i + 1]:
            rewards[i] = max(rewards[i], rewards[i + 1] + 1)

    # Return the total sum of rewards.
    return sum(rewards)
