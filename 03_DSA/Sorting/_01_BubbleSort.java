
class _01_BubbleSort {

    public static void main(String[] args) {

        int arr[] = {5, 4, 3, 2, 1};

        for (int pass = 1; pass < arr.length; pass++) {

            for (int i = 0; i < arr.length - pass; i++) {

                if (arr[i] > arr[i + 1]) {
                    int temp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;
                }

            }
        }

        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }

    }

}
