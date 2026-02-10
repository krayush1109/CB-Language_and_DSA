
class GoodString {

    public static void main(String[] args) {

        String s = "cbaeicde";

        int ans = goodSubstring(s);

        System.out.println(ans);

    }

    public static int goodSubstring(String s) {
        int maxLen = 0;

        // ALL printAllSubStr        
        int sI = 0;
        while (sI < s.length()) {

            int eI = sI + 1;
            while (eI <= s.length()) {
                String temp = s.substring(sI, eI);

                if(isVowel(temp) && maxLen < temp.length()){
                    maxLen = temp.length();
                }

                // System.out.println(s.substring(sI, eI));
                eI++;
            }

            sI++;
        }

        return maxLen;
    }

    public static boolean  isVowel(String s) {
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i)  != 'a' && s.charAt(i)  != 'e' && s.charAt(i)  != 'i' && s.charAt(i)  != 'o' && s.charAt(i)  != 'u' ){
                return false; 
            }
        }

        return true;
    }

}
