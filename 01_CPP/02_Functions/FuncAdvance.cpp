#include<bits/stdc++.h>
using namespace std;

int sum(int a, int b){
    int sum = a+b;
    cout << sum;
    return sum;
}

float sum(float a, float b){
    float sum = a+b;
    cout << sum;
    return sum;
}

int main(){
    cout << "Hello World" << endl;
    int a, b;
    cin >> a >> b;
    sum(a, b);

    return 0;
}