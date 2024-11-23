// Refrence : LOVE Babbar DSA in C++ Playlist
#include <bits/stdc++.h>
using namespace std;

// Right Angled Triangle 📐
void rightTriangle(int n)
{
    int total_rows = n;

    int row = 1;
    while (row <= total_rows)
    {
        int col = 1;
        int total_col = row;
        while (col <= total_col)
        {
            cout << "*";
      -      col++;
        }
        row++;
        cout << endl;
    }
}

void invertedRightTriangle(int n = 5)
{
    int row = 1;
    int total_rows = n;

    while (row <= total_rows)
    {
        int col = 1;
        int total_cols = total_rows - (row - 1);
        while (col <= total_cols)
        {
            cout << "*";
            col++;
        }
        cout << endl;
        row++;
    }
}

void rightTriangleFlippedY(int n = 5)
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
            cout << "*";
            col++;
        }
        cout << endl;
        row++;
    }
}

/*
******
*****
****
***
**
*
*/
void invertedRightTriangleFlippedY(int n = 5)
{
    int row = 1;
    int total_rows = n;

    while (row <= total_rows)
    {
        int col = 1;
        int total_cols = row - 1;
        while (col <= total_cols)
        {
            // cout << "o";
            cout << " ";
            col++;
        }

        col = 1;
        total_cols = total_rows - (row - 1);
        while (col <= total_cols)
        {
            cout << "*";
            col++;
        }
        row++;
        cout << endl;
    }
}

void equilateralTriangle(int n = 5)
{
    int row = 1;
    int total_rows = n;

    while (row <= total_rows)
    {
        int col = 1;
        int total_cols = total_rows - (row - 1);
        while (col <= total_cols)
        {
            // cout << "o";
            cout << " ";
            col++;
        }

        col = 1;
        total_cols = (2 * row) - 1;
        while (col <= total_cols)
        {
            cout << "*";
            col++;
        }

        row++;
        cout << endl;
    }
}

/*
***********
*********
*******
*****
***
*
*/
void invertedEquilateralTriangle(int n = 5)
{
    int row = 1;
    int total_rows = n;

    while (row <= total_rows)
    {
        int col = 1;
        int total_cols = row - 1;
        while (col <= total_cols)
        {
            // cout << "o";
            cout << " ";
            col++;
        }

        col = 1;
        total_cols = (2 * (total_rows - row) - 1);
        while (col <= total_cols)
        {
            cout << "*";
            col++;
        }

        row++;
        cout << endl;
    }
}

/*
 *
 **
 ***
 ****
 ***
 **
 *
 */
void printTriangleWithBaseOnYAxis(int n)
{
    int row = 1;
    int total_rows = n;

    total_rows = (total_rows + 1) / 2;
    while (row <= total_rows)
    {
        int col = 1;
        int total_cols = row;

        while (col <= total_cols)
        {
            cout << "*";
            col++;
        }
        row++;
        cout << endl;
    }

    row = 1;
    total_rows = (n - 1) / 2;
    while (row <= total_rows)
    {
        int col = 1;
        int total_cols = total_rows - (row - 1);
        while (col <= total_cols)
        {
            cout << "*";
            col++;
        }
        row++;
        cout << endl;
    }
}

void printTriangleWithBaseOnYAxisFlipped(int n)
{
    int row = 1;
    int total_rows = n;

    row = 1;
    total_rows = (n + 1) / 2;
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
            cout << "*";
            col++;
        }
        row++;
        cout << endl;
    }

    row = 1;
    total_rows = (n - 1) / 2;
    while (row <= total_rows)
    {
        int col = 1;
        int total_cols = row;

        while (col <= total_cols)
        {
            // cout << "o";
            cout << " ";
            col++;
        }

        col = 1;
        total_cols = total_rows - (row - 1);
        while (col <= total_cols)
        {
            cout << "*";
            col++;
        }
        row++;
        cout << endl;
    }
}

void diamond(int n = 7)
{
    int total_rows = (n + 1) / 2;
    for (int row = 1; row <= total_rows; row++)
    {
        int total_cols = total_rows - row;
        for (int col = 1; col <= total_cols; col++)
        {
            cout << ' ';
        }

        total_cols = (2 * row) - 1;
        for (int col = 1; col <= total_cols; col++)
        {
            cout << '*';
        }
        cout << endl;
    }

    total_rows = (n - 1) / 2;
    for (int row = 1; row <= total_rows; row++)
    {
        int total_cols = row;
        for (int col = 1; col <= total_cols; col++)
        {
            cout << ' ';
        }

        total_cols = 2 * (total_rows - row) + 1;
        for (int col = 1; col <= total_cols; col++)
        {
            cout << '*';
        }
        cout << endl;
    }
}

int main()
{
    int n;
    cin >> n;

    rightTriangle(n);
    cout << endl;
    invertedRightTriangle(n);
    cout << endl;
    rightTriangleFlippedY(n);
    cout << endl;
    invertedRightTriangleFlippedY(n);
    cout << endl;
    equilateralTriangle(n);
    cout << endl;
    invertedEquilateralTriangle(n);
    cout << endl;
    printTriangleWithBaseOnYAxis(n);
    cout << endl;
    printTriangleWithBaseOnYAxisFlipped(n);
    cout << endl;
    diamond(n);
}
