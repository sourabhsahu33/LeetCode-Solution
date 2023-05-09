class Solution {
    public int maxSubArray(int[] nums) {
        int largeSum = nums[0];
        int curr_sum = nums[0];
        for(int i=1; i<nums.length; i++){
            curr_sum = Math.max(curr_sum + nums[i], nums[i]);
            largeSum = Math.max(curr_sum, largeSum);
        }
        return largeSum;
    }
}