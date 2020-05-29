class Solution {
    int[] visited;
    List<Integer>[] g;
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        visited = new int[numCourses];
        g = new ArrayList[numCourses];
        for (int i = 0; i < numCourses; i++) g[i] = new ArrayList<>();
        for (int[] p : prerequisites) g[p[1]].add(p[0]);
        for (int i = 0; i < numCourses; i++) if (hasCycle(i)) return false; 
        return true;
    }
    
    private boolean hasCycle(int u) {
        if (visited[u] == 2) return false;
        if (visited[u] == 1) return true;        
        visited[u] = 1;  //mark traversal beginning  
        for (int v : g[u]) if (hasCycle(v)) return true;        
        visited[u] = 2; //mark traversal end
        return false;
    }   
}
