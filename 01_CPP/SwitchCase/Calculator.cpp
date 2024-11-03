#include<bits/stdc++.h>
using namespace std;

void usingWhileLoop(int a, int b, char op){
    while (true)
    {
        cin >> a >> b >> op;
        if(op == '*')
            cout << "Ans: " << a * b << endl;
        else if(op == '+')
            cout << "Ans: " << a + b << endl;
        else if(op == '-')
            cout << "Ans: " << a - b << endl;
        else if(op == '/')
            cout << "Ans: " << a + b << endl;
        else if(op == '%')
            cout << "Ans: " << a + b << endl;
        else
            break;
    }
    
}

void usingSwitchCase(int a, int b, char op){
    cin >> a >> b >> op;

    switch (op)
    {
    case '+':
        cout << "Answer: " << a + b;
        break;
    case '-':
        cout << "Answer: " << a - b;
        break;
    case '*':
        cout << "Answer: " << a * b;
        break;
    case '/':
        cout << "Answer: " << a / b;
        break;
    
    default:
        break;
    }
}

int main(){
    int a, b; 
    char op;
    // cin >> a >> b >> op;
    
    // usingWhileLoop(a, b, op);
    usingSwitchCase(a, b, op);
    return 0;
}