class Solution {
    public int[][] buildMatrix(int k, int[][] rowConditions, int[][] colConditions) {
        // Get topological order for rows and columns
        int[] rowOrder = topologicalSort(rowConditions, k);
        int[] colOrder = topologicalSort(colConditions, k);
        
        // Check for invalid scenarios
        if (rowOrder.length == 0 || colOrder.length == 0) {
            return new int[0][0];
        }
        
        // Create matrix and fill it based on topological orders
        int[][] matrix = new int[k][k];
        for (int i = 1; i <= k; i++) {
            int rowPos = rowOrder[i];
            int colPos = colOrder[i];
            matrix[rowPos][colPos] = i;
        }
        
        return matrix;
    }
    // Helper function to perform topological sorting
    private int[] topologicalSort(int[][] conditions, int n) {
        // Build graph
        List<Integer>[] graph = new ArrayList[n + 1];
        int[] inDegree = new int[n + 1];
        for (int i = 1; i <= n; i++) {
            graph[i] = new ArrayList<>();
        }
        
        for (int[] condition : conditions) {
            int u = condition[0], v = condition[1];
            graph[u].add(v);
            inDegree[v]++;
        }
        
        // Perform Kahn's algorithm for topological sort
        Queue<Integer> queue = new LinkedList<>();
        for (int i = 1; i <= n; i++) {
            if (inDegree[i] == 0) {
                queue.offer(i);
            }
        }
        
        List<Integer> sortedList = new ArrayList<>();
        while (!queue.isEmpty()) {
            int node = queue.poll();
            sortedList.add(node);
            for (int neighbor : graph[node]) {
                if (--inDegree[neighbor] == 0) {
                    queue.offer(neighbor);
                }
            }
        }
        
        if (sortedList.size() != n) return new int[0]; // Cycle detected
        
        // Convert list to array
        int[] result = new int[n + 1];
        for (int i = 0; i < sortedList.size(); i++) {
            result[sortedList.get(i)] = i;
        }
        return result;
    }
}