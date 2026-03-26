
package exception;

class InvalidException extends Exception
{
    InvalidException(String msg)
    {
        System.out.println(msg);
    }
}



public class throwException {
    
    public static void main(String[] args)throws InvalidException
    {
        int b=0;
        
        if(b==0)
        {
            throw new InvalidException("Invalid value");
        }
        
        
        
    }
    
    
    
    
}
