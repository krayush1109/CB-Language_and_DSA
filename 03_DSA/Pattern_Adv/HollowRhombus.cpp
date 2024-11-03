#include <iostream>
using namespace std;

void HollowRhombus(int n = 5)
{
    int total_rows = n;

    for (int row = 1; row <= total_rows; row++)
    {
        int total_cols = total_rows - row;
        if (row == total_rows)
            total_cols = 0;
        // 1. Printing initial spaces except for the last row
        for (int col = 1; col <= total_cols; col++)
        {
            cout << " ";
        }

        // 2. Printing starts
        total_cols = 1;
        if (row == 1 || row == total_rows)
            total_cols = total_rows;
        for (int col = 1; col <= total_cols; col++)
        {
            cout << "*";
        }

        // 3. Printing  spaces between the start expcept 1st row and last row
        total_cols = total_rows - 2;

        if (row == 1 || row == total_rows)
            total_cols = total_rows;
        for (int col = 1; col <= total_cols; col++)
        {
            cout << " ";
        }

        // 4. Printing last single star except the 1st & last row
        total_cols = 1;
        if (row == 1 || row == total_rows)
            total_cols = 0;
        for (int col = 1; col <= total_cols; col++)
        {
            cout << "*";
        }

        cout << endl;
    }
}

void chatGPT()
{
    int total_rows = 5, total_cols = 5;

    for (int row = 0; row < total_rows; row++)
    {
        for (int col = 0; col < total_cols; col++)
        {
            // Print '*' at the borders or specific diagonal positions
            if (row == 0 || row == total_rows - 1 || col == 0 || col == total_cols - 1 || row == col || col == total_cols - row - 1)
            {
                cout << "* ";
            }
            else
            {
                cout << "  ";
            }
        }
        cout << endl;
    }
}

int main()
{
    int n;
    cin >> n;

    HollowRhombus(n);
    // chatGPT();
}