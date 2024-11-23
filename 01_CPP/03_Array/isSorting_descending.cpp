#include<bits/stdc++.h>
using namespace std;

// Q. Check if it is sorted in descending order or not ?

void isSorted_descending(int arr[], int n){
    for(int i=0; i < n-1; i++){
        int current_elem = arr[i];

        for(int j = i+1; j < n; j++){
            int after_elem = arr[j];

            if(current_elem > after_elem){
                cout << endl << current_elem << " > " << after_elem;                
            }
            else {
                cout << "\nNOT SORTED in descending order"; 
                return;
            }                        
        }
        cout << "Hello" << endl;        
    }
        cout << "\nArray is SORTED - in descending order" << endl;
        return;
}

int main(){
    // int arr[] = {80, 65, 45, 33, 21, 11, 5};
    // int arr[] = {80, 65, 45, 33, 21, 11, 5, 6};
    int arr[] = {80, 65, 45, 12, 1};
    int n = sizeof(arr)/sizeof(arr[0]);
    isSorted_descending(arr, n);

    return 0;
}