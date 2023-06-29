class Solution {
    public int captureForts(int[] forts) {
        int n = forts.length;
        int res = 0;
        for(int i=0, j=0; i<n; i++)
            if(forts[i] != 0){
                if(forts[i] == -forts[j])
                    res = Math.max(res, i-j-1);
                j= i;
            }
        return res;
    }
}
