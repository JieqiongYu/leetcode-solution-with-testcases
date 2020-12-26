package Array;

import java.util.ArrayList;
import java.util.Collections;

public class DiagonalTraverse {
    public int[] findDiagonalOrder(int[][] matrix) {
        // empty input scenario
        if (matrix == null || matrix.length == 0) {
            return new int[0];
        }

        // get the number of rows and columns of the matrix
        int row = matrix.length;
        int col = matrix[0].length;

        // initialize the result array
        int[] result = new int[row * col];
        int k = 0;

        // intermediate diagonal array -> has to be dynamic array
        ArrayList<Integer> diagonal = new ArrayList<>();

        // iterate all the starting points from first row and last column
        for (int entry = 0; entry < row + col - 1; entry++) {
            // clear diagonal array in each iteration
            diagonal.clear();

            // locate the element of each starting point
            int x = entry < col ? 0 : entry - col + 1;
            int y = entry < col ? entry : col - 1;

            // set the boundary
            while (x < row && y > -1) {
                diagonal.add(matrix[x][y]);
                x++;
                y--;
            }

            // reverse even numbered index diagonal array
            if (entry % 2 == 0) {
                Collections.reverse(diagonal);
            }

            for (Integer integer : diagonal) {
                result[k++] = integer;
            }
        }

        return result;
    }
}
