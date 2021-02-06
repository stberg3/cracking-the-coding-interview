package arraystring;

import org.junit.Test;
import java.util.Arrays;

import static org.junit.Assert.assertTrue;

public class _x_ArrayShiftTest {

    private _x_ArrayShift s = new _x_ArrayShift();

    @Test
    public void test1() {
        int[] input = {1,2,3,4,5,0,0,0};
        int[] expected = { 0, 1, 2, 3, 4, 5, 0, 0};
        int[] actual = s.shiftArray(input, 1);

        assertTrue(Arrays.toString(actual), Arrays.equals(expected, actual));
    }


    @Test
    public void test2() {
        int[] input = { 1, 2, 3, 4, 5, 0, 0, 0 };
        int[] expected = { 0,0,0, 1, 2, 3, 4, 5};
        int[] actual = s.shiftArray(input, 3);

        assertTrue(Arrays.toString(actual), Arrays.equals(expected, actual));
    }

    @Test
    public void test3() {
        int[] input = { 1, 2, 3, 4, 5, 0, 0, 0 };
        int[] expected = { 5, 0, 0, 0, 1, 2, 3, 4 };
        int[] actual = s.shiftArray(input, 4);

        assertTrue(Arrays.toString(actual), Arrays.equals(expected, actual));
    }
}