
import java.util.Arrays;

class _02_PlaceQueen_Recursion {
    public static void main(String[] args) {
        
        int n = 3;
        int q = 3;
        String[] board = new String[n*n];
        Arrays.fill(board, "");
        // rec(board, q, 0);
        rec_distinct(board, q, 1);
    }

    // 1. All IDENTICAL Queens
    public static void rec(String[] board, int q, int si) {
        int n = board.length;
        if(q == 0){
            // System.out.println();
            print(board);
            return;
        }

        for(int i=si; i<n; i++) {
            board[i] = "q";
            // rec(board, q-1, si+1);
            rec(board, q-1, i+1);
            board[i] = "";
        }
    }

    // 2. DISTINCT QUEENS
    public static void rec_distinct(String[] board, int noq, int qno) {
        int n = board.length;        

        if(noq == 0){
            // System.out.println();
            print(board);
            return;
        }

        for(int i=0; i<n; i++) {
            if(!board[i].equals("")) continue; // skip occupied cell

            board[i] = "q" + qno;
            // rec(board, q-1, si+1);
            rec_distinct(board, noq-1, qno+1);
            board[i] = "";
        }
    }

    public static void print(String[] board) {
        int n = board.length;

        for(int i=0; i<n; i++){
            String val = (board[i].equals("")) ? "_" : board[i];
            // System.out.print(board[i] + " ");
            System.out.print(val + " ");
        }

        System.out.println();
    }

}