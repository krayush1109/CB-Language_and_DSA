#include<bits/stdc++.h>
using namespace std;

void fibIterative(int n){    
    int a = 0;
    int b = 1;

    for(int i = 1; i <=n; i++){
        int c = a+b;
        cout << c << "\n";
        a = b;
        b = c;
    }
}

int fibRecursive(int n){
    if(n == 0 || n == 1)
        return n;

    return fibRecursive(n-1) + fibRecursive(n-2);
}

int main(){
    int n;
    cin >> n;

    // fibIterative(n);

    for(int i=0; i<=n; i++)
        cout << fibRecursive(i) << "\n";
}