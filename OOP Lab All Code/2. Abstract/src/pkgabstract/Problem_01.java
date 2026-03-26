package pkgabstract;

abstract class Animal{
    
    abstract void sound();    
}


class Lion extends Animal{
    void sound()
    {
        System.out.println("The lion make sound!");
    }
    
}


class Tiger extends Animal{
    
    void sound()
    {
        System.out.println("The Tiger make sound!");
    }
    
    
}


public class Problem_01 {
    public static void main(String[] args) {
        
        Lion obj1 = new Lion();
        Tiger obj2= new Tiger();
        
        obj1.sound();
        obj2.sound();
        
    }
    
}
