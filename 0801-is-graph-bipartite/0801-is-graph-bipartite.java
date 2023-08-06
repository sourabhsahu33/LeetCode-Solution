
class Solution {
    private boolean Check(int startNode, int n, int color[], ArrayList<ArrayList<Integer>> adj){
        Queue<Integer> q = new LinkedList<>();
        q.offer(startNode);
        color[startNode] = 0;

        while(!q.isEmpty()){
            int node = q.poll();
            for(int it : adj.get(node)){
                if(color[it] == -1 ){
                    color[it] = 1 - color[node];
                    q.offer(it);
                }
                else if( color[it] == color[node]){
                    return false;
                }
            }
        }
        return true;
    }
    
    public boolean isBipartite(int[][] graph) {
        int n = graph.length;
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
        for(int i = 0; i < n; i++) {
            adj.add(new ArrayList<Integer>());
        }
        
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < graph[i].length; j++) {
                adj.get(i).add(graph[i][j]);
                adj.get(graph[i][j]).add(i);
            }
        }
        
        int color[] = new int[n];
        Arrays.fill(color, -1);
        
        for(int i = 0; i < n; i++) {
            if(color[i] == -1 && !Check(i, n, color, adj)) {
                return false;
            }
        }
        return true;
    }
}
