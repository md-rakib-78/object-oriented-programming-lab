
package stringp;
import java.util.Scanner;

public class QuestionSolve {

    public static void main(String[] args) {
        
    
    Scanner input = new Scanner(System.in);
    
    String str = "mdrakib@gmail.cse.edu.bd";
    
    String dept;
    
    System.out.printf("Enter the depertment name: ");
    dept=input.nextLine();
    
    
    if(str.contains(dept))
    {
        String str2=str.replace(dept,"EEE");
        System.out.println(str2);
    }
    else
    {
        System.out.println("Does not match depertment !!!!");
    }
    
    
    
    
    
    }
    
}
