package linkedlist;

import java.util.Queue;
import java.util.LinkedList;
import java.lang.StringBuilder;

/**
 * Sum Lists: You have two numbers represented by a linked list,
 * where each node contains a single digit.
 * The digits are stored in normal order, such that the 1 's digit is at the tail of the list.
 * Write a function that adds the two numbers and returns the sum as a linked list.
 * <p>
 * EXAMPLE
 * Input:(7-> 1 -> 6) + (5 -> 9 -> 2).That is, 716 + 592.
 * Output:1 -> 4 -> 0 -> 8.That is, 1408.
 */
class _02_05_SumList {

    private int getInt(LinkedListNode head) {
        StringBuilder numString = new StringBuilder();
        
        while(head != null) {
            numString.append(String.valueOf(head.val));
            head = head.next;
        }

        String s = numString.toString();
        int res = Integer.parseInt(s);

        return res;
    }

    private LinkedListNode getLinkedListNode(int num) {
        String numString = String.valueOf(num);
        Queue<LinkedListNode> nodes = new LinkedList<LinkedListNode>();

        for(char c : numString.toCharArray()) {
            nodes.add(new LinkedListNode(c - '0'));
        }
        LinkedListNode head = new LinkedListNode(-1);
        LinkedListNode probe = nodes.poll();
        head.next = probe;

        while(!nodes.isEmpty()) {
            probe.next = nodes.peek();
            probe = nodes.poll();
        }

        return head.next;
    }

    LinkedListNode sum(LinkedListNode l1, LinkedListNode l2) {
        if(l1 == null) return l2;
        else return getLinkedListNode(getInt(l1) + getInt(l2));
    }

}
