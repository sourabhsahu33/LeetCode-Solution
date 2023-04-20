class Solution {
    public int climbStairs(int n) {
        int[] temp = new int[n + 1]; 
        return CountSteps(n, temp);
    }
    public int CountSteps(int n, int[] temp) {
        if (n <= 1) {
            return 1; 
        }
        
        if (temp[n] != 0) {
            return temp[n]; 
        }    
        int step1 = CountSteps(n - 1, temp); 
        int step2 = CountSteps(n - 2, temp); 
        temp[n] = step1 + step2;
        return temp[n];
    }
}
