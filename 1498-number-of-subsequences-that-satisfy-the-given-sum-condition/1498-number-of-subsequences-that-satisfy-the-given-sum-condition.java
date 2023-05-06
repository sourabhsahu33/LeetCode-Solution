class Solution {
    public int numSubseq(int[] nums, int target) {
        int n = nums.length;
        Arrays.sort(nums);
        int ans=0, left =0, right = n-1;
        int Mod = (int)1e9 + 7;
        int temp[] = new int [n];
        temp[0] = 1;
        for(int i=1; i<n; i++){
            temp[i] = temp[i-1] * 2%Mod; }
            while(left<= right){
                if(nums[left]+nums[right]>target)
                    right--;
                else
                    ans = (ans + temp[right-left++]) %Mod;
            }
        return ans;
    }
}