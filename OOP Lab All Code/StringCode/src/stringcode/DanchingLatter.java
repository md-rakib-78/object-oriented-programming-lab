
package stringcode;
import java.util.Scanner;
public class DanchingLatter {   
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        
        String str;
        System.out.print("Enter your name: ");
        str = in.nextLine();
        
        char arr[]=str.toCharArray();
        
        int count=0;
        
        for(int i=0;i<str.length();i++)
        {
            if(count%2==0 && arr[i]!=32)
            {
                System.out.print(Character.toUpperCase(arr[i]));
                count++;
            }
            else if(arr[i]!=32)
            {
                System.out.print(Character.toLowerCase(arr[i]));
                count++;
            }
            else
            {
                System.out.print(arr[i]);
            }
        }
        System.out.println();
    }
    
}
