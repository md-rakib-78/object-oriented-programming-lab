
package arraylist;

import java.util.ArrayList;
import java.util.Scanner;


class A
{
    
    public void print(ArrayList a)
    {
        for(Object x: a)
        {
            
            System.out.print(" "+x+" ");
            
            
        }
        
    }
    
    
    
}




public class NewClass {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter value in arrayList: ");
        int n;
        
        ArrayList<Integer> arr = new ArrayList<>();
        
        for(int i=0;i<10;i++)
        {
            n = input.nextInt();
            arr.add(n);
            
        }
        
        System.out.println();
        
A op = new A();

op.print(arr);
        
        
        
    }
    
    
}
