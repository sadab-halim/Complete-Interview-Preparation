#include<bits/stdc++.h>
using namespace std;

int main(){
    int n, m;
    cin>>n>>m;
    //declaring the adjacent matrix
    int adj[n + 1][n + 1];
    //taking edges as input
    for(int i = 0; i < m; i++){
        int u, v;
        cin>>u>>v;
        adj[u].push_back(v);
        adj[v].push_back(v);
    }
    return 0;
}