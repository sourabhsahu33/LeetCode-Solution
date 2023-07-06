class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int ans = Integer.MAX_VALUE;
        int sum = 0;
        int n = nums.length;
        int left = 0;
        for(int i=0; i<n; i++){
            sum += nums[i];
            while(sum >= target){
             ans = Math.min(ans, i+1-left);
             sum -= nums[left];
             left++;
            }
        }
        return (ans != Integer.MAX_VALUE)? ans : 0;
    }
}