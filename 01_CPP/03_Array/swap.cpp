#include<bits/stdc++.h>
using namespace std;

void display(int a, int b){
    cout << "a : " << a << endl;
    cout << "b : " << b << endl;    
}

void swap(int *a_ptr, int *b_ptr){
    int temp = *a_ptr;
    *a_ptr = *b_ptr;
    *b_ptr = temp;    
}

void swap_using_xor(int *a, int *b){
    *a = *a ^ *b;
    *b = *a ^ *b;
    *a = *a ^ *b;

    cout << "swap usin xor : " << *a << " " << *b << endl;
}

int main(){
    int a = 19, b = 38;

    display(a, b);

    // swap(&a, &b);
    swap_using_xor(&a, &b);

    display(a, b);

    return 0;
}