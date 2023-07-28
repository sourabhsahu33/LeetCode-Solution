class Solution {
    public boolean PredictTheWinner(int[] nums) {
        int start = 0;
        int end = nums.length-1;
        return Recursion(nums, start, end) >=0;
    }
    public int Recursion(int nums[], int start, int end){
        if(start == end){
            return nums[start];
        }
        int left = nums[start] - Recursion(nums, start+1, end);
        int right = nums[end] - Recursion(nums, start, end-1);

        return Math.max(left, right);
    }
}