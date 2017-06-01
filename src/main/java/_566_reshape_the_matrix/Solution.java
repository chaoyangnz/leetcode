
package _566_reshape_the_matrix;

/**
 * https://leetcode.com/problems/reshape-the-matrix
 */
public class Solution {
    public int[][] matrixReshape(int[][] nums, int r, int c) {
        int row = nums.length, col = nums[0].length;
        if(r * c != row * col) return nums;

        int[][] rnums = new int[r][c];
        for(int i=0; i < row; ++i) {
            for(int j=0; j < col; ++j) {
                int index = i*col + j;
                rnums[index/c][index%c] = nums[i][j];
            }
        }
        return rnums;
    }
}

