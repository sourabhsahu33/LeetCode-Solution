class Pair{
    int distance , row, col;
    Pair(int distance, int row, int col){
        this.distance = distance;
        this.row = row;
        this.col = col;
    }
}
class Solution {
    public int minimumEffortPath(int[][] heights) {
        PriorityQueue<Pair> pq = new PriorityQueue<Pair>((x,y) -> x.distance-y.distance);
        int n = heights.length;
        int m = heights[0].length;
        int dist[][] = new int [n][m];
        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                dist[i][j] = (int)(1e9);
            }
        }
        dist[0][0] = 0;
        pq.offer(new Pair(0,0,0));
        int drow[] = {-1,0,1,0};
        int dcol[] = {0, 1, 0, -1};

        while(!pq.isEmpty()){
            Pair it = pq.peek();
            pq.poll();
            int diff = it.distance;
            int row = it.row;
            int col = it.col;

            if( row == n-1 && col == m-1) return diff;
            for(int i=0; i<4; i++){
                int n_row = row + drow[i];
                int n_col = col + dcol[i];

                if(n_row>=0 && n_row <n && n_col >=0 && n_col<m){
                    int nextMove = Math.max(Math.abs(heights[row][col] -  heights[n_row][n_col]), diff);
                    if(nextMove < dist[n_row][n_col]){
                        dist[n_row][n_col] = nextMove;
                        pq.offer(new Pair(nextMove, n_row, n_col));
                    }
                }
            }
        }
        return 0;
    }
}