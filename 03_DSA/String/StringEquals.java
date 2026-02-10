
class StringEquals{

    public static void main(String[] args) {
        
        String s= "hello";
        String t = "hello";

        // System.out.println(s==t);

        boolean ans = equals(s,t);  // our custom method
        System.out.println(ans);

        System.out.println(s.equals(t)); // Compares value, Inbuit methods
    }

    public static boolean  equals(String s, String t) {
        if(s.length() != t.length()){
            return false;
        }
        for(int i=0; i<s.length() ; i++){
            if(s.charAt(i) != t.charAt(i)){
                return  false;
            }            
        }

        return true;
    }

}
