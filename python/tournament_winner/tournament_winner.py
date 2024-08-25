# O(n) time | O(k) space;
# where n is the number of competitions and k is the number of teams
def tournamentWinner(competitions, results):
    # Initialize the current best team and the scores dictionary
    currentBestTea = ""
    scores = {currentBestTeam: 0}

    # Iterate through each competition and its result
    for idx, competition in enumerate(competitions):
        # Extract the home team and away team from the competition
        homeTeam, awayTeam = competition
        # Get the result of the current competition
        result = results[idx]

        # Determine the winning team based on the result
        winningTeam = homeTeam if result == 1 else awayTeam

        # Initialize the winning team's score if not already present
        if winningTeam not in scores:
            scores[winningTeam] = 0

        # Add 3 points to the winning team's score
        scores[winningTeam] += 3

        # Update the current best team if the winning team's score is higher
        if scores[winningTeam] > scores[currentBestTeam]:
            currentBestTeam = winningTeam

    # Return the team with the highest score
    return currentBestTeam