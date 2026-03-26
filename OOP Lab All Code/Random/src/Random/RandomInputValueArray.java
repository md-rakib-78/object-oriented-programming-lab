package Random;

import java.util.Random;

public class RandomInputValueArray {

    public static void main(String[] args) {

        Random in = new Random();

        int[] num = new int[200];

        for (int i = 0; i < num.length; i++) {
            num[i] = in.nextInt(500);
        }

        for (int i = 0; i < num.length; i++) {
            System.out.println(num[i]);
        }

    }

}
