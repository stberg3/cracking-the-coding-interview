package arraystring;

/**
 * There are three types of edits that can be performed on strings:
 * insert a character, remove a character, or replace a character.
 * Given two strings, write a function to check if they are one edit (or zero edits) away.
 * <p>
 * EXAMPLE
 * pale, ple -> true
 * pales, pale -> true
 * pale, bale -> true
 * pale, bake -> false
 */
class _01_05_OneAway {

    int countAdd(String longer, String shorter) {
        int fast=0, slow=0;
        int diffs = 0;

        while(fast<longer.length() && slow<shorter.length()) {
            if(longer.charAt(fast) != shorter.charAt(slow)) {
                diffs++;
            } else {
                slow++;
            }
            fast++;
        }

        return diffs;
    }

    int countReplace(String a, String b) {
        int diffs = 0;
        for(int i=0; i<a.length(); i++) {
            if(a.charAt(i) != b.charAt(i)) diffs++;
        }

        return diffs;
    }

    boolean isOneAway(String a, String b) {
        if(Math.abs(a.length()-b.length()) > 1) return false;

        switch(a.length()-b.length()) {
            case 1:
                return countAdd(a, b) < 2;
            case -1:
                return countAdd(b, a) < 2;
            case 0:
                return countReplace(a, b) < 2;
            default:
                return false;
        }
    }
}
