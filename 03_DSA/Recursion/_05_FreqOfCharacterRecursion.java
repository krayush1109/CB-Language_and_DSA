
class _05_FreqOfCharacterRecursion {
    public static void main(String[] args) {
        String s = "zzaaaabbaaccddeffgeeehzz";

        int[] freq = new int[26];
        boolean[] isVisited = new boolean[26];

        rec(s, freq, 0);
        print(s, freq, isVisited, 0);
    }

    public static void rec(String s, int[] freq, int i) {
        if(i == s.length()){
            return;
        }

        char ch = s.charAt(i);
        int freqIdx = ch - 97;
        freq[freqIdx]++;
        rec(s, freq , i+1);
    }

    public static void print(String s, int[] freqArr, boolean[] isVisited, int i) {
        if(i == s.length()){
            return;
        }

        char ch = s.charAt(i);            
        int freqIdx = ch - 97;

        if(isVisited[freqIdx] == false){        
            isVisited[freqIdx] = true;
            System.out.println(ch + " " + freqArr[freqIdx]);
        }
        print(s, freqArr, isVisited, i+1);
    }
} 