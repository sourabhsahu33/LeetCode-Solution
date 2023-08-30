class Solution {
    public int minIncrementForUnique(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length;
        int operation = 0;
        for(int i=1; i<n; i++){
            if( nums[i] <= nums[i-1]){
                operation += nums[i-1] - nums[i] + 1;
                nums[i] = nums[i-1] + 1;
             }
        }
        return operation;
    }
}