#include<bits/stdc++.h>
using namespace std;

void display(int arr[], int n, string msg){
    cout << endl << msg << " : ";
    for(int i=0; i<n; i++){
        cout << arr[i] << " ";
    }
}

// CASE I : All distinct element
void second_largest_num(int arr[], int n){
    int max = INT_MIN, max_2 = INT_MIN;

    for(int i=0; i< n; i++){
        if(max < arr[i]){
            max = arr[i];
        }
    }

    cout << "MAX : " << max << endl;

    for(int i =0; i < n; i++){
        if(max_2 < arr[i] && arr[i] != max )
            max_2 = arr[i];
    }

    cout << "2nd MAX : " << max_2 << endl;
}

// CASE I : All distinct element
void second_largest_num_optimised(int arr[], int n){
    int max = INT_MIN, max_2 = INT_MIN;

    for(int i=0; i < n; i++){
        if(max < arr[i]){
            max_2 = max;
            max = arr[i];
        }        
    }

    cout << "MAX element : " << max << endl;
    cout << "2nd MAX element : " << max_2 << endl;
}

// 🎯 CASE II : Two same max element
void second_largest_from_repeated_element(int arr[], int n){
    int max = INT_MIN, max_2 = INT_MIN;

    for(int i=0; i < n; i++){
        if(max < arr[i] || max == arr[i] ){
            max_2 = max;
            max = arr[i];
        } 
        // else if( max == arr[i]){
        //     max_2 = max;
        // }
    }

    cout << "Max from repeated elements array " << max;
    cout << "\n2nd Max from repeated elements array " << max_2;
}

int main(){
    cout << "Hello" << endl;
    // int arr[] = {8, 16, 24, 100, 32, 40, 150};
    int arr[] = {8, 200, 16, 24, 100, 32, 40, 150, 200, 150};
    int n = sizeof(arr)/sizeof(arr[0]);
    second_largest_num(arr, n);

    second_largest_from_repeated_element(arr, n);

    return 0;
}