
package inputdemo;

import java.util.Scanner;

public class CelsiusToFarhenheit {
    
    public static void main(String[] args){
        
        Scanner input = new Scanner(System.in);
        
        double f,c;
        
        System.out.print("Enter the celsisu: ");
        c = input.nextDouble();
        
        f = 1.8*c+32;
        
        System.out.printf("Farhanhite: %.2f\n",f);
        
        
    }
}
