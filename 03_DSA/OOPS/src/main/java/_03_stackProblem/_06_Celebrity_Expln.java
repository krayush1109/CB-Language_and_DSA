package _03_stackProblem;

import java.util.Stack;

public class _06_Celebrity_Expln {
    public static void main(String[] args) {

        int mat[][] = { { 0, 0, 1, 0 },
                { 0, 0, 1, 0 },
                { 0, 0, 0, 0 },
                { 0, 0, 1, 0 } };

        celebrity(mat);
    }
    
    public static int celebrity(int[][] mat) {
        Stack<Integer> idxStack = new Stack<>();

        // Step 1: Push all people into stack
        for (int currIdx = 0; currIdx < mat.length; currIdx++) {
            idxStack.push(currIdx);
        }

        // Step 2: Find candidate
        while (idxStack.size() > 1) {
            int personA = idxStack.pop();
            int personB = idxStack.pop();

            if (doesKnow(mat, personA, personB)) {
                // A knows B → A cannot be celebrity
                idxStack.push(personB);
            } else {
                // A does not know B → B cannot be celebrity
                idxStack.push(personA);
            }
        }

        // Candidate left
        int candidate = idxStack.pop();

        // Step 3: Verify candidate
        for (int other = 0; other < mat.length; other++) {
            if (other == candidate)
                continue;

            // Candidate should not know anyone
            if (doesKnow(mat, candidate, other))
                return -1;

            // Everyone should know candidate
            if (!doesKnow(mat, other, candidate))
                return -1;
        }

        return candidate;
    }


    // Function to check if person a knows person b
    public static boolean doesKnow(int[][] mat, int p1, int p2) {
        return mat[p1][p2] == 1;
    }

}
