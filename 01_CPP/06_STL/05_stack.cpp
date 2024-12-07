#include<bits/stdc++.h>
using namespace std;

int main(){
    // LIFO - Last In First Out
    stack<int> st;
    st.push(15);
    st.push(30);
    st.push(45);
    st.push(60);

    cout << st.size() << endl;

    cout << st.top() << endl;

    st.pop();
    cout << st.top() << endl;
    st.pop();
    cout << st.top() << endl;
}