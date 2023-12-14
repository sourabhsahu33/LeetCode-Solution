class Solution {
    public int[][] onesMinusZeros(int[][] grid) {
        int n = grid.length;
        int m = grid[0].length;
        int diff[][] = new int[n][m];
        int one_row[] = new int[n];
        int one_col[] = new int[m];
        int zero_row[] = new int[n];
        int zero_col[] = new int[m];

        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                if(grid[i][j] == 1){
                    one_row[i]++;
                    one_col[j]++;
                }else{
                    zero_row[i]++;
                    zero_col[j]++;
                }
            }
        }
        
        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                diff[i][j] = one_row[i] + one_col[j] - zero_row[i] - zero_col[j]; 
            }
        }
        return diff;
    }
}
