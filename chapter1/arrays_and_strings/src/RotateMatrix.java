public class RotateMatrix {
    static void rotateMatrix(int[][] m, int n) {
        for (int i = 0; i < n/2; i++) {
            for (int j = i; j < n-i-1; j++) {
                int temp = m[i][j];
                // set top left = bottom left
                m[i][j] = m[n-1-j][i];
                // set bottom left = bottom right
                m[n-1-j][i] = m[n-1-i][n-1-j];
                // set bottom right = top right
                m[n-1-i][n-1-j] = m[j][n-1-i];
                // set top right = temp
                m[j][n-1-i] = temp;
            }
        }
        printMatrix(m,n);
    }
    private static void printMatrix(int[][] m, int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(m[i][j] + " ");
            }
            System.out.println();
        }
    }
}
