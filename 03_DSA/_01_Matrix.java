
import java.util.*;

class _01_Matrix {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int arr[][] = new int[n][m];

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        // int ans = max(arr);
        // System.out.println(ans);
        // System.out.println(find(arr, 55));
        // printMatrix(arr);
        // arr = transpose(arr);
        // printMatrix(arr);
        printColumnWise(arr);

    }

    public static void printMatrix(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }

    public static int max(int[][] arr) {
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                if (arr[i][j] > max) {
                    max = arr[i][j];
                }
            }
        }
        return max;
    }

    public static boolean find(int[][] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                if (target == arr[i][j]) {
                    return true;
                }
            }
        }

        return false;
    }

    public static int[][] transpose(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr[0].length; j++) {     // print upper triangle
                // 🎯 OR j = 0; j < i; j++  // print lower triangle
                // 🎯 OR j = 0; j < i; j++
                int temp = arr[i][j];
                arr[i][j] = arr[j][i];
                arr[j][i] = temp;
            }
        }

        return arr;
    }

    public static int[][] printColumnWise(int[][] arr) {
        for (int col = 0; col < arr[0].length; col++) {     // print upper triangle
            for (int row = 0; row < arr.length; row++) {

                int r = (col % 2 == 0) ? row : arr.length - row -1;

                System.out.print(arr[r][col] + " ");

            }
        }

        return arr;
    }
}
