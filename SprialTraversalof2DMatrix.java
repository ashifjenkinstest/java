package logics;

import java.util.ArrayList;

public class SprialTraversalof2DMatrix {

    public static void main(String arfsp[]) {

        int r = 3, c = 4;
        /*
        int matrix[][] = {{1, 2, 3, 4},
            {5, 6, 7, 8},
            {9, 10, 11, 12},
            {13,14,15,16}};


         */
        int matrix[][] = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9},
            {10,11,12}
        };
        System.out.println(spirallyTraverse(matrix, matrix.length, matrix[0].length));

    }

    //Function to return a list of integers denoting spiral traversal of matrix.
    static ArrayList<Integer> spirallyTraverse(int matrix[][], int r, int c) {
        ArrayList<Integer> integers = new ArrayList<>();
        // code here
        /*
            0        3
            L        R
        0 T 00 01 02 03
            10 11 12 13
            20 21 22 23
        3 B 30 31 32 33
        */

        int left = 0;
        int right = c - 1; //last column
        int top = 0;
        int bottom = r - 1; //last row

        while (left <= right && top <= bottom) {



            for (int i = left; i <= right; i++)
                integers.add(matrix[top][i]);
            top++;

            for (int i = top; i <= bottom; i++)
                integers.add(matrix[i][right]);
            right--;
            if(top<=bottom)
            for (int i = right; i >= left; i--)
                integers.add(matrix[bottom][i]);
            bottom--;
            if(left<=right)
            for (int i = bottom; i >= top; i--)
                integers.add(matrix[i][left]);
            left++;

        }


        return integers;

    }
}
