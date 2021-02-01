package arraystring;

import java.lang.Math;

/**
 * Given an image represented by an NxN matrix, where each pixel in the image is 4 bytes,
 * write a method to rotate the image by 90 degrees. Can you do this in place?
 */
class _01_07_RotateMatrix {

    private void swapQuartet(int[][] m, int r, int c) {
        int tmp_outer = m[r][c], _c = m.length - 1 - r, _r = c;
        
        for(int i=0; i<4; i++) {
            int tmp_inner = m[_r][_c]; 
            m[_r][_c] = tmp_outer;
            
            c = _c;
            r = _r;
            _c = m.length - 1 - r;
            _r = c;
            tmp_outer = tmp_inner;
        }
    }

    public int[][] rotateInPlace(int[][] m) {
        int limit = (int) Math.ceil(m.length / 2.0);
        int limitb = (int) Math.floor(m.length / 2.0);

        for(int i=0; i<limit; i++) {
            for(int j=0; j<limitb; j++) {
                swapQuartet(m, i, j);
            }
        }

        return m;
    }

    public int[][] rotateCopy(int[][] m) {
        int[][] res = new int[m.length][m.length];

        for (int _i = m.length-1; _i >= 0; _i--) {
            for (int _j = 0; _j < m.length; _j++) {
                int i = m.length - 1 - _i;
                int j = m.length - 1 - _j;
                res[j][_i] = m[i][j];
            }
        }

        return res;
    }

    int[][] rotate(int[][] m) {
        return rotateInPlace(m);
    }
}
