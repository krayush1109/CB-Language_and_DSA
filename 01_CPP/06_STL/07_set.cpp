#include<bits/stdc++.h>
using namespace std;

int main(){
    set<int> st;
    // set<int, greater<int>> st;
    st.insert(15);
    st.insert(30);
    st.insert(99);
    st.insert(7);
    st.insert(45);
    st.insert(45);
    st.insert(32);
    // st.insert(5);

    st.erase(32);
    cout << st.empty() << endl;
    cout << st.size() << endl;

    cout << "Lower Bound : " << *st.lower_bound(90) << endl;
    
    for(auto i : st){
        cout << i << " ";
        if(i == *st.find(30)){
            cout << "Element found" << endl;
        } else{
            cout << "Not Found" << endl;
        }
    }

}