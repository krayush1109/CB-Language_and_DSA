#include<bits/stdc++.h>
using namespace std;

void min_value(int arr[], int size){
    // int min = 1000;
    int min = INT_MAX;
    // long long min = LLONG_MAX;

    for(int i=0; i<size; i++){
        if(min > arr[i]){
            min = arr[i];
        }
    }

    cout << "\nMinimum Value : " << min << endl;
}

void max_value(int arr[], int size){
    // int max = 0;
    int max = INT_MIN;
    // long long max = LLONG_MIN;

    for(int i=0; i<size; i++){
        if(max < arr[i]){
            max = arr[i];
        }
    }

    cout << "\nMaximum Value : " << max << endl;
}

void find_element(int arr[], int size, int find){
    for(int i=0; i< size; i++){
        if(find == arr[i]){
            cout << "Element " << find << " is found at index " << i << endl;
            return;
        }
    }
    cout << "Element " << find << " not found in the array."<< endl;
}

void find_element_using_flag(int arr[], int size, int find){
    bool isFound = false;

    for(int i=0; i< size; i++){
        if(find == arr[i]){
            isFound = true;
            break;
        }
    }

    (isFound) ? cout << "Founded" : cout << "NOT FOUND!";

    cout << ((isFound) ?  "Founded" :  "NOT FOUND!") << endl;
}

int main(){
    cout << "hello "<< endl;
    int arr[] = {12, 34, 564, 64, 2, 66, 9};
    int size = sizeof(arr)/sizeof(arr[0]);

    min_value(arr, size);
    max_value(arr, size);

    find_element(arr, size, 64);
    find_element(arr, size, 55);
    find_element_using_flag(arr, size, 64);
    find_element_using_flag(arr, size, 55);

    return 0;
}