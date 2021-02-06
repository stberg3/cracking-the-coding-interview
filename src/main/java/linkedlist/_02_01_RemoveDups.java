package linkedlist;

import java.util.*;

/**
 * Remove Dups!
 * Write code to remove duplicates from an unsorted linked list.
 */
class _02_01_RemoveDups {

    LinkedListNode removeDups(LinkedListNode head) {
        Set<Integer> seen = new HashSet<Integer>();
        LinkedListNode slow = new LinkedListNode(-1);
        LinkedListNode fast = head;

        while(fast != null) {
            if(!seen.contains(fast.val)) {
                slow.next = fast;
                slow = slow.next;
                seen.add(slow.val);
            } 
            fast = fast.next;
        }

        return head;
    }
}
