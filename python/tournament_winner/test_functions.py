from tournament_winner import tournamentWinner

# Function to test the tournamentWinner function with various cases
# O(t * n) time | O(t * k) space;
# where t is the number of test cases, n is the number of competitions, and k is the number of teams
def run_tests():
    """
    Runs a series of test cases to validate the functionality of the tournamentWinner function.
    """

    # Test cases: (competitions, results) -> Expected output (team with the highest score)
    test_cases = [
        ([
             ["Python", "JavaScript"],
             ["JavaScript", "Java"],
             ["Java", "Python"]
         ], [1, 0, 1]),  # Test case 1: Java

        ([
             ["HTML", "CSS"],
             ["Python", "Ruby"],
             ["HTML", "Python"],
             ["CSS", "Ruby"]
         ], [1, 0, 1, 0]),  # Test case 2: HTML

        ([
             ["C#", "PHP"],
             ["PHP", "Ruby"],
             ["Ruby", "C#"]
         ], [1, 1, 0]),  # Test case 3: C#

        ([
             ["Go", "Swift"],
             ["Swift", "Kotlin"],
             ["Kotlin", "Rust"],
             ["Rust", "Go"]
         ], [1, 1, 1, 0]),  # Test case 4: Go

        ([
             ["TypeScript", "Dart"],
             ["Dart", "Lua"],
             ["Lua", "TypeScript"]
         ], [1, 0, 1]),  # Test case 5: Lua

        ([
             ["HTML", "CSS"],
             ["CSS", "XML"],
             ["XML", "HTML"],
             ["HTML", "CSS"]
         ], [1, 0, 1, 0]),  # Test case 6: XML

        ([
             ["Python", "JavaScript"],
             ["JavaScript", "Ruby"],
             ["Ruby", "Python"],
             ["Python", "Ruby"],
             ["JavaScript", "Python"]
         ], [0, 0, 1, 1, 1]),  # Test case 7: Ruby

        ([
             ["Perl", "Bash"],
             ["Bash", "PowerShell"],
             ["PowerShell", "Perl"]
         ], [1, 1, 0]),  # Test case 8: Perl

        ([
             ["C++", "Python"],
             ["Python", "Java"],
             ["C++", "JavaScript"],
             ["JavaScript", "Python"],
             ["C++", "Java"]
         ], [1, 1, 1, 0, 1]),  # Test case 9: C++

        ([
             ["Rust", "Go"],
             ["Go", "Swift"],
             ["Swift", "Kotlin"],
             ["Rust", "Kotlin"]
         ], [1, 0, 0, 1])  # Test case 10: Rust
    ]
    # Run test cases
    for i, (competitions, results) in enumerate(test_cases):
        result = tournamentWinner(competitions, results)
        print(f"Test case {i + 1}: Competitions = {competitions}, Results = {results} -> Winner: {result}")



# Execute the test cases if this script is run directly
if __name__ == "__main__":
    run_tests()