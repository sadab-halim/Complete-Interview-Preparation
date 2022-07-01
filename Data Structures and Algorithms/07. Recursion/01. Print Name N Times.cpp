#include<bits/stdc++.h>
using namespace std;

void recFun(int n){
    if(n == 0)
        return;
    cout<<"Hey";
    recFun(n)
}

int main(){
    int n;
    cin>>n;
    recFun(n);
    return 0;
}