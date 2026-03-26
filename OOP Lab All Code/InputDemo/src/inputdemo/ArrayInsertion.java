
package inputdemo;

import java.util.Scanner;
public class ArrayInsertion {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter the array size");
        int size=10;
        
        
        int[] array = new int[size+1];
        
        System.out.println("Enter the array value: ");
        
        for (int i = 0; i < size; i++) {
            
            System.out.printf("a[%d]: ",i);
            array[i]=input.nextInt();
        }
        
        int num=100;
        

            for (int j = size; j >= 3; j--) 
            {
               array[j] = array[j-1];
            }
            
            array[3] = num;
            
            
            for (int i = 0; i <= size; i++)
            {
                System.out.print(" "+array[i]);
        }
                       
        }    
        
    }

