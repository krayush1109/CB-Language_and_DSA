
class _03_SubArrSum {

    public static void main(String[] args) {

        int arr[] = {-2, 1, -3, 4, -1, 2, 1, -5, 4};


    }

    public int maxSubArray(int[] arr) {

        int maxSum = 0;
        
        for (int i = 0; i < arr.length; i++) {

            int num1 = arr[0];            

            for (int j = i + 1; j < arr.length; j++) {

                int sum = num1 + arr[j];

                if (sum > maxSum) {
                    maxSum = sum;
                }

            }

        }

    }

}
