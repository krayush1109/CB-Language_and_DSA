#include<bits/stdc++.h>
using namespace std;

int main(){
    // multiset -> sorted & duplicate value bhi rahega.

    multiset<int> mst;

    mst.insert(10);
    mst.insert(15);
    mst.insert(20);
    mst.insert(30);
    mst.insert(40);
    mst.insert(45);
    mst.insert(45);
    mst.insert(15);

    for(auto i: mst){
        cout << i << " ";
    }

}