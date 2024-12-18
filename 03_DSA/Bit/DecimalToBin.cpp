#include <bits/stdc++.h>
using namespace std;

void decToBin_simple(int n);
string decToBin(int n);
string FullBinaryNum(string bin);      
string OnceComplimentOfBin(string fullBin);
string addOneToBinary(string bin);

string decToBinNegativeNum(int n){       
    cout << "----------------" << endl;
    string bin = decToBin(abs(n));
    string fullBin = FullBinaryNum(bin);
    string OnceComplimentBin = OnceComplimentOfBin(fullBin);
    string TwoComplimentBin = addOneToBinary(OnceComplimentBin);    
    cout << "----------------" << endl;
    return TwoComplimentBin;
}

int main()
{
    int n;
    cin >> n;
    cout << "Decimal: " << n << endl;

    // decToBin(n);
    decToBin_simple(n);
    
    return 0;
}

void decToBin_simple(int n){
    int bin[32];
    int col=0;

    // 1. binary
    while (n != 0)
    {
        bin[col] = n % 2;
        n = n/2;
        col++;        
    }

    // 2. reversing the binary bit
    for(int i=col-1; i >= 0; i--)
        cout << bin[i];

}

string decToBin(int n){
    int originalNum = n;
    string bin = "";
    if(n >= 0){
        while (n != 0)
        {
            int digit = n & 1;            
            bin = to_string(digit) + bin;
            n = n >> 1;
        }
        // cout << "Binary of " << originalNum << " is : " << bin << endl;
    } else{
        bin = decToBinNegativeNum(n);
    }

    cout << originalNum << " is represented as " << bin << " in binary" << endl;

    return bin;
}

string FullBinaryNum(string bin){        
        string binMsbZeros = "";
        for (int i = 1; i <= (32 - bin.length()); i++)
        {                
            binMsbZeros += to_string(0);
        }
        string fullBin = binMsbZeros + bin;
        cout << "Full Binary No Length : " << fullBin.length() << endl;
        cout << "Full Binary No :   " << fullBin << endl;
        return fullBin;
}

string OnceComplimentOfBin(string fullBin){
        // 2. taking 1's compliment
        cout << "1's Compliment :   ";
        for(int i=0; i< fullBin.length(); i++){
            if(fullBin[i] == '0')
                fullBin[i] = '1';
            else
                fullBin[i] = '0';

            cout << fullBin[i];;
        }
        cout << endl;
        return fullBin;
}

string addOneToBinary(string bin){
    int carry = 1;

    for(int i = bin.length() -1; i >=0; i--){
        if(bin[i] == '1' && carry == 1){
            bin[i] = '0';
        } else if(bin[i] == '0' && carry == 1){
            bin[i] = '1';
            carry = 0;
            break;
        }
    }

    cout << "2's Compliment :   " << bin << endl;
    return bin;
}