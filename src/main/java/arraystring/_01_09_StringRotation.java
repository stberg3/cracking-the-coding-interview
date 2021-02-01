package arraystring;

import java.util.*;

/**
 * Assume you have a method isSubstring which checks if one word is a substring of another.
 * Given two strings, sl and s2, write code to check if s2 is a rotation of s1
 * using only one call to isSubstring (e.g.,"waterbottle" is a rotation of"erbottlewat").
 */
class _01_09_StringRotation {
    boolean rotated(String original, String result) {
        if(original.equals("")) return result.equals("");
        else if (original.length() != result.length()) return false;

        Queue<Character> origDeque =  new LinkedList<Character>();

        for(char c : original.toCharArray()) {
            origDeque.add(c);
        }

        for(char c : result.toCharArray()) {
            if(result.charAt(0) == origDeque.peek()) {
                int idx = 0;
                for(char cc : origDeque) {
                    if(cc != result.charAt(idx)) break;
                    idx++;
                }
                if(idx == origDeque.size()) {
                    return true;
                }
            }

            origDeque.add(origDeque.poll());
        }

        return false;
    }

}
