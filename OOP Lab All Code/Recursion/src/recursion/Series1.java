package recursion;

import java.util.Scanner;

class so {

    int sum = 0;
    int j = 1;

    void series(int n1, int n2) {
        if (n1 > n2)
        {
            System.out.println(sum);
        }
        else {
            sum = sum + j;
            j = (j * 10) + 1;

            series(n1 + 1, n2);

        }
    }

}

public class Series1 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        so obj = new so();

        System.out.printf("Enter the num: ");

        int num1 = 1;
        int num2 = input.nextInt();
        obj.series(num1, num2);

    }

}
