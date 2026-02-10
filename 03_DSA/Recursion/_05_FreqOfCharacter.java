
class _05_FreqOfCharacter {
    public static void main(String[] args) {
        String s = "zzaaaabbaaccddeffgeeehzz";

        freqCount(s);
    }

    public static void freqCount(String s) {
        int[] freqArr = new int[26];

        char[] ch = s.toCharArray();

        for(int i=0; i<s.length(); i++){
            int alphbetIdx = s.charAt(i) - 'a';
            freqArr[alphbetIdx]++; 
            // System.out.println(alphbetIdx);
        }

        // print(freqArr);
        printInOrder(freqArr, s);
    }

    public static void print(int[] freqArr) {
        for(int i=0; i<freqArr.length; i++){
            if(freqArr[i] != 0){
                int asciVal = i + 97;
                char ch = (char)asciVal;
                System.out.println(ch + " " + freqArr[i]);
            }
        }
    }

    public static void printInOrder(int[] freqArr, String s) {
        boolean[] isVisited = new boolean[freqArr.length];

        for(int i=0; i<s.length(); i++){
            char ch = s.charAt(i);
            int idxArr = ch - 97;

            if(isVisited[idxArr] == false){
                // System.out.println(idxArr);
                isVisited[idxArr] = true;
                System.out.println(ch + " " + freqArr[i]);            
            }
        }
    }

}