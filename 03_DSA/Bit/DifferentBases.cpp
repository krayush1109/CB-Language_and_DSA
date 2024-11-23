#include <bits/stdc++.h>
#include <iomanip>  // for std::hex

using namespace std;

void Example1(){
    int decimalNum = 42;       // Decimal
    int octalNum = 052;        // Octal (prefix 0)
    int hexNum = 0x2A;         // Hexadecimal (prefix 0x)
    int binaryNum = 0b101010;  // Binary (prefix 0b)

    cout << "Decimal: " << decimalNum << endl;
    cout << "Octal: " << octalNum << endl;
    cout << "Hexadecimal: " << hexNum << endl;
    cout << "Binary: " << binaryNum << endl;

}

void Example2(){
    int decimalNum = 26;        // Decimal
    int hexNum = 0x2A;          // Hexadecimal, equivalent to 42 in decimal
    int binaryNum = 0b101010;   // Binary, equivalent to 42 in decimal

    int result = decimalNum & hexNum;
    // cout << (decimalNum & hexNum) << endl;
    cout << "Decimal AND Hexadecimal: " << decimalNum << endl;          // Output in decimal
    cout << "Decimal AND Hexadecimal: " << oct << decimalNum << endl;          // Output in decimal
    cout << "Binary representation of result: " << bitset<8>(result) << endl;
}

void Eg3(){
    int number = 42;

    cout << "Decimal: " << dec << number << endl;       // Decimal output
    cout << "Octal: " << oct << number << endl;         // Octal output
    cout << "Hexadecimal: " << hex << number << endl;   // Hexadecimal output
    cout << "Binary: " << bitset<8>(number) << endl;    // Binary output (8-bit representation)    
}

int main() {
    // Example2();

    Eg3();
    return 0;
}
