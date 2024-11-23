#include <bits/stdc++.h>
using namespace std;

void display_array(int arr[], int size, string msg){
    cout << endl << msg << " : ";
    for(int i=0; i < size; i++){
        cout << arr[i] << " ";
    }
}

void element_frequecy(int arr[], int size, int find){
    int ans[size];
    int freq_count = 0;
    bool element_present = false;
    for(int i=0; i<size; i++){
        ans[i] = -1;
    }

    for(int i=0; i < size; i++){
        if(find == arr[i]){
            ans[i] = arr[i];
            freq_count++;
            element_present = true;
        }
    }

    cout << find << " is present " << freq_count << " times" << endl;

}

void reverse_arr(int arr[], int size){
    int rev_arr[size];
        
    display_array(arr, size, "Original Array");
    
    for(int i=0; i< size; i++){
        int j = size - 1 - i;
        rev_arr[j] = arr[i];        
    }
    
    display_array(rev_arr, size, "Reversed Array");
}

void reverse_arr_without_temp_variable(int arr[], int size){        
    display_array(arr, size, "Original Array");
    
    for(int i=0; i< size/2; i++){
        swap(arr[i], arr[size - 1 - i]);
    }
    
    display_array(arr, size, "Reversed Array");
}

int main()
{
    // int arr[] = {4, 8, 9, 1, 3, 7, 4, 7, 6, 7, 4, 11, 7, 15, 7};
    int arr[] = {4, 8, 9, 19, 38, 57, 91};
    int size = sizeof(arr)/sizeof(arr[0]);

    // element_frequecy(arr, size, 4);
    // reverse_arr(arr, size);
    reverse_arr_without_temp_variable(arr, size);

    return 0;
}