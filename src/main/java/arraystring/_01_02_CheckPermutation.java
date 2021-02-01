package arraystring;

/**
 * Given two strings,write a method to decide if one is a permutation of the other.
 */
class _01_02_CheckPermutation {
    boolean check(String a, String b) {
        int[] charsA = new int[256];
        int[] charsB = new int[256];
        
        for (char c : a.toCharArray()) {
            charsA[c]++;
        }
        
        for(char c : b.toCharArray()) {
            charsB[c]++;
        }
        
        for(int i=0; i<256; i++) {
            if(charsA[i] != charsB[i]) return false;
        }

        return true;
    }
}
