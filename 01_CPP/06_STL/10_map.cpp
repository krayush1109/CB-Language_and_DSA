#include<bits/stdc++.h>
using namespace std;

void map_1(){
    map<string, int> age;
    age["Raghav"] = 18;
    age["Ayush"] = 12;
    age["Yuvraj"] = 15;

    cout << age["Ayush"] << endl;

    age.insert({"Sahil", 8});
    age.insert({"Chayan", 5});

    for(auto i: age){
        cout << i.first << " " << i.second << endl;
    }
}
void map_2(){
    map< pair<int, int>, string > mp;

    mp[{1,2}] = "ABC";
    mp[{2,3}] = "DEF";
    mp[{4,5}] = "GHI";

    mp.insert({{6,7}, "XYZ"});

    for(auto i: mp){
        cout << i.first.first << " " << i.first.second << " : " << i.second << endl;
    }

}

int main(){
    // map_1();
    map_2();
}