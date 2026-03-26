
package inputdemo;

import java.util.Scanner;
public class LeapYear {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int year;
        
        System.out.print("Enter the year: ");
        
        year = input.nextInt();
        
        if(year%400 == 0 || year%100 != 0 && year%4 == 0)
        {
            System.out.printf("%d is leap year\n",year);
        }
        else
        {
            System.out.printf("%d this year is not leap year!!!!\n",year);
        }
    }
    
}
