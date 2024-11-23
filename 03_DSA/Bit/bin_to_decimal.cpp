#include<bits/stdc++.h>
using namespace std;

// 1.When input is a number
int binary_to_decimal(int bin){
    int i=0, decimal=0, original_num = bin;

    while (bin > 0)
    {
        int digit = bin % 10;
        decimal += digit* pow(2, i);
        bin /= 10;
        i++;        
    }
    cout << original_num << " in decimal has value: " << decimal << endl;

    return decimal;
}

// 2. When input is a string
int bin_to_decimail_2(string bin){
    int i = 0, decimal = 0;
    string original_bin = bin;
    cout << "Hello" << endl;

    for(int i=0; i < bin.length(); i++){
        if(bin[i] & 1)
            decimal = decimal + pow(2, bin.length()-i-1);
    }

    cout << decimal << endl;
    
    return decimal;
}

int main(){
    int n;
    cin >> n;
    // binary_to_decimal(n);

    string str = to_string(n);
    bin_to_decimail_2(str);
    
    return 0;
}