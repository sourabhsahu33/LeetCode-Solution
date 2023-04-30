class Solution {
    public int minOperations(int[] nums) {
        int count =0;
        for(int i=1; i<nums.length; i++){
           if(nums[i]<=nums[i-1]){
               int change = nums[i-1]-nums[i]+1;
               count += change;
               nums[i] += change;
           }}
        return count;
    }
}