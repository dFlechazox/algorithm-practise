package datas.exercise;

public class SetMatrixZeros73 {
    public void setZeroes(int[][] matrix) {                //使用标记数组
        int m = matrix.length;
        int n = matrix[0].length;
        boolean[] row = new boolean[m];
        boolean[] column = new boolean[n];
        for (int i = 0;i < m; i++){
            for (int j = 0;j < n;j++){
                if (matrix[i][j] == 0){
                    row[i] = column[j] = true;
                }
            }
        }
        for (int i = 0;i < m;i++){
            for (int j = 0;j < n;j++){
                if (row[i] || column[j]){
                    matrix[i][j] = 0;
                }
            }
        }
    }

    public void setZeroes1(int[][] matrix) {                //使用两个标记标记变量（第一行和第一列）  可以优化为使用一个标记
        int m = matrix.length;
        int n = matrix[0].length;
        boolean rowflag = false;
        boolean colflag = false;
        for (int i = 0; i < m; i++){                          //第一列是否有0
            if (matrix[i][0] == 0){
                rowflag = true;
            }
        }
        for (int j = 0; j < n; j++){                         //第一行是否有0
            if (matrix[0][j] == 0){
                colflag = true;
            }
        }
        for (int i = 0; i < m; i++){                         //对于0元素，使用其对应的第一行和第一列的元素作为标记
            for (int j = 0; j < n; j++){
                if (matrix[i][j] == 0){
                    matrix[i][0] = matrix[0][j] = 0;
                }
            }
        }
        for (int i = 0; i < m; i++){                         //0元素所在的行和列置0
            for (int j = 0; j < n; j++){
                if (matrix[i][0] == 0 || matrix[0][j] == 0){
                    matrix[i][j] = 0;
                }
            }
        }
        if (rowflag){                                        //第一行或列有0，将第一行或列置0
            for (int i = 0; i < m; i++){
                matrix[i][0] = 0;
            }
        }
        if (colflag){
            for (int j = 0; j < n; j++){
                matrix[0][j] = 0;
            }
        }
    }
}
