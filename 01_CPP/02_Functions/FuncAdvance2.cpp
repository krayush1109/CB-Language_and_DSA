#include<bits/stdc++.h>
using namespace std;

int sum(int a, int b){
    int sum = a+b;
    cout << sum << endl;
    return sum;
}

int sum(int a, int b, int c){
    int sum = a+b+c;
    cout << sum << endl;
    return sum;
}
float sum(float a, float b, float c){
    float sum = a+b+c;
    cout << sum << endl;
    return sum;
}

int main(){
    cout << "Hello World" << endl;
    // int a, b;
    // cin >> a >> b;

    int a=10, b=15, c =17;
    
    sum(a, b);
    sum(a, b, c);

    return 0;
}