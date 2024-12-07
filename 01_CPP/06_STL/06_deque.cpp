#include <bits/stdc++.h>
using namespace std;

int main()
{
    deque<int> dq;
    dq.push_back(10);
    dq.push_front(55);
    dq.push_front(171);
    dq.push_back(8);
    cout << dq.size() << endl;

    for (auto i : dq)
    {
        cout << i << " ";
    }
}
