#include<iostream>
using namespace std;

int main(){
    // int arr[5];
    // int arr[] = {12, 24, 36, 48};
    int arr[6] = {12, 24, 36, 48};

    cout<< arr[1] << endl;
    cout<< &arr[2] << endl;
    cout<< &arr[3] << endl;
    cout<< &arr[4] << endl;
    cout<< &arr[5] << endl;
    cout<< &arr[50] << endl;

    auto d = 4.65;
    auto e = 5 + 9.653;
    cout<< d << endl;
    cout<< e << endl;
    // cout<< typeof(d) << endl;

    return 0;
}