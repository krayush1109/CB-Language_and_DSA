package _03_stackProblem;

import java.util.Stack;

/*
    🎯 Mnemonic for Revision
        "Pop when smaller, calculate area, push when taller"
        (छोटा दिखे → निकालो, area निकालो, बड़ा दिखे → stack में डालो
*/

public class _05_Histogram {
    public static void main(String[] args) {
        int[] arr = { 2, 1, 5, 6, 2, 3 };
        // int result = largestRectangleArea(arr);
        int result = largestRectangleAreaExplanation(arr);
        System.out.println(result);
    }    
    
    public static int largestRectangleAreaExplanation(int[] heights) {
        // Stack में हम indices रखते हैं ताकि width calculate कर सकें
        Stack<Integer> idxStack = new Stack<>();
        int maxArea = 0; // final answer (largest rectangle area)

        // Step 1: Traverse all bars
        for (int currIdx = 0; currIdx < heights.length; currIdx++) {
            // जब भी नया bar छोटा हो stack के top वाले bar से → pop करो
            while (!idxStack.isEmpty() && heights[currIdx] <= heights[idxStack.peek()]) {
                // Pop करके height निकालो
                int poppedHeight = heights[idxStack.pop()];

                // Width निकालने के लिए दो cases:
                if (idxStack.isEmpty()) {
                    // Case 1: Stack खाली → मतलब popped bar सबसे छोटा था अब तक
                    // Width = currIdx (क्योंकि 0 से currIdx-1 तक सब उससे बड़े थे)
                    int width = currIdx;
                    maxArea = Math.max(maxArea, poppedHeight * width);
                } else {
                    // Case 2: Stack खाली नहीं → मतलब पीछे कोई बड़ा bar है
                    int prevIdx = idxStack.peek();
                    // Width = currIdx - prevIdx - 1
                    // (क्योंकि prevIdx के बाद से currIdx-1 तक poppedHeight valid है)
                    int width = currIdx - prevIdx - 1;
                    maxArea = Math.max(maxArea, poppedHeight * width);
                }
            }
            // Current index को stack में डाल दो
            idxStack.push(currIdx);
        }

        // Step 2: अब बचे हुए bars handle करो (end तक पहुँच गए)
        int totalBars = heights.length;
        while (!idxStack.isEmpty()) {
            int poppedHeight = heights[idxStack.pop()];

            if (idxStack.isEmpty()) {
                // Case 1: Stack खाली → पूरा array width valid है
                int width = totalBars;
                maxArea = Math.max(maxArea, poppedHeight * width);
            } else {
                // Case 2: Stack खाली नहीं → पीछे कोई बड़ा bar है
                int prevIdx = idxStack.peek();
                int width = totalBars - prevIdx - 1;
                maxArea = Math.max(maxArea, poppedHeight * width);
            }
        }

        return maxArea;
    }

    // 2. BY SIR
    public static int largestRectangleArea(int[] heights) {
        Stack<Integer> st = new Stack<>(); // stack stores indices
        int ans = 0;

        for (int i = 0; i < heights.length; i++) {
            // जब भी नया bar छोटा हो stack के top से → pop करो
            while (!st.isEmpty() && heights[i] <= heights[st.peek()]) {
                int h = heights[st.pop()]; // निकला हुआ bar की height

                if (st.isEmpty()) {
                    int w = i; // अगर stack खाली → width = i
                    ans = Math.max(ans, h * w);
                } else {
                    int p = st.peek(); // पिछला बड़ा bar
                    int w = i - p - 1; // width = currIdx - prevIdx - 1
                    ans = Math.max(ans, h * w);
                }
            }
            st.push(i); // current index डाल दो
        }

        // अब बचे हुए bars handle करो
        int i = heights.length;
        while (!st.isEmpty()) {
            int h = heights[st.pop()];

            if (st.isEmpty()) {
                int w = i; // पूरा array width
                ans = Math.max(ans, h * w);
            } else {
                int p = st.peek();
                int w = i - p - 1;
                ans = Math.max(ans, h * w);
            }
        }

        return ans;
    }
}