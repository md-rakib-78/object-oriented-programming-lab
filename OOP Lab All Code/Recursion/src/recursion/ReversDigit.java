
package recursion;
import java.util.Scanner;

class revers{
    
    int rem;
    
    int rev(int n)
    {
        if(n==0)
        {
            System.out.println();
            return 0;
        }
        else
        {
           rem=n%10;
            System.out.print(rem);
            rev(n/10);
        }
        
        return 0;
    }
    
    
    
}



public class ReversDigit {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.printf("Enter the digit: ");
        int num=input.nextInt();
        
       revers obj =new revers();
       
       obj.rev(num);
        
        
        
    }
    
    
    
}
