
public class ZeroMatrix {


    static void zeroMatrix(int[][] mat, int m, int n) {
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (mat[i][j] == 0) {
                    // set rows to -1
                    for (int x = 0; x < n; x++) {
                        mat[i][x] = - 1;
                    }
                    // set cols to -1
                    for (int x = 0; x < m; x++) {
                        mat[x][j] = - 1;
                    }
                }
            }
        }
        zeroOut(mat, m, n);
        printMatrix(mat, m, n);
    }

    private static void zeroOut(int[][] mat, int m, int n) {
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (mat[i][j] == - 1) {
                    mat[i][j] = 0;
                }
            }
        }
    }

    private static void printMatrix(int[][] mat, int m , int n) {
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(mat[i][j] + " ");
            }
            System.out.println();
        }
    }
}
