package arraystring;

import arraystring._x_ArrayShift;

/**
 * Write a method to replace all spaces in a string with '%20'
 * You may assume that the string has sufficient space at the end to hold the additional characters,
 * and that you are given the "true" length of the string.
 * (Note: If implementing in Java,please use a character array so that you can perform this operation in place.)
 * <p>
 * EXAMPLE
 * Input:  "Mr John Smith    ", 13
 * Output: "Mr%20John%20Smith"
 */
class _01_03_URLify {

    char[] urlify(char[] chars, int trueLength) {
        int added = 0;
        
        for(int i=0; i<trueLength; i++) {
            if(chars[i] == ' ') {
                added+=2;
                if(added+trueLength>chars.length) {
                    throw new IllegalArgumentException("I em eh gawd");
                }
                _x_ArrayShift.shiftArray(chars, 2, i);
                chars[i++] = '%';
                chars[i++] = '2';
                chars[i++] = '0';
            }
        }

        return chars;
    }
}
