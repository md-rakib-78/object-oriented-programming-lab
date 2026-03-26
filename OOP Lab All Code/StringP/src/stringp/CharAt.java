package stringp;
//import java.util.Scanner;

 class AgeOutOfRange extends Exception
{

    public void toString(String msg)
    {
        System.out.println(msg);
    }
   
}

 class love
{
    public static void cheaked(int age) throws AgeOutOfRange
    {
        if(age>25)
        {
        throw new AgeOutOfRange();
        }

    }
   
    
    
}


public class CharAt {
    public static void main(String[] args) {
        
   
       try{
               love.cheaked(24);
               System.out.println("Accepted");
       }
       catch(Exception a)
       {
                 System.out.println(a);
       }
       
}
}