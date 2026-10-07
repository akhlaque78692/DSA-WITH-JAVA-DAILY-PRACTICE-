class Solution {
   
    public boolean canFinish(int V, int[][] edges) {

        int indegree[] = new int[V];

        // Create adjacency list
        List<List<Integer>> adj = new ArrayList<>();

        for(int i = 0; i < V; i++) {
            adj.add(new ArrayList<>());
        }

        // Build graph + calculate indegree
        for(int[] edge : edges) {

            int u = edge[0];
            int v = edge[1];

            adj.get(u).add(v);
            indegree[v]++;
        }

        // ArrayList<Integer> list = new ArrayList<>();
         int count = 0;
        Queue<Integer> q = new LinkedList<>();

        // Add nodes having indegree 0
        for(int i = 0; i < V; i++) {

            if(indegree[i] == 0) {
                q.add(i);
            }
        }

        // Kahn's Algorithm
        while(!q.isEmpty()) {

            int node = q.remove();

            count++;

            for(int n : adj.get(node)) {

                indegree[n]--;

                if(indegree[n] == 0) {
                    q.add(n);
                }
            }
        }

          if(count!=V){
               return false ;
        }
        return true;
    }

    
}