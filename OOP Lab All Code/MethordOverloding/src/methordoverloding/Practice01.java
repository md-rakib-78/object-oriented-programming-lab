
package methordoverloding;
import java.util.Scanner;

//FIRST CLASS
class demo{
    
    String name,email;
    int id;
  
    
    void display(String n)
    {
        System.out.println("Name : "+n);
        System.out.println();
        System.out.println();
    }
    
    
    void display(String x,int y)
    {
        System.out.println("Name : "+x);
        System.out.println("ID   : "+y);
        System.out.println();
        System.out.println();
    }
    
    
    
    void display(String x,int y,String z)
    {
        
        System.out.println("Name : "+x);
        System.out.println("ID   : "+y);
        System.out.println("Email: "+z);
        System.out.println();
        System.out.println();
        
    }
    
    
}

/// Main Method
public class Practice01 {
    public static void main(String[] args)
    {
        Scanner input=new Scanner(System.in);
        
        demo in=new demo();
        
        System.out.printf("Enter the name: ");
        in.name=input.nextLine();
        
        System.out.printf("Enter The id: ");
        in.id=input.nextInt();
        
        input.nextLine();
        
        System.out.printf("Enter The email: ");
        in.email=input.nextLine();
        
        
        System.out.println();
        System.out.println();
        
        in.display(in.name,in.id,in.email);
        in.display(in.name);
        in.display(in.name,in.id);
        
        
        
        
    }
    
}
