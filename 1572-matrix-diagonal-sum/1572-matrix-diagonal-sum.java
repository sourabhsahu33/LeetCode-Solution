class Solution {
    public int diagonalSum(int[][] mat) {
        int n = mat.length;
        int add = 0;
        for(int i=0; i<n; i++){
            add +=mat[i][i] + mat[n-i-1][i];
        }
        if(n%2 !=0){
            add -= mat[n/2][n/2];
        }
        return add;
    }
}