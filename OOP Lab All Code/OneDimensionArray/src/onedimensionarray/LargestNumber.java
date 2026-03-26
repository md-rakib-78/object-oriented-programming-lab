
package onedimensionarray;
import java.util.Scanner;

public class LargestNumber {
    
        public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.printf("Enter the array size: ");
        int size=input.nextInt();
        
        int array[]=new int[size];
        
            for (int i = 0; i < size; i++) {
                
                System.out.printf("array[%d]",i);
                array[i]=input.nextInt();
                
            }
            
            int max;
            max=array[0];
            
            for (int i = 1; i < size; i++) {
                
                if(array[i]>max)
                {
                    max=array[i];
                }
                           
            }
            System.out.println("");
            System.out.println("Largest valu in array: "+max);
            
            
    }
    
}
