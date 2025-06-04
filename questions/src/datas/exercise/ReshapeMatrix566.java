package datas.exercise;

public class ReshapeMatrix566 {
    public int[][] matrixReshape(int[][] mat, int r, int c){                      //先转化为一维数组，然后填入到数组中
        int[][] ans = new int[r][c];
        int m = mat.length;
        int n = mat[0].length;
        int[] array = new int[m*n];
        int a = 0;
        int b = 0;
        for (int i = 0;i < m;i++){
            for (int j = 0;j < n;j++){
                int cur = mat[m][n];
                array[a++] = cur;
            }
        }
        if (m*n == r*c){
            for (int i = 0;i < r;i++) {
                for (int j = 0; j < c; j++) {
                    ans[i][j] = array[a++];
                }
            }
            return ans;
        }
        return mat;
    }

    public int[][] matrixReshape1(int[][] mat, int r, int c){                       //直接映射下标
        int[][] ans = new int[r][c];
        int m = mat.length;
        int n = mat[0].length;
        if (r*c != m*n){
            return mat;
        }
        for (int i = 0;i < m*n; i++){
            ans[i/c][i%c] = mat[i/n][i%n];
        }
        return mat;
    }
}
