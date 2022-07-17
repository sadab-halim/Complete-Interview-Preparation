#include<bits/stdc++.h>
using namespace std;

class Solution{
    public:
    void dfs(int node, vector<int> &visited, vector<int> adj[], vector<int> &storeDfs){
        storeDfs.push_back(node);
        visited[node] = 1;

        for(auto it: adj[node]){
            if(!visited([it]))
                dfs(it, visited, adj, storeDfs);
        }
    }

    vector<int>dfsOfGraph(int V, vector<int> adj[]){
        vector<int> storeDfs;
        vector<int> visited(V+1, 0);
        
        for(auto it: adj[node]){
            if(!visited[it])
                dfs(it, visited, adj, storeDfs);
        }
    }
};

void addEdge(vector<int> adj[], int u, int v){
    adj[u].push_back(v);
    adj[v].push_back(u);
}

int main(){
    vector<int> adj[6];
    
    addEdge(adj,1,2);
    addEdge(adj,1,3);
    addEdge(adj,1,4);
    addEdge(adj,1,5);
    addEdge(adj,2,4);
    addEdge(adj,2,1);
    addEdge(adj,3,1);
    addEdge(adj,4,1);
    addEdge(adj,4,2);
    addEdge(adj,5,1);
    Solution obj;
    vector<int> df;
    df= obj.dfsOfGraph(5, adj);
    for(auto it: df)
    cout<<it<<" ";
 
    return 0;
}