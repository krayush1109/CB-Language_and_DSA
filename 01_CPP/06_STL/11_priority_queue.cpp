#include <bits/stdc++.h>
using namespace std;

int main()
{

    priority_queue<int> pq;
    pq.push(60);
    pq.push(30);
    pq.push(20);
    pq.push(50);
    pq.push(80);
    pq.push(10);

    while (!pq.empty())
    {
        cout << pq.top() << endl;
        pq.pop();
    }
}