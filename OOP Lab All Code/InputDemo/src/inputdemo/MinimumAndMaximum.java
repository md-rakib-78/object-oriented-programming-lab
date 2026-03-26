
package inputdemo;

import java.util.Scanner;

public class MinimumAndMaximum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int a,b,c;

System.out.print("Enter the value for a: ");
a = input.nextInt();
        
System.out.print("Enter the value for b: ");
b = input.nextInt();

System.out.print("Enter the value for c: ");
c = input.nextInt();


if(a>b && a>c)
{
    System.out.println("Maximum number is: "+a);
}

else if(b>c)
{
     System.out.println("Maximum number is: "+b);
}
else
{
     System.out.println("Maximum number is: "+c);
}


    }
    
}
