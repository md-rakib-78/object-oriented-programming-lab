package constructorandoverloading;

import java.util.Scanner;

///First Class
class demo {
    
      demo()
    {
        
        System.out.println("No value is assign");
   
    } 
    
    demo(String x,int y)
    {
        System.out.println("Name: "+x);
        System.out.println("Id:  "+y);
    }
    
        demo(String x)
    {
        System.out.println("Name: "+x);
  
    }

}

public class ConstructorAndOverloading {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String name, email;
        int id;
        System.out.print("Enter the Name: ");
        name=input.nextLine();
        System.out.print("Enter the id: ");
       id=input.nextInt();
       
       input.nextLine();
        System.out.print("Enter the email: ");    
        email=input.nextLine(); 
        
        System.out.println();
        System.out.println();
        
       
          
          demo obj1=new demo(name,id);
          demo obj2=new demo(email);
          demo obj3=new demo();
          
        

    }

}
        
