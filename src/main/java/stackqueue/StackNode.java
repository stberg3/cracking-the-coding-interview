public class StackNode {
    public int val;
    public StackNode next;
    public int minVal;

    public StackNode(int val, StackNode next) {
        this.val = val;
        this.next = next;
        this.minVal = next == null || this.val < next.minVal ? val : next.minVal;
    }
}