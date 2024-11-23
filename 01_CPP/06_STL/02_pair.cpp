#include <bits/stdc++.h>
using namespace std;

void f_pairs()
{
    pair<int, int> p = {1, 23};

    cout << p.first << " " << p.second << endl;

    pair<int, char> p2 = {'B', 'a'};
    cout << p2.first << " " << p2.second << endl;

    // Nesting Paris
    pair<int, pair<int, int>> pp = {12, {13, 26}};
    cout << pp.first << " " << pp.second.first << " " << pp.second.second << endl;

    // PAIR OF STRING
    pair<string, string> name = {"Ayush", "Kumar"};
    cout << name.first << " " << name.second << endl;

    pair<string, pair<string, string> > pStr = {"Hello", {"World", "Everyone" }};
    cout << pStr.first << " " << pStr.second.first << " " << pStr.second.second << endl;

}

int main()
{
    cout << "Hello" << endl;

    f_pairs();

    return 0;
}