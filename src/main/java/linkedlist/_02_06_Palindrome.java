package linkedlist;

/**
 * Palindrome: Implement a function to check if a linked list is a palindrome.
 */
class _02_06_Palindrome {

    boolean isPalindrome(LinkedListNode head) {
        StringBuilder sb = new StringBuilder();
        LinkedListNode probe = head;

        while(probe != null) {
            sb.append(Integer.toString(probe.val));
            probe = probe.next;
        }

        return sb.toString().equals(sb.reverse().toString());
    }


}
