#include<bits/stdc++.h>
using namespace std;

void display(int arr[], int n, string msg){
    cout << endl << msg << " : ";
    for(int i=0; i<n; i++){
        cout << arr[i] << " ";
    }
}

void delete_in_array(int arr[], int n, int idx){
    int new_arr[n-1];

    int j = 0;
    for(int i=0; i<n; i++){
        if(i == idx)
            continue;

        new_arr[j] = arr[i];
        j++;
    }

    display(new_arr, n-1, "After deleting one element");
}

int main(){
    int arr[] = {12, 24, 36, 48, 60, 72};
    int n = sizeof(arr)/sizeof(arr[0]);

    delete_in_array(arr, n, 1);

    return 0;
}