class Solution {
    public int[] findArray(int[] pref) {
        int n = pref.length;
        int ans[] = new int[n];
        ans[0] = pref[0];
        int res = ans[0];

        for(int i=1; i<n; i++){
            ans[i] = res^pref[i];
            res ^= ans[i];
        }
        return ans;
    }
}