#include<bits/stdc++.h>
using namespace std;
void display_array(int arr[], int size, string msg){
    cout << endl << msg << " : ";
    for(int i=0; i < size; i++){
        cout << arr[i] << " ";
    }
}

// Time Complexity : 0(n^2)
void isSorted_brute_force(int arr[], int n){
    for(int i=0; i<n; i++){
        int elem_current = arr[i];
        for(int j=i+1; j<n; j++){
            int elem_after = arr[j];
            if(elem_current < elem_after){
                cout << endl << elem_current << " > " << elem_after;                
                continue;
            }else{
                cout << "Array is not sorted !" << endl;
                return;
            }
        }
    }

    display_array(arr, n, "Array is Sorted :");
}

void isSorted_optimized(int arr[], int n){
    for(int i =1; i < n; i++){
        int curr = arr[i-1];
        int next = arr[i];
        if(curr <= next){
            continue;
        }else{
            cout << "Not Sorted!" << endl;
            return;
        }
    }

    cout << endl << "Array is Sorted" << endl;
}

void rev_arr(int arr[], int n){

    for(int i=0; i<n/2; i++){
        int rev_idx = n - 1 - i;
        swap(arr[i], arr[rev_idx]);
    }
}

void isPalindrome_arr(int arr[], int n){
    for(int i=0; i< n/2; i++){
        int l_idx = n - 1 -i;
        if(arr[i] == arr[l_idx]){
            continue;
        }else{
            cout << "\nNOT Palindrome !";
            return;
        }
    }
    cout << "\nYes Palindrome" <<endl;    
}

int main(){
    cout << "Hello" << endl;

    // int arr[] = {2, 45, 12, 19, 9, 44, 27, 72};
    // int arr[] = {2, 12, 19, 39, 44, 71, 72, 75};
    int arr[] = {2, 3, 5 , 13, 77, 77, 13, 5, 3, 12};
    int size  = sizeof(arr)/sizeof(arr[0]);

    isSorted_brute_force(arr, size);
    isSorted_optimized(arr, size);
    isPalindrome_arr(arr, size);

    return 0;
}