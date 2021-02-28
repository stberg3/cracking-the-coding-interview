package stackqueue;

import java.util.EmptyStackException;

/**
 * How would you design a stack which, in addition to push and pop, has a
 * function min which returns the minimum element? Push, pop and min should all
 * operate in 0(1) time.
 */
class _03_02_MinStack {
    private StackNode head;

    void push(int val) {
        head = new StackNode(val, head);
    }

    int pop() {
        if(head == null) throw new EmptyStackException();

        int val = head.val;
        head = head.next;
        return val;
    }

    int min() {
        return head.minVal;
    }
}
