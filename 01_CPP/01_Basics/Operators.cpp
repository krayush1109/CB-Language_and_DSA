// #include<iostream>
#include<bits/stdc++.h>
using namespace std;

int main(){
    // Arithmetic Operators
    int a = 7;
    int b = 2;

    cout << a/b << endl;
    cout << (a/b) * 1.5  << endl;
    cout << a/ (b * 1.5)  << endl;
    cout << b % a << endl;

    // Logical Operator
    cout << "LOGICAL OPERATOR --- \n";
    cout<< (1 && 1) << endl;
    cout<< (1 && 5) << endl;
    cout<< (0 || 0) << endl;
    cout<< (0 || 1) << endl;
    cout<< (0 || 4) << endl;
    cout<< !(1) << endl;

    // Unary Operator
    cout<< "UNARY Operator \n";
    cout<< ++b << endl;
    cout<< a++ << endl;

}