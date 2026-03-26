
package stringcode;
import java.util.Scanner;

class axcess{
    
   String name;
    void Display(String n)
    {
        System.out.println();
        System.out.println();
        System.out.println(n);
    }

            
    
}

public class InputString {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        
       axcess obj1=new axcess();
        
       
        obj1.name=input.nextLine();
        obj1.Display(obj1.name);
                    
    }
}
