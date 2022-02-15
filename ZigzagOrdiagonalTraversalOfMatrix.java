package logics;

import java.util.Arrays;

public class ZigzagOrdiagonalTraversalOfMatrix {

    public static void main(String sfsdap[]) {

        int matrix1[][] = new int[5][5];

        int matrix[][] = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };
        logic(matrix);

    }

    public static void logic(int[][] matrix) {

        int[] newarr = new int[matrix.length * matrix[0].length];
        int r = matrix.length, c = matrix[0].length;
        int row = 0, col = 0, i = 0;
        boolean up = true;

        while (row < r && col < c) {
            if (up) {
                while (row > 0 && col < c - 1) {
                    newarr[i++] = matrix[row][col];
                    //System.out.println(matrix[row][col]);
                    row--;
                    col++;
                }
                newarr[i++] = matrix[row][col];
                //System.out.println(matrix[row][col]);
                if (col == c-1) {//last column is hit
                    row++;
                }
                else{
                    col++;
                }

            }else{
                while(col>0 && row<r-1){
                    newarr[i++] = matrix[row][col];
                    //System.out.println(matrix[row][col]);
                    row++;
                    col--;
                }
                newarr[i++] = matrix[row][col];
                //System.out.println(matrix[row][col]);

                if(row == r-1){//if last row is hit
                    col++;
                }
                else{//if first column is hit
                    row++;
                }

            }
            up = !up;
        }

        Arrays.stream(newarr).mapToObj(e->String.valueOf(e)).map(e->e.concat(" ")).forEach(System.out::print);

    }
}
