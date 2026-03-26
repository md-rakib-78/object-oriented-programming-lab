package Random;

import java.util.Random;

public class RandomNumber {

    public static void main(String[] args) {

        Random in = new Random();

        int num;

        num = in.nextInt(500);

        System.out.println(num);

    }
}
