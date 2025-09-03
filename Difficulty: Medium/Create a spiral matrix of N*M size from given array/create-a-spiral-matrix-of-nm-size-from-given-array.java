// User function Template for Java
class Solution {
    public int[][] spiralFill(int n, int m, int[] arr) {
        int[][] matrix = new int[n][m];
        int top = 0, bottom = n - 1;
        int left = 0, right = m - 1;
        int index = 0;  // To track position in arr

        while (top <= bottom && left <= right) {
            // Fill top row from left to right
            for (int i = left; i <= right; i++) {
                matrix[top][i] = arr[index++];
            }
            top++;

            // Fill right column from top to bottom
            for (int i = top; i <= bottom; i++) {
                matrix[i][right] = arr[index++];
            }
            right--;

            // Fill bottom row from right to left if still valid
            if (top <= bottom) {
                for (int i = right; i >= left; i--) {
                    matrix[bottom][i] = arr[index++];
                }
                bottom--;
            }

            // Fill left column from bottom to top if still valid
            if (left <= right) {
                for (int i = bottom; i >= top; i--) {
                    matrix[i][left] = arr[index++];
                }
                left++;
            }
        }

        return matrix;
    }
}
