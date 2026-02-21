package _06_LinkedList;

import java.util.List;

/**
 * Definition for singly-linked list.
 */
public class ListNode {
    int val;
    ListNode next;

    ListNode() {
    }

    ListNode(int val) {
        this.val = val;
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}
 
public class LLreverse {

    public ListNode reverseList(ListNode head) {

        ListNode prevIdx = null;
        ListNode currIdx = head;
        ListNode nextIdx = null;

        while (currIdx != null) {
            nextIdx = currIdx.next;

            currIdx.next = prevIdx;

            prevIdx = currIdx;
            currIdx = nextIdx;
        }

        head = prevIdx;
        return head;
    }

}
