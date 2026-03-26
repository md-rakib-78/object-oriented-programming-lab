package exception;

import java.util.Scanner;

class AgeOutOfRangeException extends Exception {

    int age;

    AgeOutOfRangeException(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "You are older than the requested age (25years),you are " + age + " !!!";
    }
}

public class UserDefindException01 {

    public static void cheak(int age) throws AgeOutOfRangeException {
        if (age > 25) {
            throw new AgeOutOfRangeException(age);
        } else {
            System.out.println("Age is under range!!");
        }
    }

    public static void main(String[] args) throws AgeOutOfRangeException {
        Scanner input = new Scanner(System.in);

        int age;

        System.out.print("Enter your age: ");
        age = input.nextInt();

        try {
            cheak(age);
        } catch (AgeOutOfRangeException e) {
            System.out.println("Cought " + e);
        }

    }
}
