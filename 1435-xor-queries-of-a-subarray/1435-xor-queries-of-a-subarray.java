class Solution {
    public int[] xorQueries(int[] arr, int[][] queries) {
        int n = queries.length; 
        int ans[] = new int[n];
        int idx = 0;
        
        for (int i = 0; i < queries.length; i++) {
            int val = 0;

            for (int j = queries[i][0]; j <= queries[i][1]; j++) {
                val ^= arr[j];
            }
            ans[idx++] = val; // Store the result in the answer array
        }
        return ans;
    }
}