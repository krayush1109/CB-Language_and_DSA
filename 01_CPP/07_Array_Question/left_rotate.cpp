#include <bits/stdc++.h>
using namespace std;

void display(int arr[], int n)
{
    for (int i = 0; i < n; i++)
    {
        cout << arr[i] << " ";
    }

    cout << "\n";
}

void rotate_left_by_1()
{
    // T.C: O(n)
    // S.C: O(n)
    int arr[] = {11, 2, 3, 4, 5, 6};
    int n = sizeof(arr) / sizeof(arr[0]);
    int ans[n];

    cout << n << endl;
    for (int i = 0; i < n - 1; i++)
    {
        ans[i] = arr[i + 1];
    }
    ans[n - 1] = arr[0];

    display(arr, n);
    display(ans, n);
}

int main()
{
    rotate_left_by_1();
}