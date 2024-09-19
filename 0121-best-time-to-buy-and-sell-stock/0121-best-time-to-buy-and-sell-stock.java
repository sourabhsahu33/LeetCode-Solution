class Solution {
    public int maxProfit(int[] prices) {
        int n = prices.length;
        int p = prices[0];
        int max = 0;
        for(int i = 1; i<n; i++){
            p = Math.min(p, prices[i]);
            max = Math.max(max, prices[i]- p);
        }
        return max;
    }
}