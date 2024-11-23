#include<bits/stdc++.h>
using namespace std;

void display(int a, int b, string msg);

void Basics(){
    int x = 10, y= 20;
    cout << x << endl;
    cout << &x << endl;

    int *ptr;
    ptr = &x;

    cout << "ptr : " <<  ptr << endl;
    cout << "&ptr (pointer ka address store karega) : " <<  &ptr << endl;
    cout << "*ptr (Value of Pointer) : " <<  *ptr << endl;

    cout << "*(&x) : " << *(&x) << endl;
    
    x++;
    (*ptr)++;    
    cout << "After Increment : " << *ptr << endl;
}

void increment(int *x_ptr, int *y_ptr){
    *x_ptr = *x_ptr + 1;
    *y_ptr = *y_ptr + 1;
}

void increment2(int &x_ptr, int &y_ptr){
    x_ptr = x_ptr + 1;
    y_ptr = y_ptr + 1;
}

int main(){
    cout << "Hello" << endl;
    int x = 5, y=15;

    // Basics();


    display(x, y, "Original Value");
    increment(&x, &y);
    display(x, y, "After Increment");

    display(x, y, "Original Value");
    increment(&x, &y);
    display(x, y, "After Increment");

    return 0;
}

void display(int a, int b, string msg){
    cout << msg << " - " << endl;
    cout << "a : " << a << endl;
    cout << "b : " << b << endl;
}