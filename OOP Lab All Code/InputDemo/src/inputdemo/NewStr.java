
package inputdemo;

import java.util.Scanner;

public class NewStr {
    
    public static void main(String[] args){
        
        Scanner input = new Scanner(System.in);
        
        String name;
        
        
        System.out.printf("Enter the your name: ");
        
        name = input.nextLine();
        
        System.out.println("NAME: "+name);
        
        
    }
    
}
