class Solution {
    public boolean increasingTriplet(int[] nums) {
        int n = nums.length;
        int left = Integer.MAX_VALUE;
        int mid = Integer.MAX_VALUE;

// O(n) time complexity. 

        if(n < 3) return false;
        for(int i=0; i<n; i++){
            if(nums[i] > mid){
              return true;  
            }else if(nums[i] > left && nums[i] < mid){
                mid = nums[i];
            }else if(nums[i] < left){
                left = nums[i];
            }
        }
        return false;
    }
}
