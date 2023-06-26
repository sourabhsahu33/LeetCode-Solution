class Solution {
    public void rotate(int[][] matrix) {
        int n = matrix.length;
        for(int i=0, j = n-1; i<j; ++i, --j){
            int[] temp = matrix[i];
            matrix[i] = matrix[j];
            matrix[j] = temp;
        }
        for(int i=0; i<n; ++i)
        for(int j=i+1; j<n; ++j){
            final int temp = matrix[i][j];
            matrix[i][j] = matrix[j][i];
            matrix[j][i] = temp;
        }
    }
}
 
