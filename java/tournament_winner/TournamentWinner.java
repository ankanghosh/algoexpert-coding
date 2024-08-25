package main.java.com.example.tournamentwinner;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class TournamentWinner {


	// O(n) time | O(k) space;
	// where n is the length of arrayOne and m is the length of arrayTwo
	public static String tournamentWinner(ArrayList<ArrayList<String>> competitions, ArrayList<Integer> results) {
        // Initialize the current best team with an empty string and create a map to keep track of team scores
        String currentBestTeam = "";
        Map<String, Integer> scores = new HashMap<>();
        // Set the initial score of the current best team (empty string) to 0
        scores.put(currentBestTeam, 0);
        
        // Iterate through each competition
        for (int i = 0; i < competitions.size(); i++) {
            // Retrieve the current competition's teams and result
            ArrayList<String> competition = competitions.get(i);
            String homeTeam = competition.get(0);
            String awayTeam = competition.get(1);
            int result = results.get(i);
            
            // Determine the winning team based on the result
            String winningTeam = result == 1 ? homeTeam : awayTeam;
    
            // Update the score for the winning team by adding 3 points
            scores.put(winningTeam, scores.getOrDefault(winningTeam, 0) + 3);

            // Check if the current winning team's score is higher than the current best team's score
            if (scores.get(winningTeam) > scores.get(currentBestTeam)) {
                // Update the current best team to the new winning team
                currentBestTeam = winningTeam;
            }
        }

        // Return the name of the team with the highest score
        return currentBestTeam;
    }
}