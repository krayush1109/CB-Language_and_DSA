#include <bits/stdc++.h>
using namespace std;

void magicPattern(int n = 5)
{
    int total_rows = n;

    // 🔼 PART - A : Upper Part
    for (int row = 1; row <= total_rows; row++)
    {
        int total_cols = total_rows - row + 1;
        for (int col = 1; col <= total_cols; col++)
        {
            if (row == 1 && col == 1)
                continue;

            cout << "*" << "\t";
        }

        total_cols = (2 * row) - 3;
        for (int col = 1; col <= total_cols; col++)
        {
            cout << "o" << "\t";
        }

        total_cols = total_rows - row + 1;
        for (int col = 1; col <= total_cols; col++)
        {
            cout << "*" << "\t";
        }

        cout << endl;
    }

    total_rows = n;
    // 🔽 PART - B : Lower Part
    for (int row = total_rows; row >= 1; row--)
    {
        if(row == total_rows)
            continue;

        int total_cols = total_rows - row + 1;
        for (int col = 1; col <= total_cols; col++)
        {
            if (row == 1 && col == 1)
                continue;

            cout << "*" << "\t";
        }

        total_cols = (2 * row) - 3;
        for (int col = 1; col <= total_cols; col++)
        {
            cout << "o" << "\t";
        }

        total_cols = total_rows - row + 1;
        for (int col = 1; col <= total_cols; col++)
        {
            cout << "*" << "\t";
        }

        cout << endl;
    }

}

int main()
{
    int n;
    cin >> n;
    magicPattern();
}