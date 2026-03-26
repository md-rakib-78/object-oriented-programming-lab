package exception;

import java.util.Scanner;

class LowGpaException extends Exception {

    LowGpaException() {
        System.out.println("Your gpa is not sufficient to apply for this job (2.5)");
    }
}

public class UserDefindException02 {

    static void cheak(float gpa) throws LowGpaException {
        if (gpa < 2.6) {
            throw new LowGpaException();
        } else {
            System.out.println("You are sufficiant for apply this job!!");
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        float gpa;
        System.out.print("Enter your Gpa: ");
        gpa = input.nextFloat();

        try {
            cheak(gpa);
        } catch (LowGpaException a) {
            System.out.println("Cougth " + a);
        }

    }

}
