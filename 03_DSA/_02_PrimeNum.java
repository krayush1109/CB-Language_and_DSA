
import java.util.Scanner;

class _02_PrimeNum{
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        boolean isPrime = false;

        for(int i=2; i<n; i++){
            if(n%i == 0){
                isPrime = false;
                break;
            }

            isPrime = true;
        }

        System.out.println("isPrime : " + isPrime);
    }
}