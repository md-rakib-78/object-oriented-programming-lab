package garbagecollection;

class Car extends Object {

    public void finalize() {
        System.out.println("Destroy");
    }
}

public class ByAssigningReffearenceToAnother {

    public static void main(String[] args) {

        Car a = new Car();
        Car b = new Car();
        a = b;

        System.gc();
    }

}
