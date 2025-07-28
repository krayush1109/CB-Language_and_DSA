class _02_Line {
    public static void main(String[] args) {
        System.out.print("\n\n");

        int n = 6;
        int count = 1;
        for (int i = 1; i <= 3; i++) {

            for (int j = 1; j <= 5; j++) {
                if (count < 10)
                    System.out.print("0");

                System.out.print(count + " ");
                count++;
            }

            System.out.print("\n");

        }

    }
}