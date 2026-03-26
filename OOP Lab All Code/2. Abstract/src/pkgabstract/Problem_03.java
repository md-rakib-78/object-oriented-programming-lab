package pkgabstract;

class Vheicle {

    void drive() {
        System.out.println("Drive a vheicle");
    }
}

class Car extends Vheicle {

    void drive() {
        System.out.println("Drive a car");
    }

}

class Bike extends Car {

    void drive() {
        System.out.println("Drive a bike");
    }

}

public class Problem_03 {

    public static void main(String[] args) {

        Vheicle car = new Car();
        car.drive();

        Car bike = new Bike();
        bike.drive();

    }

}
