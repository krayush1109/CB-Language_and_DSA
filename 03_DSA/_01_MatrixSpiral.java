
import java.util.*;

class _01_MatrixSpiral {

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

        spiralMatrix(arr);

        // printMatrix(arr);

    }

    public static void spiralMatrix(int[][] arr) {
        int minRow = 0;
        int maxRoww = arr.length - 1;
        int minCol = 0;
        int maxCol = arr[0].length - 1;
        int total = arr.length * arr[0].length;

        int count =0;
        while (count < total) {

            for (int c = minCol; c <= maxCol && count < total; c++) {
                System.out.print(arr[minRow][c] + " ");
                count++;
            }
            minRow++;

            for (int r = minRow; r <= maxRoww  && count < total; r++) {
                System.out.print(arr[r][maxCol] + " ");
                count++;
            }
            maxCol--;

            for (int c = maxCol; c >= minCol && count < total; c--) {
                System.out.print(arr[maxRoww][c] + " ");
                count++;
            }
            maxRoww--;

            for (int r = maxRoww; r >= minRow && count < total; r--) {
                System.out.print(arr[r][minCol] + " ");
                count++;
            }
            minCol++;
        }
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

}
