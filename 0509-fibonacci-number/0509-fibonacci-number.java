class Solution {
    public int fib(int n) {
        if(n==0)return 0;
        // if(n==1)return 1;
        // // int f0 = fib(n-1);
        // // int f1 = fib(n-2);
        // return n-1;
        int prev1 = 1,prev2 =0;
        for(int i=1; i<n; i++){
            int current = prev1+prev2;
            prev2 = prev1;
            prev1 = current;
        }
        return prev1;
    }
}

