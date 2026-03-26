package stringcode;

import java.util.Scanner;

public class PalindromString {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String str;

        System.out.printf("Enter the String: ");

        str = input.nextLine();

        // shifting string to array
        char[] array = str.toCharArray();
        System.out.println();

        char[] array2 = new char[array.length];

        int j = 0;

        for (int i = array.length - 1; i >= 0; i--) {

            array2[j] = array[i];
            j++;
        }

        int count = 0;
        for (int i = 0; i < array.length; i++) {

            if (array[i] == array2[i]) {
                count++;
            }

        }

        System.out.println();
        if (count == array.length) {
            System.out.println("Its palindrom!");
        } else {
            System.out.println("Its not palindrom");
        }

        System.out.println();

    }

}
