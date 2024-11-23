#include <bits/stdc++.h>
using namespace std;

void display(int arr[], int n, string msg)
{
    cout << endl
         << msg << " : ";
    for (int i = 0; i < n; i++)
    {
        cout << arr[i] << " ";
    }
}

void remove_duplicate_sorted_array(int arr[], int n)
{
    int arr_2[n];

    for (int &x : arr_2)
        x = -1;

    int idx = 0;
    arr_2[idx] = arr[0];
    idx++;

    for (int i = 0; i < n - 1; i++)
    {
        int current_elem = arr[i];
        int next = arr[i + 1];

        if (current_elem != next)
        {
            arr_2[idx] = next;
            idx++;
        }
    }

    display(arr_2, idx, "Array After Removed Elements\n");
}

void sir_ka_code(int arr[], int n)
{
    int arr2[n];
    for (int i = 0; i < n; i++)
        arr2[i] = -1;
    int j = 0;
    arr2[0] = arr[0];
    j++;
    for (int i = 1; i < n; i++)
    {
        if (arr[i] != arr2[j - 1])
        {
            arr2[j] = arr[i];
            j++;
        }
    }

    display(arr2, n, "New Array");
    // for (int i = 0; i < n; i++)
    // {
    //     cout << arr2[i] << " ";
    // }
}

int main()
{
    int arr[] = {1, 2, 2, 2, 3, 4, 5, 5, 6, 7, 8, 8, 8, 9, 9, 12};
    int n = sizeof(arr) / sizeof(arr[0]);
    display(arr, n, "Original Array");

    remove_duplicate_sorted_array(arr, n);
    // sir_ka_code(arr, n);

    return 0;
}