package exception;

import java.util.Scanner;

class AgeOutOfRangeException extends Exception {

}

class LowGpaExceptions extends Exception {

}

public class Main {

    public static void main(String[] args) throws AgeOutOfRangeException, LowGpaExceptions {
        Scanner input = new Scanner(System.in);

        int age;
        float gpa;

        System.out.print("Enter your Age: ");
        age = input.nextInt();
        System.out.print("Enter your Gpa: ");
        gpa = input.nextFloat();

        try {
            if (age > 25) {
                throw new AgeOutOfRangeException();
            }
        } catch (AgeOutOfRangeException a) {
            System.out.println("Cought " + a);
        }

        try {

            if (gpa < 2.5) {
                throw new LowGpaExceptions();
            }

        } catch (LowGpaExceptions l) {
            System.out.println("Cought " + l);
        }
        if (age <= 25 && gpa >= 2.5) {
            System.out.println("Your application is accepted and is under study");
        }

    }

}
