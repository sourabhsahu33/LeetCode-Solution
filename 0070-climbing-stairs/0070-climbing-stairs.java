class Solution {
    // using recursion techniques
//     public int climbStairs(int n) {
//         int[] temp = new int[n + 1]; 
//         return CountSteps(n, temp);
//     }
//     public int CountSteps(int n, int[] temp) {
//         if (n <= 1) {
//             return 1; 
//         }
        
//         if (temp[n] != 0) {
//             return temp[n]; 
//         }    
//         int step1 = CountSteps(n - 1, temp); 
//         int step2 = CountSteps(n - 2, temp); 
//         temp[n] = step1 + step2;
//         return temp[n];
//     }
    
    // using another approach 
    
    public int climbStairs(int n) {
      int pre=1, post=0;
        for(int i=0; i<n; i++){
            int temp = pre+post;
           post = pre;
            pre = temp;
        }
        return pre;
    }   
}
