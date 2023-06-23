class Solution {
    public int longestOnes(int[] nums, int k) {
        int n= nums.length;
        int i=0,j=0;
        while(j<n){
           if(nums[j]==0) k--;
            if(k<0 && nums[i++]==0){
                k++;}
            j++;
        }
        return j-i;
    }
}
