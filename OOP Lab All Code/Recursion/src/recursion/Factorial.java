package recursion;

import java.util.Scanner;

class recursion {

    int fact = 1;

    public int factorial(int n,int n2) {

        if (n<n2) {
              
          
            
        } else {
            fact = fact * n;
            factorial(n - 1,n2);

        }
    
return fact;
    }

}

public class Factorial {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int num;
        int num2=1;
        System.out.print("Enter the Number= ");
        num = input.nextInt();
        System.out.println();

        recursion obj1 = new recursion();

       int fact= obj1.factorial(num,num2);
        
         System.out.println("Factorial is = " + fact);

     

    }

}
