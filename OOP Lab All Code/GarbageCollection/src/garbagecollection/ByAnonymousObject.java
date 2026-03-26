
package garbagecollection;

class Car extends Object
{
    public void finalize()
    {
        System.out.println("Destroy");
    }
}


public class ByAnonymousObject {
    
    public static void main(String[] args) {
        
    
    new Car();
    
    
    System.gc();
    }
    
}
