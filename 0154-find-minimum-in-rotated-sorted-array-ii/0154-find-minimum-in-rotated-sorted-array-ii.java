class Solution {
    public int findMin(int[] nums) {
        int n = nums.length;
        int left = 0;
        int right = n-1;
        int min = Integer.MAX_VALUE;
        while(left <= right){
            int mid = left + (right - left)/2;
            if(nums[left] == nums[mid] && nums[mid] == nums[right]){
                min = Math.min(min, nums[left]);
                left++;
                right--;
                continue;
            }
            if(nums[left] < nums[right]){
                min = Math.min(min, nums[left]);
                break;
            }
            else if(nums[left] <= nums[mid]){
                min = Math.min(min, nums[left]);
                left = mid+1;
            }
            else if(nums[mid] <= nums[right]){
                min = Math.min(min, nums[mid]);
                right = mid-1;
            }
        }
        return min;
    }
}