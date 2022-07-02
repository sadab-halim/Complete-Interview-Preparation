#include<bits/stdc++.h>
using namespace std;

void reverse(int index, int arr[], int size){
    if(index >= size/2) return;
    swap(arr[index], arr[size - index -1]);
    reverse(index + 1, arr, size);
}

int main(){
    int size;
    cin>>size;

    int arr[size];
    for(int i = 0; i < size; i++)
        cin>>arr[i];
    reverse(0, arr, size);
    return 0;
}