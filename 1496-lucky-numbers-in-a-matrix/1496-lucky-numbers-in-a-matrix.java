class Solution {
    public List<Integer> luckyNumbers (int[][] matrix) {
        List<Integer> list = new ArrayList<>();
        int n = matrix.length;
        int m = matrix[0].length;
        int rowMin[] = new int[n];
        int colMax[] = new int[m];
        
        // Find the minimum element in each row
        for (int i = 0; i < n; i++) {
            int min = Integer.MAX_VALUE;
            for (int j = 0; j < m; j++) {
                if (matrix[i][j] < min) {
                    min = matrix[i][j];
                }
            }
            rowMin[i] = min;
        }

        // Find the maximum element in each column
        for (int j = 0; j < m; j++) {
            int max = Integer.MIN_VALUE;
            for (int i = 0; i < n; i++) {
                if (matrix[i][j] > max) {
                    max = matrix[i][j];
                }
            }
            colMax[j] = max;
        }

        // Check for lucky numbers
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (matrix[i][j] == rowMin[i] && matrix[i][j] == colMax[j]) {
                    list.add(matrix[i][j]);
                }
            }
        }

        return list;
    }
}
