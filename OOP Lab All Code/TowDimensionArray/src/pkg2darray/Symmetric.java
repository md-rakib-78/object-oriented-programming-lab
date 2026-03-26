package pkg2darray;

import java.util.Scanner;

public class Symmetric {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.printf("Enter the Row size: ");
        int row;
        row = input.nextInt();

        System.out.printf("Enter the Column size: ");
        int col;
        col = input.nextInt();

        int[][] array = new int[row][col];
        int[][] array1 = new int[row][col];

        System.out.printf("Enter the 1st array value:\n");

        for (int i = 0; i < row; i++) {

            for (int j = 0; j < col; j++) {

                System.out.printf("array[%d][%d]:", i, j);
                array[i][j] = input.nextInt();
            }

        }

        System.out.println();
        System.out.println();

        for (int i = 0; i < row; i++) {

            for (int j = 0; j < col; j++) {

                array1[j][i] = array[i][j];

            }
        }

        ///Print matrix;
        for (int i = 0; i < row; i++) {

            for (int j = 0; j < col; j++) {

                System.out.printf(" %d ", array[i][j]);

            }
            System.out.println();

        }

        System.out.println();
        System.out.println();

        /// print convert matrix
        for (int i = 0; i < row; i++) {

            for (int j = 0; j < col; j++) {

                System.out.printf(" %d ", array1[i][j]);

            }
            System.out.println();

        }

        System.out.println();
        System.out.println();

        int f = 0;

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {

                if (array[i][j] != array1[i][j]) {
                    f++;
                }

            }

        }

        if (f == 0) {

            System.out.printf("\nThis matrix is symmetric!\n");

        } else {
            System.out.printf("\nThis matrix is not symmetrix!\n");
        }

        System.out.println();
    }

}
