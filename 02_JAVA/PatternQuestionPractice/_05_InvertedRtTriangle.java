public class _05_InvertedRtTriangle {
    public static void main(String[] args){

        System.out.println("Hello");

        int n = 7;
        
        // 🎯 1. PRINT RECTANGLE
        // int row = 1;
        // while(row <= n){
        //     int nst = n;    // total number of stars in row
        //     int cst = 0;    // count of stars

        //     while(cst < nst){
        //         System.out.print("* ");
        //         cst++;
        //     }
        //     System.out.println();
        //     row++;
        // }

        // 🎯 2. PRINT TRIANGLE
        // int row = 1;
        // int nst = 1;    // total number of stars in row
        // while(row <= n){
        //     int cst = 0;    // count of stars

        //     while(cst < nst){
        //         System.out.print("* ");
        //         cst++;
        //     }
        //     System.out.println();
        //     row++;
        //     nst++;
        // }

        // 🎯 3. PRINT TRIANGLE
        // int row = 1;
        // int nst = n;    // total number of stars in row
        // while(row <= n){
        //     int cst = 0;    // count of stars

        //     while(cst < nst){
        //         System.out.print("* ");
        //         cst++;
        //     }
        //     System.out.println();
        //     row++;
        //     nst--;
        // }

        // 🎯 4. PRINT spaces then TRIANGLE
        int row = 0;
        int nst = n;

        int nsp = 0;        

        while(row <= n){

            int csp = 1;
            while(csp <= nsp){
                System.out.print("  ");
                csp++;
            }
            nsp++;

            int cst = 0;
            while(cst <= nst){
                System.out.print("* ");
                cst++;
            } 

            System.out.println();
            nst--;

            row++;
        }


    }
}
