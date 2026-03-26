package pkg2darray;

import java.util.Scanner;

public class MatrixMultipication {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int row1, col1, row2, col2;
        System.out.printf("Enter the 1st matrix row and column size: ");
        row1 = input.nextInt();
        col1 = input.nextInt();
        System.out.printf("Enter the 2nd matrix row column size: ");
        row2 = input.nextInt();
        col2 = input.nextInt();

        System.out.println();
        while (row1 != col2) {
            System.out.printf("Enter the 1st matrix row and column size: ");
            row1 = input.nextInt();
            col1 = input.nextInt();
            System.out.printf("Enter the 2nd matrix row column size: ");
            row2 = input.nextInt();
            col2 = input.nextInt();
        }
        System.out.println();

        //matrix declar
        int mat1[][] = new int[row1][col1];
        int mat2[][] = new int[row2][col2];

        //1st matrix Input
        System.out.printf("Enter the First matrix Element:\n");
        for (int i = 0; i < row1; i++) {
            for (int j = 0; j < col1; j++) {
                System.out.printf("Mat1[%d][%d]: ", row1, col1);
                mat1[i][j] = input.nextInt();
            }
        }

        System.out.println();
        System.out.println();

        //2nd matrix Input
        System.out.printf("Enter the First matrix Element:\n");
        for (int i = 0; i < row2; i++) {
            for (int j = 0; j < col2; j++) {
                System.out.printf("Mat2[%d][%d]: ", row2, col2);
                mat2[i][j] = input.nextInt();
            }
        }

        System.out.println();
        System.out.println();
        int multi[][] = new int[row1][col2];

        int pro, sum = 0;
        for (int i = 0; i < row1; i++) {
            for (int j = 0; j < col2; j++) {
                for (int k = 0; k < row2; k++) {

                    pro = mat1[i][k] * mat2[k][j];
                    sum += pro;
                }
                multi[i][j] = sum;
                sum = 0;

            }

        }

        System.out.println();
        System.out.println();

        for (int i = 0; i < row1; i++) {
            for (int j = 0; j < col2; j++) {

                System.out.printf(" %d ", multi[i][j]);

            }
            System.out.println();

        }

    }
}
