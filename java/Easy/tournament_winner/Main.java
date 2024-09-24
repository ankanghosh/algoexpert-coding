package main.java.com.example.tournamentwinner;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {

	// O(t * n) time | O(t * k) space;
	// where t is the number of test cases, n is the number of competitions, and k is the number of teams
    public static void main(String[] args) {
        // Test cases: (competitions, results) -> Expected output (winning team)
        Object[][] testCases = {
            {
                new ArrayList<>(Arrays.asList(
                    new ArrayList<>(Arrays.asList("Python", "JavaScript")),
                    new ArrayList<>(Arrays.asList("JavaScript", "Java")),
                    new ArrayList<>(Arrays.asList("Java", "Python"))
                )),
                new ArrayList<>(Arrays.asList(1, 0, 1))  // Test case 1: Java
            },
            {
                new ArrayList<>(Arrays.asList(
                    new ArrayList<>(Arrays.asList("HTML", "CSS")),
                    new ArrayList<>(Arrays.asList("Python", "Ruby")),
                    new ArrayList<>(Arrays.asList("HTML", "Python")),
                    new ArrayList<>(Arrays.asList("CSS", "Ruby"))
                )),
                new ArrayList<>(Arrays.asList(1, 0, 1, 0))  // Test case 2: HTML
            },
            {
                new ArrayList<>(Arrays.asList(
                    new ArrayList<>(Arrays.asList("C#", "PHP")),
                    new ArrayList<>(Arrays.asList("PHP", "Ruby")),
                    new ArrayList<>(Arrays.asList("Ruby", "C#"))
                )),
                new ArrayList<>(Arrays.asList(1, 1, 0))  // Test case 3: C#
            },
            {
                new ArrayList<>(Arrays.asList(
                    new ArrayList<>(Arrays.asList("Go", "Swift")),
                    new ArrayList<>(Arrays.asList("Swift", "Kotlin")),
                    new ArrayList<>(Arrays.asList("Kotlin", "Rust")),
                    new ArrayList<>(Arrays.asList("Rust", "Go"))
                )),
                new ArrayList<>(Arrays.asList(1, 1, 1, 0))  // Test case 4: Go
            },
            {
                new ArrayList<>(Arrays.asList(
                    new ArrayList<>(Arrays.asList("TypeScript", "Dart")),
                    new ArrayList<>(Arrays.asList("Dart", "Lua")),
                    new ArrayList<>(Arrays.asList("Lua", "TypeScript"))
                )),
                new ArrayList<>(Arrays.asList(1, 0, 1))  // Test case 5: Lua
            },
            {
                new ArrayList<>(Arrays.asList(
                    new ArrayList<>(Arrays.asList("HTML", "CSS")),
                    new ArrayList<>(Arrays.asList("CSS", "XML")),
                    new ArrayList<>(Arrays.asList("XML", "HTML")),
                    new ArrayList<>(Arrays.asList("HTML", "CSS"))
                )),
                new ArrayList<>(Arrays.asList(1, 0, 1, 0))  // Test case 6: XML
            },
            {
                new ArrayList<>(Arrays.asList(
                    new ArrayList<>(Arrays.asList("Python", "JavaScript")),
                    new ArrayList<>(Arrays.asList("JavaScript", "Ruby")),
                    new ArrayList<>(Arrays.asList("Ruby", "Python")),
                    new ArrayList<>(Arrays.asList("Python", "Ruby")),
                    new ArrayList<>(Arrays.asList("JavaScript", "Python"))
                )),
                new ArrayList<>(Arrays.asList(0, 0, 1, 1, 1))  // Test case 7: Ruby
            },
            {
                new ArrayList<>(Arrays.asList(
                    new ArrayList<>(Arrays.asList("Perl", "Bash")),
                    new ArrayList<>(Arrays.asList("Bash", "PowerShell")),
                    new ArrayList<>(Arrays.asList("PowerShell", "Perl"))
                )),
                new ArrayList<>(Arrays.asList(1, 1, 0))  // Test case 8: Perl
            },
            {
                new ArrayList<>(Arrays.asList(
                    new ArrayList<>(Arrays.asList("C++", "Python")),
                    new ArrayList<>(Arrays.asList("Python", "Java")),
                    new ArrayList<>(Arrays.asList("C++", "JavaScript")),
                    new ArrayList<>(Arrays.asList("JavaScript", "Python")),
                    new ArrayList<>(Arrays.asList("C++", "Java"))
                )),
                new ArrayList<>(Arrays.asList(1, 1, 1, 0, 1))  // Test case 9: C++
            },
            {
                new ArrayList<>(Arrays.asList(
                    new ArrayList<>(Arrays.asList("Rust", "Go")),
                    new ArrayList<>(Arrays.asList("Go", "Swift")),
                    new ArrayList<>(Arrays.asList("Swift", "Kotlin")),
                    new ArrayList<>(Arrays.asList("Rust", "Kotlin"))
                )),
                new ArrayList<>(Arrays.asList(1, 0, 0, 1))  // Test case 10: Rust
            }
        };

        // Run and print the results of each test case
        for (int i = 0; i < testCases.length; i++) {
            ArrayList<ArrayList<String>> competitions = (ArrayList<ArrayList<String>>) testCases[i][0];
            ArrayList<Integer> results = (ArrayList<Integer>) testCases[i][1];

            // Run the method
            String result = TournamentWinner.tournamentWinner(competitions, results);

            // Print the result
            System.out.println("Test case " + (i + 1) + ": " + result);
        }
    }
}