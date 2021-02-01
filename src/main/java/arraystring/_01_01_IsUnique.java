package arraystring;

/**
 * Implement an algorithm to determine if a string has all unique characters.
 */

class _01_01_IsUnique {

    boolean isUnique(String str) {
        int[] chars = new int[256];
        for(char c : str.toCharArray()) {
            chars[c]++;
            if(chars[c]>1) return false;
        }
        return true;
    }

}
