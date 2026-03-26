
package garbagecollection;

class Car extends Object
{
    public void finalize()
    {
        System.out.println("Destroy");
    }
}


public class ByNullingTheRefference {
    
    public static void main(String[] args) {
        
    
    Car a = new Car();
    a = null;
    
    System.gc();
    }
    
}
