package _03_stackProblem;

import java.util.Arrays;
import java.util.Stack;

// refer to _02_NextGreaterElement.java - FOR BETTER EXPLAINATION.
public class _01_NextGreaterElement {    
    public static void main(String[] args) {
        
        int arr[] = { 5, 2, 6, 9, 1000, 99, 4, 101, 3, 7 };
        int ans[] = new int[arr.length];

        Stack<Integer> st = new Stack<>();

        for (int i = 0; i < ans.length; i++) {
            // जब तक stack खाली नहीं है और current element arr[i] > arr[st.peek()]
            // इसका मतलब arr[i] ही next greater है arr[st.peek()] के लिए
            while (!st.isEmpty() && arr[st.peek()] < arr[i]) {
                int idx = st.pop(); // index निकालो
                ans[idx] = arr[i]; // उस index का next greater = arr[i]
            }

            st.push(i); // current index को stack में डाल दो
        }

        // जिनके लिए कोई next greater नहीं मिला → -1 assign कर दो
        while (!st.isEmpty()) {
            int idx = st.pop();
            ans[idx] = -1;
        }

        System.out.println(Arrays.toString(ans));
    }

}
