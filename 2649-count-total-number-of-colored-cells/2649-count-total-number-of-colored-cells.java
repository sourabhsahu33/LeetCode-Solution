class Solution {
    public long coloredCells(int n) {
        long ans = 1;
        long add_cell = 4;
        if(n==1){
            return 1;
        }
        for(int i=2; i<=n; i++){
            ans += add_cell;
            add_cell = 4*i;
        }
        return ans;
    }
}