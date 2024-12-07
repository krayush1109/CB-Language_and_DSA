#include<bits/stdc++.h>
using namespace std;

int main(){

    unordered_set<int> st;

    st.insert(2323);
    st.insert(16);
    st.insert(78);
    st.insert(2);
    st.insert(225);

    for(auto i: st){
        cout << i << " ";
    }

}