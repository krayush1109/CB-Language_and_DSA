// #include<iostream>
#include<bits/stdc++.h>
using namespace std;

int main(){

    // CHARACTER DATA TYPE
    // char ch = "a"; ⚠️ERROR
    char ch = 'a';
    // char ch2 = 'ab'; ⚠️ ERROR
    cout<< ch << endl;

    int i =10;
    float f = 3.147;
    double d = 9.545415175;
    for(int i=0; i< 5; i++){
        cout<< i << endl;
    }

    // BOOLEAN DATA TYPE
    bool b1 = true;
    bool b2 = false;

    cout<< b1 << endl;
    cout<< b2 << endl;

    // SIZE OF DATA TYPES
    cout << sizeof(i) << endl;
    cout << sizeof(f) << endl;
    cout << d << endl;
    cout << sizeof(d) << endl;

    cout << sizeof(ch) << endl;
    cout << sizeof(b1) << endl;

    float f1 = 3.141592653589793;
    double d1 = 3.141592653589793;
    cout<< f1 << endl;
    cout<< d1 << endl;
    cout << setprecision(15);
    cout<< f1 << endl;
    cout<< d1 << endl;

    bool b3 = true;
    char ch3 = 3.875;
    short s3 = 3.875;
    int n3 = 3.875;
    float f3 = 3.875;
    double d3 = 3.875;
    long l3 = 3.875;
    long long ll3 = 3.875;
    cout << typeid(b3).name() << endl;
    cout << (typeid(ch3)).name() << endl;
    cout << (typeid(s3)).name() << endl;
    cout << (typeid(n3)).name() << endl;
    cout << (typeid(f3)).name() << endl;
    cout << (typeid(d3)).name() << endl;
    cout << (typeid(l3)).name() << endl;
    cout << (typeid(ll3)).name() << endl;
}