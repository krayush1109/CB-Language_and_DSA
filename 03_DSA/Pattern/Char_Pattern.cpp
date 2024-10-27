#include<bits/stdc++.h>
using namespace std;

void triangle(int n = 5){
    int row =1;
    int total_rows = n;

    while(row <= total_rows){
        int col = 1;
        int total_cols = row;

        while(col <= total_cols){
            cout << (char)('A' + col - 1);
            col++;
        }
        row++;
        cout << endl;
    }
}

void traingleAscending(int n=5){
    int total_rows = n;
    for(int row =1; row <= total_rows; row++){
        int total_cols = row;
        for(int col =1; col <= total_cols; col++){
            cout << (char)('A' + col + row - 2);
        }
        cout << endl;
    }
}

void triangleFlip(int n = 5){
    int total_rows = n;
    for(int row=1; row <= total_rows; row++){

        int total_cols = total_rows - row;
        for(int col =1; col <= total_cols; col++){
            // cout << "o";
            cout << " ";
        }

        total_cols = row;
        for(int col=1; col <= total_cols; col++){
            cout << (char)('A' + col -1);
        }
        cout << endl;
    }
}

void triangleFlipAscending(int n = 5){
    int total_rows = n;
    for(int row=1; row <= total_rows; row++){

        int total_cols = total_rows - row;
        for(int col =1; col <= total_cols; col++){
            // cout << "o";
            cout << " ";
        }

        total_cols = row;
        for(int col=1; col <= total_cols; col++){
            cout << (char)('A' + col + row - 2);
        }
        cout << endl;
    }
}

void triangleFlipDescending(int n = 5){
    int total_rows = n;
    for(int row=1; row <= total_rows; row++){

        int total_cols = total_rows - row;
        for(int col =1; col <= total_cols; col++){
            // cout << "o";
            cout << " ";
        }

        total_cols = row;
        for(int col=1; col <= total_cols; col++){
            cout << (char)('A' + total_cols - col);
        }
        cout << endl;
    }
}

int main(){
    triangle();
    cout << endl;
    traingleAscending();
    cout << endl;
    triangleFlip();
    cout << endl;
    triangleFlipAscending();
    cout << endl;
    triangleFlipDescending();
}