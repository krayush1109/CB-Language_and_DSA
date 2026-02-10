
import java.util.Scanner;

class _01_Fibonaaci {
    public static void main(String[] args){

        System.out.println("Enter position of fibonaci number to print : ");

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int prev1 = 0;
        int prev2 = 1;
        int next;    

        System.out.print(prev1 + ", ");
        System.out.print(prev2 + ", ");

        for(int i=3; i<=n; i++){
            next = prev1 + prev2;
            System.out.print(next + ", ");

            prev1 = prev2;
            prev2 = next;
        }

    }
}