package _03_stackProblem;

import java.util.Arrays;
import java.util.Stack;

public class _04_DI_Pattern {
    public static void main(String[] args) {

        di_pattern("IDDDI");
        di_pattern("IDIDDD");
        di_pattern_expln("IDIDDD");
    }

    // More Explaination
    public static void di_pattern_expln(String pattern) {

        Stack<Integer> dStack = new Stack<>(); // stack → 'D' positions store करने के लिए
        int result[] = new int[pattern.length() + 1]; // final answer array → length = n+1
        int nextNum = 1; // अगला number assign करने के लिए (start from 1)

        // Step 1: iterate over each character in the pattern
        for (int pos = 0; pos < pattern.length(); pos++) {
            char ch = pattern.charAt(pos);

            if (ch == 'I') {
                // अगर 'I' है → current position को तुरंत assign कर दो
                result[pos] = nextNum++;

                // अब तक जितने 'D' positions थे → उनको भी resolve कर दो
                // क्यों? क्योंकि 'I' आने का मतलब है sequence अब बढ़ना चाहिए,
                // तो पहले वाले 'D' positions को decreasing order में भरना होगा
                while (!dStack.isEmpty()) {
                    result[dStack.pop()] = nextNum++;
                }
            } else {
                // अगर 'D' है → अभी assign मत करो, stack में position डाल दो
                // क्यों? क्योंकि हमें पता नहीं कितने consecutive 'D' आएंगे,
                // इसलिए बाद में एक साथ resolve करेंगे
                dStack.push(pos);
            }
        }

        // Step 2: last position हमेशा assign होगा
        // क्यों? क्योंकि answer array की length pattern से 1 ज्यादा है,
        // और आखिरी slot हमेशा भरना जरूरी है
        result[pattern.length()] = nextNum++;

        // Step 3: अगर stack में अभी भी 'D' positions बचे हैं → उनको resolve करो
        // क्यों? क्योंकि अगर pattern 'D' पर खत्म होता है,
        // तो वो सारे positions अभी तक assign नहीं हुए होंगे
        while (!dStack.isEmpty()) {
            result[dStack.pop()] = nextNum++;
        }

        // Step 4: output print करो
        System.out.print(pattern + " : ");
        System.out.println(Arrays.toString(result));
    }

    public static void di_pattern(String s) {

        Stack<Integer> st = new Stack<>();
        int ans[] = new int[s.length() + 1];

        int count = 1;

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'I') {
                ans[i] = count++;

                while (!st.isEmpty()) {
                    ans[st.pop()] = count++;
                }
            } else {
                st.push(i);
            }
        }

        ans[s.length()] = count++;
        while (!st.isEmpty()) {
            ans[st.pop()] = count++;
        }

        System.out.println();
        System.out.print(s + " : ");
        System.out.println(Arrays.toString(ans));
    }

}
