package _03_stackProblem;

import java.util.Arrays;
import java.util.Stack;

/*
    ✨ Mnemonic for revision:
    NGE = Track indices → Compare with current → Assign next greater → Remaining = -1
*/
public class _02_NextGreaterElement {

    public static void main(String[] args) {
        int arr[] = { 5, 2, 6, 9, 1000, 99, 4, 101, 3, 7 };
        int nxtGreater[] = new int[arr.length]; // answer array

        Stack<Integer> idxStack = new Stack<>(); // stack में indices store करेंगे

        for (int currIdx = 0; currIdx < arr.length; currIdx++) {

            int currVal = arr[currIdx]; // current element

            // जब तक stack खाली नहीं है और currentValue > inputArr[topIndex]
            while (!idxStack.isEmpty() && arr[idxStack.peek()] < currVal) {
                int topIdx = idxStack.pop(); // index निकालो
                nxtGreater[topIdx] = currVal; // उस index का next greater मिला
            }

            // currentIndex को stack में डाल दो
            idxStack.push(currIdx);
        }

        // जिनके लिए next greater नहीं मिला → -1 assign कर दो
        while (!idxStack.isEmpty()) {
            int remainIdx = idxStack.pop();
            nxtGreater[remainIdx] = -1;
        }

        System.out.println(Arrays.toString(nxtGreater));
    }
}
