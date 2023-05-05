class Solution {
    public int subsetXORSum(int[] nums) {
      int bits=0;
        int ans = 0;
        int n = nums.length;
        for(int i=0; i<n; i++){
            bits |= nums[i];
            ans = bits*(int)Math.pow(2, n-1);
        }
        return ans;
    }
}