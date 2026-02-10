class _06_CoinDenomination{
    static int count = 0;
    public static void main(String[] args) {        
        int n =3;
        int t = 5;
        // int[] coins = new int[n];
        int[] coins = {1, 2, 5};

        // rec(coins, t, "");
        rec_unique(coins, t, "", 0);
        System.out.println();
        System.out.println(count);
    }

    // 1. All Permutation
    public static void rec(int[] coins, int t, String ans) {  // t is target      
        if(t == 0){
            count++;
            System.out.println(ans);
            return;
        }
        if(t < 0) return;

        for(int val : coins){
            if(t-val >= 0)
                rec(coins, t - val, ans + val);
        }
    }

    // 2. unique solution
    public static void rec_unique(int[]  coins, int t , String ans, int si) { // t: target; si: start index
        if(t == 0){
            count++;
            System.out.println(ans);
            return;
        }
        if(t < 0) return;

        for(int i=si; i<coins.length; i++){
            int val = coins[i];
            if(t-val >= 0)
                rec_unique(coins, t - val, ans + val, i);
        }
    }
}