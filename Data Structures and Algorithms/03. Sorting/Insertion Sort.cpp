#include<iostream>
using namespace std;

void insertionsort(int arr[], int size){
    for(int step = 1; step < size; step++){
        int key = arr[step];
        int i = step - 1;

        while(arr[i] > key && i >= 0){
            arr[i+1] = arr[i];
            i--;
        }
        arr[i+1] = key;
    }
}

void printArray(int arr[], int n){
    for(int i = 0; i < n; i++){
        cout<<arr[i]<<" ";
    }
}
int main(){
    int arr[] = {50, 5, 10, 2, 40, 20};
    int size = sizeof(arr)/sizeof(arr[0]);
    insertionsort(arr, size);
    cout<<"Sorted Array: ";
    printArray(arr, size);
    return 0;
}