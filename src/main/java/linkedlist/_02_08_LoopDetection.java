package linkedlist;

import java.util.Set;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.HashSet;

/**
 * Loop Detection: Given a circular linked list, implement an algorithm that returns the node at the
 * beginning of the loop.
 * <p>
 * DEFINITION
 * Circular linked list: A (corrupt) linked list in which a node's next pointer points to 
 * an earlier node, so as to make a loop in the linked list.
 * <p>
 * EXAMPLE
 * Input: A -> B -> C -> D -> E -> C[the same C as earlier]
 * Output: C
 */
class _02_08_LoopDetection {


    private class Reference {
        public LinkedListNode l;

        public Reference(LinkedListNode l) {
            this.l = l;
        }

        public boolean equals(Object other) {
            return System.identityHashCode(l) ==  System.identityHashCode(l);
        }

        public String toString() {
            return Integer.toString(l.val);
        }
    }


    private LinkedListNode nullImpl(LinkedListNode head) { 
        LinkedListNode last = null;
        LinkedListNode probe = head;
    
        while(probe != null) {
            last = probe;
            probe = probe.next;
            last.next = null;
        }

        return last;
    }

    private LinkedListNode refImpl(LinkedListNode head) {
        Set<Integer> seen = new HashSet<Integer>();

        LinkedListNode probe = head;

        while (probe != null) {
            if(seen.contains(probe.val)) return probe;
            seen.add(probe.val);
            probe = probe.next;
        }

        return null;
    }

    LinkedListNode detect(LinkedListNode head) {
        // return nullImpl(head);
        return refImpl(head);
    }
}
