class Solution {
    public int findKthNumber(int n, int k) {
        int curr = 1; // Start with the smallest lexicographical number (1)
        k--; // We start from 1, so decrement k
        
        while (k > 0) {
             long count = countSteps(n, curr, curr + 1);
            
            if (count <= k) {
                // If the count of numbers in this range is less than or equal to `k`,
                // move to the next prefix
                curr++;
                k -= count; // Subtract the number of elements in this prefix from `k`
            } else {
                // If the count is greater than `k`, move to the next level (children)
                curr *= 10; // Move to the next lexicographical level (children of curr)
                k--; // Decrement k as we are "consuming" this prefix
            }
        }
        return curr;
    }
 
    private long countSteps(int n, long curr, long next) {
        long count = 0;
        while (curr <= n) {
            count += Math.min(n + 1, next) - curr; // Add numbers between curr and next
            curr *= 10; // Move to the next level
            next *= 10;
        }
        return count;
    }
}
