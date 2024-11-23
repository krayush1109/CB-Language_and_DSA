#include <bits/stdc++.h>
using namespace std;

void stl_1()
{
    vector<int> arr(10, -1);
    cout << arr[0] << endl;
    cout << arr[0] << endl;
    cout << arr[1] << endl;
    cout << arr.size() << endl;

    // traverse
    for (auto i = 0; i < arr.size(); i++)
    {
        arr[i] = i;
    }

    for (auto i = arr.begin(); i != arr.end(); i++)
    {
        cout << *i << endl;
    }
}

void stl_2(){

    vector<int> v(5);
    v[0] = 12;
    v[1] = 24;
    v[2] = 36;
    v.push_back(48);
    v.push_back(60);
    v.push_back(72);


    cout << "Property of vectors : ----- " << endl;
    cout << *v.begin() << endl;
    cout << *v.begin() + 1 << endl;
    cout << *(v.begin() + 1) << endl;
    cout << *(v.begin() + 2)<< endl;
    cout << *(v.end())<< endl;
    // cout << *(--v.end())<< endl;
    cout << *(v.end())<< endl;
    
    cout << *(v.rbegin())<< endl;
    cout << *(--v.rend()) << endl;

    // ye sirf property hai isliye isme * use nhi hua hai.
    cout << v.empty() << endl;

    v.pop_back();
    v.pop_back();

    // Insert at Specific idx
    // v.insert(iterator, value);
    v.insert(v.begin() + 1, 240);
    v.insert(v.begin() + 4, 640);
    
    // DELETE
    // v.erase(iterator)
    // v.erase(v.begin());
    v.erase(v.begin() + 2);
    v.clear();
    v.push_back(18);

    // DISPLAY
    cout << "------- Vector All Elements : " << endl;
    for(int i=0; i < v.size(); i++ ){
        cout << i << " " << v[i] << endl;
    }
    cout << "-----------" << endl;
    vector<int> v2;
    cout << v2.empty() << endl;

}

void 

int main()
{
    // stl_1();
    stl_2();
}