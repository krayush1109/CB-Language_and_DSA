#include <bits/stdc++.h>
using namespace std;

void display(int arr[], int n){
    for (int i = 0; i < n; i++)
    {
        cout << arr[i] << " ";
    }
}

void array_initialize_1()
{
    // int arr[5] = {1, 2};
    int arr[5] = {};    // all elements initialized with zero
    display(arr, 5);
}

void array_initialize_2()
{
    int arr[5];
    fill(begin(arr), end(arr), -1); // Initialize all elements to 10    
    display(arr, 5);
}

int main()
{
    array_initialize_1();
    array_initialize_2();
    return 0;
}