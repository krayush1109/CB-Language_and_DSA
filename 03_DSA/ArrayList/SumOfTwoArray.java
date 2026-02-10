
import java.util.ArrayList;

class SumOfTwoArray {

    public static void main(String[] args) {

        int n = 4;
        int arr[] = {1, 0, 2, 9};

        int m = 5;
        int brr[] = {3, 4, 5, 6, 7};

        ArrayList<Integer> list = new ArrayList<>();

        int i = arr.length - 1;
        int j = brr.length - 1;
        while (i >= 0) {
            int sum = arr[i] + brr[j];
            i--; j--;
            int carry =0;

            if(carry!=0){
                sum+= carry;
                carry = 0;
            }

            if(sum>9){
                carry = sum - 10;
                sum = sum - 10;
            }
            list.add(0, sum);            
        }

        System.out.print(list);
    }

}
