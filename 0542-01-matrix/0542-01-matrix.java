class Pair {
    int first, second, distance;
    
    Pair(int first, int second, int distance) {
        this.first = first;
        this.second = second;
        this.distance = distance;
    }
}

class Solution {
    public int[][] updateMatrix(int[][] mat) {
        int n = mat.length;
        int m = mat[0].length;
        int vis[][] = new int[n][m];
        int dist[][] = new int[n][m];
        Queue<Pair> q = new LinkedList<>();
       
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (mat[i][j] == 0) {
                    q.offer(new Pair(i, j, 0));
                    vis[i][j] = 1;
                } else {
                    vis[i][j] = 0;
                }
                dist[i][j] = Integer.MAX_VALUE; // Initialize dist with a large value.
            }
        }
       
        int drow[] = {-1, 0, 1, 0};
        int dcol[] = {0, 1, 0, -1};
       
        while (!q.isEmpty()) {
            int row = q.peek().first;
            int col = q.peek().second;
            int step = q.peek().distance;
            q.poll();
            dist[row][col] = step; // Update the distance in the dist array.
           
            for (int i = 0; i < 4; i++) {
                int nrow = row + drow[i];
                int ncol = col + dcol[i];
                if (nrow >= 0 && nrow < n && ncol >= 0 && ncol < m && vis[nrow][ncol] == 0) {
                    vis[nrow][ncol] = 1;
                    q.offer(new Pair(nrow, ncol, step + 1));
                }
            }
        }
        return dist;
    }
}
