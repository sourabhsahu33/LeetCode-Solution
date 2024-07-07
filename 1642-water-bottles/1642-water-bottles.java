class Solution {
    public int numWaterBottles(int numBottles, int numExchange) {
        int ans = numBottles;
        while(numBottles >= numExchange){
            int val = numBottles / numExchange;
            int r = numBottles % numExchange;
            ans += val;

            numBottles = val + r;
        }
        return ans;
    }
}