
package inputdemo;

import java.util.Scanner;
public class PrimeNumber {
    public static void main(String[] args){
        
        Scanner input = new Scanner(System.in);
        
        int num;
        
        System.out.print("Enter the Number: ");
        num = input.nextInt();
        
        int i,count=0;
        
        for(i=2;i<num;i++)
        {
            if(num%i==0)
            {
                count++;
            }
        }
        
        if(count==0)
        {
            System.out.println("This number is prime number!");
        }
        else
        {
            System.out.println("This number is not prime value!");
        }
        
    }
    
}
