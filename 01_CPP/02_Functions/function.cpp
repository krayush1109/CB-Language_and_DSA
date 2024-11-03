#include <bits/stdc++.h>
using namespace std;

// Function Prototype or Function Declaration: Declares the function `sum` which takes two integers `a` and `b`
int sum(int a, int b);

int factorial(int n){
    int fact = 1;
    for(int i = 1; i <= n; i++){
        fact *= i;        
    }
    return fact;
}

bool isEven(int n){
    if(n % 2 == 0)
        return true;
    else
        return false;
}
string isEvenStr(int n){
    if(n % 2 == 0)
        return "true";
    else
        return "false";
}

int main()
{
    int a, b;
    cin >> a >> b;
    cout << sum(a, b) << endl;

    cout << factorial(a) << endl;

    cout << isEven(a) << endl;
    cout << isEvenStr(a) << endl;
}

// Function Definition: Defines the actual code for the `sum` function.
int sum(int a, int b)
{
    return a + b;
}