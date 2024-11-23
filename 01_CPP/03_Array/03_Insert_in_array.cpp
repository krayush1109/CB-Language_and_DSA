#include<bits/stdc++.h>
using namespace std;

void display(int arr[], int n, string msg){
    cout << endl << msg << " : ";
    for(int i=0; i<n; i++){
        cout << arr[i] << " ";
    }
}

// TC = O(2n);      SC = O(n) 
void insert_in_array(int arr[], int n, int elem, int insert_idx){
    display(arr, n + 1, "Original Array");

    int new_arr[n+1];
    for(int i=0; i < insert_idx; i++ ){
        new_arr[i] = arr[i];
    }
    new_arr[insert_idx] = elem;

    for(int i= insert_idx+1; i < n+1; i++){
        new_arr[i] = arr[i-1];
    }

    display(new_arr, n + 1, "NEW ARRAY");
}

void insert_in_array_optimised(int arr[], int n, int elem, int insert_idx){
    int new_arr[n+1];

    int j =0;   // index for new array iteration
    for(int i=0; i<n; i++){
        if(i == insert_idx){
            new_arr[j] = elem;
            j++;
        }
        new_arr[j] = arr[i];
        j++;
    }

    display(new_arr, n+1, "New Optimised Soln");
}

int main(){

    int arr[] = {1, 5, 8 , 9, 12, 20};
    int n = sizeof(arr)/sizeof(arr[0]);

    // insert_in_array(arr, n, 7, 2);
    insert_in_array_optimised(arr, n, 89, 4);
    
    return 0;
}