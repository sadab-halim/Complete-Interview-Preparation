#include<bits/stdc++.h>
using namespace std;

void revString(string &str, int low, int high){
    if(low > high)
        return;
    
    int temp = str[low];
    str[low] = str[high];
    str[high] = temp;
    low++;
    high--;
        
    revString(str, low, high);

}

int main(){
    string name = "code";
    revString(name, 0, name.size() - 1);
    cout<<name<<endl;
    return 0;
}