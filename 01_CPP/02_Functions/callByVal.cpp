#include<bits/stdc++.h>
using namespace std;

void myFun(int x){
    x = 20;
    cout << "INSIDE FUNCTION, x: " << x << endl;
}

void callByRef(int &y){
    y = 25;
    cout << "INSIDE FUNCTION (call by refernce), y: " << y << endl;
}

int main(){
    int a = 5;
    cout << "MAIN (initial), a: " << a << endl;

    cout << "------- Call by Value ------------" << endl;
    myFun(a);
    cout << "MAIN (final) , a: " << a << endl;


    cout << "------- Call by Reference ------------" << endl;    
    callByRef(a);
    cout << "MAIN (final) , a: " << a << endl;
}