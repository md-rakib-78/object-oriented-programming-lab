
package inheritancebasic;
import java.util.Scanner;

///First Class
class rakib{
    
    String name,email;
    int id;
    float gpa;
    
    
    
    
}

class jeny extends rakib{
    
    String qualification;
    
    void display()
    {
        System.out.println();
        System.out.println("Name: "+name);
        System.out.println("ID: "+id);
        System.out.println("Gpa: "+gpa);
        System.out.println("Gpa: "+qualification);
        System.out.println();
    }
    
    
}




public class FirstCreateInheritance {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); 
        
        jeny obj1=new jeny();
        
        System.out.print("Enter the Name: ");
        obj1.name=input.nextLine();
        
        System.out.print("Enter the Id: ");
        obj1.id=input.nextInt();
        
        input.nextLine();
        
        System.out.print("Enter the Gpa: ");
        obj1.gpa=input.nextFloat();
        
        input.nextLine();
        
        
        System.out.print("Enter the Qualification: ");
        obj1.qualification=input.nextLine();
        
        obj1.display();
        
        
        
        
    }
    
}
