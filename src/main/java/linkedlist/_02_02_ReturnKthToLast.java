package linkedlist;

/**
 * Implement an algorithm to find the kth to last element of a singly linked list
 */
class _02_02_ReturnKthToLast {

    LinkedListNode flipList(LinkedListNode head) {
        LinkedListNode probe = head;
        LinkedListNode last = null;

        do {
            LinkedListNode next = probe.next;
            probe.next = last;
            last = probe;
            probe = next;
        } while(probe.next != null);

        probe.next = last;

        return probe;
    }

    LinkedListNode kthToLast(LinkedListNode head, int k) {
        LinkedListNode last = flipList(head);
        
        for(int i=0; last != null && i < k; i++) {
            last = last.next;
        }

        return last;
    }
}
