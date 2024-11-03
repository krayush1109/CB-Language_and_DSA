#include<iostream>
using namespace std;

int main(){
    int n;
    cin >> n;
    int i=2;
    cout << "Hello " << endl;
    while(i < n){
        if(n%i == 0){
            cout<< "Not a Prime Number.";
            break;
        }
        i++;
    }

    if(i==n)
        cout<< n << " is a Prime Number";

    return 0;
}