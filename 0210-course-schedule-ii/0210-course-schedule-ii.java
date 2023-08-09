class Solution {
    public int[] findOrder(int numCourses, int[][] prerequisites) {
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
        for (int i = 0; i < numCourses; i++) {
            adj.add(new ArrayList<Integer>());
        }
        int n = prerequisites.length;
        for (int i = 0; i < n; i++) {
            adj.get(prerequisites[i][1]).add(prerequisites[i][0]); 
        }
        int indegree[] = new int[numCourses];
        for (int i = 0; i < n; i++) { // Fix: Loop through prerequisites array
            indegree[prerequisites[i][0]]++; // Fix: Increment indegree for the course (not the prerequisite)
        }
        Queue<Integer> q = new LinkedList<>();
        for (int i = 0; i < numCourses; i++) {
            if (indegree[i] == 0) {
                q.offer(i);
            }
        }
        int topo[] = new int[numCourses];
        int cnt = 0;
        while (!q.isEmpty()) {
            int node = q.poll(); 
            topo[cnt++] = node;

            for (int it : adj.get(node)) {
                indegree[it]--;
                if (indegree[it] == 0) {
                    q.offer(it);
                }
            }
        }
        
        if (cnt == numCourses) {
            return topo; 
        } else {
            return new int[0];
        }
    }
}
