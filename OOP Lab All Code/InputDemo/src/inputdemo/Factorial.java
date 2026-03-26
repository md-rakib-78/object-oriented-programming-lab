
package inputdemo;

import java.util.Scanner;
public class Factorial {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        int num,fact=1;
        
        System.out.print("Enter the number: ");
        num = input.nextInt();
        
        for(int i=1;i<=num;i++)
        {
            fact = fact*i;
        }
        
        System.out.println("Factoril : "+fact);
        
    }
    
    
}
