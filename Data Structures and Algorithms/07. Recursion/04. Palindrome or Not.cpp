#include<bits/stdc++.h>
using namespace std;

bool check_palindrome(int index, string &word){
    if(index >= s.size()/2) return true;
    if(word[index] != word[word.size() - index - 1]) return false;
    return check_palindrome(index + 1, word);
}

int main(){
    string word = "MADAM";
    cout<<check_palindrome(0, word);
    return 0;
}