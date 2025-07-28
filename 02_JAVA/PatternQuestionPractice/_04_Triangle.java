class _04_Triangle {
    public static void main(String[] args) {
        System.out.print("\n\n");

        // 🎯 TEMPLATE WAY TO SOLVE
        int n = 9;

        int total_row = n/2;
        for (int row = 1; row <= total_row; row++) {

            int total_col = row;
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