package pkg2darray;

import java.util.Scanner;

public class MatrixSum {

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
        int SumArray[][] = new int[row][col];

        System.out.printf("Enter the 1st array value:\n");

        for (int i = 0; i < row; i++) {

            for (int j = 0; j < col; j++) {

                System.out.printf("array[%d][%d]:", i, j);
                array[i][j] = input.nextInt();
            }

        }

        System.out.printf("\nEnter the 2nd array value:\n");
        for (int i = 0; i < row; i++) {

            for (int j = 0; j < col; j++) {

                System.out.printf("array1[%d][%d]:", i, j);
                array1[i][j] = input.nextInt();
            }

        }

        System.out.println();

        System.out.printf("Print 1st Matrix: \n");
        for (int i = 0; i < row; i++) {

            for (int j = 0; j < col; j++) {

                System.out.printf(" %d ", array[i][j]);

            }
            System.out.println();
        }

        System.out.println();

        System.out.printf("Print 2nd Matrix: \n");
        for (int i = 0; i < row; i++) {

            for (int j = 0; j < col; j++) {

                System.out.printf(" %d ", array1[i][j]);

            }
            System.out.println();
        }
        
        System.out.println();
        System.out.println();

        for (int i = 0; i < row; i++) {

            for (int j = 0; j < col; j++) {
                
                SumArray[i][j] = array[i][j]+array1[i][j];

                System.out.printf(" %d ", SumArray[i][j]);

            }
            System.out.println();
        }
        
        
        System.out.println();
    }

}
