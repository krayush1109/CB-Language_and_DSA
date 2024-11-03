#include <iostream>
using namespace std;

int main()
{
    int n;
    cin >> n;
    int total_rows = n;

    for (int row = 1; row <= total_rows; row++)
    {

        // Part 1: Print increasing numbers from 1 to 'row'
        int total_cols = row;
        for (int col = 1; col <= total_cols; col++)
        {
            cout << col << "\t";
        }

        // Part 2: Print spaces or stars (using '*' here for simplicity)
        total_cols = 2 * (total_rows - row) - 1;
        for (int col = 1; col <= total_cols; col++)
        {
            if (row == total_rows)  // 🎯 Skip the number if it would be repeated in the middle
                continue;

            // cout << "*" << "\t";
            cout << "\t";
        }

        // Part 3: Print decreasing numbers from 'row' to 1
        total_cols = row;
        for (int col = 1; col <= total_cols; col++)
        {
            if (col == total_rows)  // 🎯 Skip the number if it would be repeated in the middle
                continue;
            cout << row - col + 1 << "\t";
        }

        cout << endl;
    }
    return 0;
}
