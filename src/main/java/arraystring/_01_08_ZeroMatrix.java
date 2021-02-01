package arraystring;

import java.util.*;

/**
 * Write an algorithm such that if an element in an MxN matrix is 0, its entire row and column are set to 0.
 */
class _01_08_ZeroMatrix {
    private List<Integer> findZero(int[][] m) {
        for(int i=0; i<m.length; i++) {
            for(int j=0; j<m[0].length; j++) {
                if(m[i][j] == 0) {
                    return Arrays.asList(i, j);
                }
            }
        }

        return new ArrayList<Integer>();
    }

    int[][] zero(int[][] matrix) {
        List<Integer> ij = findZero(matrix);

        if(ij.isEmpty()) return matrix;

        int row = ij.get(0), col = ij.get(1);

        for(int i=0; i<matrix.length; i++) {
            matrix[i][col] = 0;
        }

        for(int j=0; j<matrix[0].length; j++) {
            matrix[row][j] = 0;
        }

        return matrix;
    }
}
