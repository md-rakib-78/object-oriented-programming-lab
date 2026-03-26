
package inputdemo;
import java.util.Scanner;
public class ArrayMaximumAndMinimum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int[] array = new int [10];
        
        
        
        System.out.println("Enter the array value: ");
        
        for (int i = 0; i < array.length; i++) {
            
            System.out.printf("a[%d]: ",i);
            array[i] = input.nextInt();
            
        }
        
        int mini = array[0];
        for (int i = 0; i < array.length; i++) {
            
            if(array[i]<mini)
            {
                mini = array[i];
            }
            
        }
        
        System.out.println("Maximum value in the array: "+mini);
   
    }
   
    }