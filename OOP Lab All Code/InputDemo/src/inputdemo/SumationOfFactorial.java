
package inputdemo;
import java.util.Scanner;
public class SumationOfFactorial {
    public static void main(String[] args){
        
        Scanner input = new Scanner(System.in);
        
        double num,sum=0;
        System.out.print("Enter the num: ");
        num = input.nextDouble();
        
       for(double i=1;i<=num;i++)
       {
           
           double fact=1;
           for(double j=1;j<=i*2-1;j++)
           {
               fact=fact*j;
           }
           
           sum = sum + i/fact;
           
       }
       
       System.out.println("SUMMATIO : "+sum);
        
        
    }
}
