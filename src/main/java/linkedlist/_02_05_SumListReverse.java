package linkedlist;

import java.util.Stack;
import java.util.Queue;
import java.util.LinkedList;
/**
 * Sum Lists: You have two numbers represented by a linked list,
 * where each node contains a single digit.
 * The digits are stored in reverse order, such that the 1 's digit is at the head of the list.
 * Write a function that adds the two numbers and returns the sum as a linked list.
 * <p>
 * EXAMPLE
 * Input:(7-> 1 -> 6) + (5 -> 9 -> 2).That is,617 + 295.
 * Output:2 -> 1 -> 9.That is,912.
 */
class _02_05_SumListReverse {
    private int getInt(LinkedListNode head) {
        StringBuilder numString = new StringBuilder();

        while (head != null) {
            numString.append(String.valueOf(head.val));
            head = head.next;
        }

        String s = numString.reverse().toString();
        int res = Integer.parseInt(s);

        return res;
    }

    private LinkedListNode getLinkedListNode(int num) {
        String numString = String.valueOf(num);
        Stack<LinkedListNode> nodes = new Stack<LinkedListNode>();

        for (char c : numString.toCharArray()) {
            nodes.push(new LinkedListNode(c - '0'));
        }
        LinkedListNode head = new LinkedListNode(-1);
        LinkedListNode probe = nodes.pop();
        head.next = probe;

        while (!nodes.isEmpty()) {
            probe.next = nodes.peek();
            probe = nodes.pop();
        }

        return head.next;
    }

    LinkedListNode sum(LinkedListNode l1, LinkedListNode l2) {
        if (l1 == null)
            return l2;
        else
            return getLinkedListNode(getInt(l1) + getInt(l2));
    }
}
