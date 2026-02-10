
class Palindrome {

    public static void main(String[] args) {

        // String s = "naman";
        String s = "abcba";

        // boolean ans = isPalin(s);
        boolean ans = isPalin2(s);
        System.out.println(ans);
    }

    public static boolean isPalin(String s) {
        for (int i = 0; i < s.length() / 2; i++) {
            if (s.charAt(i) != s.charAt(s.length() - i - 1)) {
                return false;
            }
        }

        return true;
    }

    // using while loop
    public static boolean isPalin2(String s) {

        int st = 0;
        int end = s.length()-1;

        while(st < end){
            if(s.charAt(st) !=  s.charAt(end)){
                return  false;
            }
            st++;
            end--;
        }

         return true;       
    }

}
