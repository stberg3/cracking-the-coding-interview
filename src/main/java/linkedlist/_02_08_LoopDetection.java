package linkedlist;

import java.util.Set;
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
    }

    LinkedListNode detect(LinkedListNode head) {
        Set<Reference> seen = new HashSet<Reference>();

        LinkedListNode probe = head;

        while(probe != null) {
            Reference ref = new Reference(probe);
            if(seen.contains(ref)) return ref.l;

            seen.add(ref);
            probe = probe.next;
        }

        return null;
    }
}
