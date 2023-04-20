class Solution {
    public int climbStairs(int n) {
        int[] memo = new int[n + 1]; // memoization array to store previously calculated steps
        return climbStairsHelper(n, memo); // call the helper method with memoization
    }
    
    private int climbStairsHelper(int n, int[] memo) {
        if (n <= 1) {
            return 1; // base case: return 1 for n <= 1
        }
        
        if (memo[n] != 0) {
            return memo[n]; // return the memoized result if it exists
        }
        
        int step1 = climbStairsHelper(n - 1, memo); // calculate the number of ways for n-1
        int step2 = climbStairsHelper(n - 2, memo); // calculate the number of ways for n-2
        memo[n] = step1 + step2; // store the result in the memoization array
        return memo[n]; // return the result
    }
}
