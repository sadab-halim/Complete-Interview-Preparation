#include<bits/stdc++.h>
using namespace std;

void print_subsequences(int index, vector<int> &ds, int arr[], int n){
    if(index == n){
        for(auto it: ds){
            cout<<it<<" ";
        if(ds.size() == 0)
            cout<<"{}"
        }
        cout<<endl;
        return;
    }
    // take or pick the particular index into the subsequence
    ds.push_back(arr[ind]);
    print_subsequences(index + 1, ds, arr, n);

    // not pick, this element is not added to the subsequence
    ds.pop_back();
    print_subsequences(index + 1, ds, arr, n);
}

int main(){
    int arr[] = {3, 1, 2};
    int n = 3;
    vector<int> ds;
    print_subsequences(0, ds, arr, n);
    return 0;
}