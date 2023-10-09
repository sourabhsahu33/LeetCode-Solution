

class Solution {
    public boolean winnerOfGame(String colors) {
        int n = colors.length();
        if (n < 3) {
            // If the length is less than 3, no one can win.
            return false;
        }

        // Create a HashMap to store the counts of consecutive sequences (runs) of 'A' and 'B'.
        HashMap<Character, Integer> runCounts = new HashMap<>();
        
        // Initialize counts for both 'A' and 'B' runs to 0.
        runCounts.put('A', 0);
        runCounts.put('B', 0);

        // Iterate through the string and count consecutive sequences.
        for (int i = 0; i < n - 2; i++) {
            char current = colors.charAt(i);
            char next1 = colors.charAt(i + 1);
            char next2 = colors.charAt(i + 2);

            // Check for consecutive sequences of 'A'.
            if (current == 'A' && next1 == 'A' && next2 == 'A') {
                runCounts.put('A', runCounts.get('A') + 1);
            }

            // Check for consecutive sequences of 'B'.
            if (current == 'B' && next1 == 'B' && next2 == 'B') {
                runCounts.put('B', runCounts.get('B') + 1);
            }
        }

        // Check if there is any run of 'A' or 'B' with a length greater than or equal to 2.
        if( runCounts.get('A')  - runCounts.get('B') >0){
            return true;
        }
        return false;
    }
}
