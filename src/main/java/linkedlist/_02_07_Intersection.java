package linkedlist;

import java.util.HashSet;
import java.util.Set;

/**
 * Intersection: Given two (singly) linked lists, determine if the two lists intersect.
 * Return the intersecting node. Note that the intersection is de ned based on reference, not value.
 * That is, if the kth node of the first linked list is the exact same node (by reference)
 * as the jth node of the second linked list, then they are intersecting.
 */
class _02_07_Intersection {

    boolean intersects(LinkedListNode l1, LinkedListNode l2) {

        LinkedListNode probe1 = l1;
        
        while(probe1 != null) {
            probe1 = probe1.next;
            LinkedListNode probe2 = l2;
            while (probe2 != null) {
                if(probe1 == probe2) return true;
                probe2 = probe2.next;
                
            }
        }

        return false;
    }
}
