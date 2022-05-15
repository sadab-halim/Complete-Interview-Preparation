/* ----------- DFS TRAVERSAL ----------- */
/*------- APPROACH ------- 
1. Start with a random node from graph
2. Make an array to keep track of visited nodes, once visited make that node as visited
3. Print this current node
4. Get neighbour nodes and perform above steps recursively for each node deeply/depthly if node is unvisited.
*/

import java.util.*;
class Main {
    public static void dfs(int node, boolean visited[], ArrayList<ArrayList<Integer>> adj, ArrayList<Integer> storeDfs) {
        storeDfs.add(node);
        // marking current node as visited
        visited[node] = true;

        // getting neighbour nodes
        for(Integer it: adj.get(node)) {
            if(visited[it] == false)
                dfs(it, visited, adj, storeDfs);)
        }
    }

    public static ArrayList<Integer> dfsOfGraph(int V, ArrayList<ArrayList<Integer>> adj) {
        ArrayList<Integer> storeDfs = new ArrayList<>();
        boolean visited[] = new boolean[V + 1];
        
    }
}