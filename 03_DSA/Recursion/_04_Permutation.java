
class _04_Permutation{
    static int count =0;
    public static void main(String[] args){
        String str = "abc";
        rec(str, "");
        System.out.println();
        System.out.println(count);
    }

    public static void rec(String s, String ans) {        
        if(s.length() == 0){
            count++;
            System.out.print(ans + " ");            
            return;
        }

        for(int i=0; i<s.length(); i++){
            char select = s.charAt(i);
            String remain = s.substring(0, i) + s.substring(i+1, s.length());

            rec(remain, ans + select);
        }
    }
}