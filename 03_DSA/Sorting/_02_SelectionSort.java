
class _02_SelectionSort {

    public static void main(String[] args) {

        // int arr[] = {5, 4, 3, 2, 1};
        int arr[] = {1, 3, -1, 4, 8, 11, 9};

        // 🎯 2. Sir Approach
        for (int i = 0; i < arr.length - 1; i++) {
            int min_idx = i;

            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[min_idx]) {
                    min_idx = j;
                }
            }

            if (min_idx != i) {
                int temp = arr[i];
                arr[i] = arr[min_idx];
                arr[min_idx] = temp;
            }
        }

        display(arr);
    }

    public static void display(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        // Arrays.toString(arr);
    }

}
