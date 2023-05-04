class Solution {
    public int countElements(int[] nums) {
        int n = nums.length;
        int count =0;
        int a = nums[0], b = nums[0];
        for(int i=1; i<n; i++){
            if(nums[i]>a)
                a = nums[i];
            if(nums[i]<b)
                b = nums[i];
        }
        for(int i=0; i<n; i++){
            if(nums[i]<a && nums[i]>b)
                count++;
        }
        return count;
    }
}