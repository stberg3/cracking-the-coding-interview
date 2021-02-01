package arraystring;

import java.lang.StringBuilder;
import java.util.AbstractMap.SimpleEntry;
import java.util.*;

/**
 * Implement a method to perform basic string compression using the counts of repeated characters.
 * For example, the string aabcccccaaa would become a2blc5a3.
 * If the "compressed" string would not become smaller than the original string, your method should return
 * the original string. You can assume the string has only uppercase and lowercase letters (a - z).
 */
class _01_06_StringCompression {    
    Character prev = null;
    Deque<SimpleEntry<Character,Integer>> chars = new LinkedList<>();
    boolean same = true;

    String compress(String s) {
        for(char c : s.toCharArray()) {
            if(prev == null || c != prev) {
                chars.add(new SimpleEntry<Character, Integer>(c, 1));
            } else {
                SimpleEntry<Character,Integer> current = chars.getLast();
                current.setValue(current.getValue()+1);
                same = false;
            }
            prev = c;
        }
        
        if(same) return s;

        StringBuilder sb = new StringBuilder();
        while(!chars.isEmpty()) {
            SimpleEntry<Character, Integer> current = chars.poll();
            sb.append(current.getKey());
            sb.append(current.getValue());
        }

        return sb.toString();
    }
}
