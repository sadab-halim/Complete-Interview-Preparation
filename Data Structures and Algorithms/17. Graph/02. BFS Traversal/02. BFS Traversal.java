/* ------------- BREADTH FIRST TRAVERSAL ------------- */

/*
An Undirected Graph will be given. Return a vector of all the nodes of the Graph by Breadth-First Search ( BFS ) Technique.
*/

/* ------ Intuition: ------
-> We will capture a node. After capturing this node, we will put this node's value into our answer vector
and mark its visited value as true. Now, this node will be having some adjacent nodes connected to it.
-> We will push all the adjacent nodes which are NOT VISITED into the queue data structure.
If we encounter any VISITED adjacent nodes will not be considering them because we don't want to
consider them twice.
-> By this way, we are covering all the nodes of the component breadth-wise.
*/

/* ------ APPROACH ------
-> We will push the 1st node into the queue data structure and mark it as visited. After this, we will find its
adjacent nodes. If we get some unvisited node, we will simply push this adjacent node into the queue data
structure
-> Now since the work of the 1st node is done, we will pop out this node from the queue. Now, this
process goes on until the queue is not empty.
*/

/* ------ T.C: O(N+E), A.S: O(N+E) + O(N) + O(N) ------*/
import java.util.*;
class Main {
    public static ArrayList<Integer> bfsOfGraph(int V, ArrayList<ArrayList<Integer>> adj) {
        ArrayList<Integer> bfs = new ArrayList<>();
        boolean visited[] = new boolean[V];
        Queue <Integer> q = new LinkedList<>();

        q.add(0);
        visited[0] = true;

        while(!q.isEmpty()) {
            Integer node = q.poll();
            bfs.add(node);

            for(Integer it: adj.get(node)) {
                if(visited[it] == false) {
                    visited[it] = true;
                    q.add(it);
                }
            }
        }
        return bfs;
    }

    public static void printAns(ArrayList<Integer> ans) {
        for(int i = 0; i < ans.size(); i++)
            System.out.print(ans.get(i) + " ");
    }
    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> adj = new Arraylist<>();
        for(int i = 0; i < 5; i++) {
            adj.add(new ArrayList<>());
        }
        adj.get(0).add(1);
        adj.get(1).add(0);
        adj.get(0).add(2);
        adj.get(2).add(0);
        adj.get(0).add(3);
        adj.get(3).add(0);
        adj.get(2).add(4);
        adj.get(4).add(2);

        ArrayList<Integer> ans = bfsOfGraph(5, adj);
        printAns(ans);
    }
}