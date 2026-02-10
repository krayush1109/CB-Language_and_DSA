
import java.util.Arrays;

class _01_PlaceQueen_All_Identical {
    static  int count = 0;
    public static void main(String[] args) {
        
        int n = 3;
        int q = 2;

        String[] board = new String[n*n];
        Arrays.fill(board, "");

        // placeQueen(board, q);
        placeQueen_idential(board, q);
    }

    //🟠🟠 Issue with whole code (BRUTE FORCE): Valid only of 2 queens arrangement.
    // ⚠️ if you scale it: Can't Possible, That's why Recursion is required.

    // 1. ALL DISTINCT
    public static void placeQueen(String[] board, int noq) { // noq: no. of queens
        int n = board.length;
        System.out.println("n : " + n);

        for(int i=0; i<n; i++){
            int q = 1; // queen count 1 (initially)
            board[i] = "q" + q++;

            for(int j=0; j<n; j++){
                if(i == j) continue;

                board[j] = "q" + q;
                print(board);
                board[j] = "";
            }

            board[i] = "";
            System.out.println();
        }
    }

    // 2. ALL IDENTICAL QUEENS
    public static void placeQueen_idential(String[] board, int noq) { // noq: no. of queens
        int n = board.length;
        System.out.println("n : " + n);

        for(int i=0; i<n; i++){
            int q = 1; // queen count 1 (initially)
            board[i] = "q";

            for(int j=i+1; j<n; j++){            
                board[j] = "q";
                print(board);
                board[j] = "";
            }

            board[i] = "";
            System.out.println();
        }
    }

    public static void print(String[] board) {
        int n = board.length;

        for(int i=0; i<n; i++){
            String val = (board[i] == "") ? "_" : board[i];
            // System.out.print(board[i] + " ");
            System.out.print(val + " ");
        }

        System.out.println();
    }

}