package _03_stackProblem;

import java.util.Arrays;
import java.util.Stack;

public class _03_StockHoldDays {
    public static void main(String[] args) {
        int prices[] = {30, 35, 40, 39, 35, 38, 39, 50}; // stock prices
        int span[] = new int[prices.length]; // answer array → span of each day
        Stack<Integer> indexStack = new Stack<>(); // stack में indices store होंगे

        for (int currentDay = 0; currentDay < prices.length; currentDay++) {
            int currentPrice = prices[currentDay]; // आज का price

            // जब तक stack खाली नहीं है और currentPrice >= price[topIndex]
            // मतलब आज का price पिछले वाले से बड़ा/बराबर है → pop कर दो
            while (!indexStack.isEmpty() && prices[indexStack.peek()] <= currentPrice) {
                indexStack.pop();
            }

            // अगर stack खाली है → मतलब आज का price सबसे बड़ा है अब तक
            if (indexStack.isEmpty()) {
                span[currentDay] = currentDay + 1; // पूरे currentDay+1 दिनों का span
            } else {
                // वरना span = आज का दिन - last greater price का दिन
                span[currentDay] = currentDay - indexStack.peek();
            }

            // आज का दिन stack में डाल दो
            indexStack.push(currentDay);
        }

        System.out.println(Arrays.toString(span));
    }
}

/* BY SIR
    public static void main(String[] args) {
        int arr[] = {30, 35, 40, 39, 35, 38, 39, 50};
        int ans[] = new int[arr.length];
        Stack<Integer> st = new Stack<>();
                
        for (int i = 0; i < ans.length; i++) {            
            while (!st.isEmpty() && arr[st.peek()] <= arr[i]) {
                st.pop();
            }
            if (st.isEmpty()) {
                ans[i] = i + 1;
            } else {
                ans[i] = i - st.peek();
        }
    
        st.push(i);
        }

        System.out.println(Arrays.toString(ans));
    }
*/