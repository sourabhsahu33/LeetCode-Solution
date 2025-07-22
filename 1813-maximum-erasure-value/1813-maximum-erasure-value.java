class Solution {
    public int maximumUniqueSubarray(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        int left = 0, right = 0, sum = 0, max = 0;
        while(right < nums.length){
            while(set.contains(nums[right])){
                set.remove(nums[left]);
                sum -= nums[left];
                left++;
            }
            set.add(nums[right]);
            sum += nums[right];
            max = Math.max(sum, max);
            right++;
        }
        return max;
    }
}