class _03_Line {
    public static void main(String[] args) {
        System.out.print("\n\n");

        //     int n = 9;

        //     for (int i = 1; i <= n; i++) {

        //         for (int j = 1; j <= n / 2; j++) {

        //             System.out.print("* ");

        //         }
        //         System.out.println();
        //     }
        // }

        // 🎯2. TEMPLATE WAY TO SOLVE
        int n = 9;

        int total_row = n/2;
        for (int row = 1; row <= total_row; row++) {

            int total_col = n;
            for (int col = 1; col <= total_col; col++) {

                // String val = "*";
                // String val = col;
                int val = 2 * col;

                System.out.print(val + " ");
            }

            System.out.println();
        }

    }
}