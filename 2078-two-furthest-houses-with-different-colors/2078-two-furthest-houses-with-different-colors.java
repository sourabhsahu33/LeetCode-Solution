class Solution {
    public int maxDistance(int[] colors) {
        int n = colors.length;
        int maxDiff = 0;
        for(int i=1; i<n; i++){
            if(colors[0]!=colors[i])
                maxDiff = Math.max(maxDiff,i);
        }
        for(int i=n-2; i>=0; i--){
            if(colors[i] != colors[n-1])
                maxDiff = Math.max(maxDiff, n-1-i);
        }
        return maxDiff;
    }
}