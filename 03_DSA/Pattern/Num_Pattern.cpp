#include <bits/stdc++.h>
using namespace std;

void numTriangle(int n = 5)
{
    int row = 1;
    int total_rows = n;

    while (row <= total_rows)
    {
        int col = 1;
        int total_cols = row;
        while (col <= total_cols)
        {
            cout << col;
            col++;
        }
        row++;
        cout << endl;
    }
}

void numTriangleFlip(int n = 5)
{
    int row = 1;
    int total_rows = n;
    while (row <= total_rows)
    {
        int col = 1;
        int total_cols = total_rows - row;

        while (col <= total_cols)
        {
            // cout << "o";
            cout << " ";
            col++;
        }

        col = 1;
        total_cols = row;
        while (col <= total_cols)
        {
            cout << col;
            col++;
        }
        row++;
        cout << endl;
    }
}

void numTriangleFlipDesc(int n = 5)
{
    int row = 1;
    int total_rows = n;

    while (row <= total_rows)
    {
        int col = 1;
        int total_cols = total_rows - (row);
        while (col <= total_cols)
        {
            // cout << "o";
            cout << " ";
            col++;
        }

        col = 1;
        total_cols = row;
        while (col <= total_cols)
        {
            cout << total_cols - (col - 1);
            col++;
        }
        row++;
        cout << endl;
    }
}

int main()
{
    cout << "Hello World" << endl;
    numTriangle();
    cout << endl;
    numTriangleFlip();
    cout << endl;
    numTriangleFlipDesc();
}