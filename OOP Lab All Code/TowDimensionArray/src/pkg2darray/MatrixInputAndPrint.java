
package pkg2darray;

import java.util.Scanner;

public class MatrixInputAndPrint {
    
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.printf("Enter the Row size: ");       
        int row;
        row = input.nextInt();
        
        System.out.printf("Enter the Column size: ");
        int col;
        col=input.nextInt();
                
        int[][]array=new int[row][col];
        
        System.out.printf("Enter the 2D array value:\n\n");
        
        for (int i =0; i < row; i++) {
            
            for (int j = 0; j < col; j++) {
                
                System.out.printf("array[%d][%d]:",i,j);
                array[i][j]=input.nextInt();
            }
            
        }
        System.out.println();
           for (int i =0; i < row; i++) {
            
            for (int j = 0; j < col; j++) {
                
                System.out.printf(" %d ",array[i][j]);           
            }
               System.out.println();
            
        }
        
        System.out.println();
    }
    
    
    
    
    
}
