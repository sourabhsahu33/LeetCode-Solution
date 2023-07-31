class Solution {
    public int maxSubArray(int[] nums) {
        // int largeSum = nums[0];
        // int curr_sum = nums[0];
        // for(int i=1; i<nums.length; i++){
        //     curr_sum = Math.max(curr_sum + nums[i], nums[i]);
        //     largeSum = Math.max(curr_sum, largeSum);
        // }
        // return largeSum;


        int n = nums.length;
        int max_so_far = Integer.MIN_VALUE; 
        int max_ending_here = 0;
        for(int i=0; i<n; i++){
            max_ending_here += nums[i];
            if(max_so_far < max_ending_here){
                max_so_far = max_ending_here;
            }
            if(max_ending_here < 0){
                max_ending_here = 0;
            }
        }
        return max_so_far;
    }
}