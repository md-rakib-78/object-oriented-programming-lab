
package threadpractice;



class A extends Thread
{


    @Override
    public void run()
    {
        int i=0;
        try{
            
        while(true)
        {
            System.out.println(i);
            i+=2;
            Thread.sleep(500);
        }
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
}




public class ByExtendingThreadCreating {
    
    public static void main(String[] args) {
        
        A t = new A();

      t.start();
        
        try
            {
                
                 while(true)
                {
                    System.out.println("Rakib");
                    Thread.sleep(500);
                }
              
            }
        catch(Exception a)
        {
            System.out.println(a);
        }
        
        
        
    }
    
    
    
    
}
