
package inputdemo;

import java.util.Scanner;

public class Input {
    
    public static void main(String[] args) {
        
        Scanner input1 = new Scanner(System.in);
        
        int num;
        float num1,sum;
     
        System.out.print("Enter the 1st number: ");

        num = input1.nextInt();
        
        System.out.print("\nEnter the 2nd number: ");
        num1 = input1.nextFloat();
        
        sum = num + num1;
        
        System.out.printf("\nTOTAL NUMBER : %.2f\n",sum);
    }
    
}
