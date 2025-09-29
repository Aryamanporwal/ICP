package Assignment_3;

import java.util.ArrayList;
import java.util.List;

public class spiral_matrix_1 {
        class Solution {
            public List<Integer> spiralOrder(int[][] matrix) {
                List<Integer> arr = new ArrayList<>();
                int minc = 0, minr = 0;
                int maxc = matrix[0].length - 1;
                int maxr = matrix.length - 1;
                int t = matrix.length * matrix[0].length;

                while (t > 0) {
                    // left to right
                    for (int i = minc; i <= maxc && t > 0; i++) {
                        arr.add(matrix[minr][i]);
                        t--;
                    }
                    minr++;

                    // top to bottom
                    for (int i = minr; i <= maxr && t > 0; i++) {
                        arr.add(matrix[i][maxc]);
                        t--;
                    }
                    maxc--;

                    // right to left
                    for (int i = maxc; i >= minc && t > 0; i--) {
                        arr.add(matrix[maxr][i]);
                        t--;
                    }
                    maxr--;

                    // bottom to top
                    for (int i = maxr; i >= minr && t > 0; i--) {
                        arr.add(matrix[i][minc]);
                        t--;
                    }
                    minc++;
                }
                return arr;
            }
        }

}
