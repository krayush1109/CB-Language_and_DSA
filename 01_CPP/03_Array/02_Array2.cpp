#include<bits/stdc++.h>
using namespace std;
 
void printArr(int arr[], int n){
    cout << "Array Elements : ";
    for(int i=0; i < n; i++){
        cout << arr[i] << " ";
    }
}

void printArrPtr(int *ptrArr, int n){
    cout << "\nPassing array as pointer parameter ";
    for(int i=0; i<n; i++){
        cout << *(ptrArr + i) << " ";
    }

}

int main(){
    cout << "hello world" << endl;

    int arr[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 0};
    int size = sizeof(arr)/sizeof(arr[0]);

    arr[0] = 'A';
    cout << arr[0] << endl;
    cout << arr[1] << endl;
    cout << &arr[0] << endl;
    cout << &arr[1] << endl;
    cout << *(&arr[0]) << endl;
    cout << *(&arr[0] + 1) << endl;
 
    cout << "Total Size of array : " << sizeof(arr) << " bytes.\n" ;
    cout << "Length of array : " << size << endl;

    char ch_arr[] = {'a', 'e', 'i', 'o', 'u'};
    
    cout << ch_arr[0] << endl;

    printArr(arr, size);
    printArrPtr(arr, size);
    

    return 0;
}