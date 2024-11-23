#include <bits/stdc++.h>
using namespace std;

void vector_pair_1()
{
    vector<pair<int, int>> vp;
    vp.push_back({8, 16});
    vp.push_back({24, 32});

    cout << vp[0].first << endl;
    cout << vp[0].second << endl;

    for(int i= 0; i< vp.size(); i++){
        cout << vp[i].first << " " << vp[i].second << endl;
    }

    // ------------------------------------
    cout << "------- -------" << endl;
    vector<int> vp2;
    vp2.push_back(15);
    vp2.push_back(30);
    vp2.push_back(45);

    vector<int>::iterator it = vp2.begin();
    cout << *it << endl;
    cout << *(it + 1) << endl;
    cout << *(it + 2) << endl;

    

}

int main()
{
    vector_pair_1();
}