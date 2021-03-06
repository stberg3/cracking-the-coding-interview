package arraystring;

import java.util.HashSet;
import java.util.Set;

/**
 * Given a string, write a function to check if it is a permutation of a palindrome.
 * A palindrome is a word or phrase that is the same forwards and backwards.
 * A permutation is a rearrangement of letters.
 * The palindrome does not need to be limited to just dictionary words.
 * <p>
 * EXAMPLE
 * Input: Tact Coa
 * Output: True (permutations: "taco cat", "atco cta", etc.)
 */
class _01_04_PalindromePermutation {
    boolean check(String s) {
        Set<Character> set = new HashSet<>();
        for (char c : s.toCharArray()) {
            if (c == ' ') continue;
            if (set.contains(c)) set.remove(c);
            else set.add(c);
        }
        return set.size() < 2;
    }
}
