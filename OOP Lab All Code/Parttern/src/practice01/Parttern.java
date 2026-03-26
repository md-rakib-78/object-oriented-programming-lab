
package practice01;
import java.util.Scanner;
public class Parttern {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        for (int i=0; i<=5;i++) {
            
            for (int j=0; j<=5; j--) { 
                
                if(i==0 || i+j==5 || i==j)
                {
                    System.out.print(" *");
                }
                else
                System.out.print(" ");
                
                }
            
            System.out.printf("\n");
                }
            
            }
            
            
        }
        
    
 

