/*

Create a main class named GPA to prompt the user to enter his/her age and his GPA. The user application
for a job will be rejected either if his age is greater than 25 years or his GPA is less than 2.5. You should
declare two try-throw-catch blocks; one to handle the AgeOutOfRangeException and the other to handle
the LowGpaException. If the user enters acceptable age and GPA, display the message "Your application
is accepted and is under study".

 */
package exception;

import java.util.Scanner;

class AgeOutOfRangeException extends Exception {

    AgeOutOfRangeException() {
        //System.out.println("Exception: AgeOutOfRangeException");
    }
}

class LowGpaException extends Exception {

    LowGpaException() {
        //System.out.println("Exception: LowGpaException");
    }
}

public class UserDefindException03 {

    static void cheakAge(int age) throws AgeOutOfRangeException {
        if (age > 25) {
            throw new AgeOutOfRangeException();
        }
    }

    static void cheakGpa(float gpa) throws LowGpaException {
        if (gpa < 2.5) {
            throw new LowGpaException();
        } else {
            System.out.println("Your application is accepted and is under study");
        }
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int age;
        float gpa;

        System.out.print("Enter your Age: ");
        age = input.nextInt();
        System.out.print("Enter your Gpa: ");
        gpa = input.nextFloat();

        try {
            cheakAge(age);
        } catch (AgeOutOfRangeException a) {
            System.out.println("Cought " + a);
        }

        try {
            cheakGpa(gpa);
        } catch (LowGpaException l) {
            System.out.println("Cought " + l);
        }

    }

}
