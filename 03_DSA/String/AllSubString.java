
import java.util.Scanner;

class AllSubString{

    public  static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        // String s = sc.next();
        String s = "abcd";

        printAllSubStr(s);
    }

    public static void printAllSubStr(String s) {
        
        int sI =0;
        while(sI < s.length()){

            int eI = sI+1;
            while (eI <= s.length()) { 
                System.out.println(s.substring(sI, eI)); 
                eI++;               
            }

            sI++;
        }
    }

}