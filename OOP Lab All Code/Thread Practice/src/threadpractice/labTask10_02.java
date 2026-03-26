package threadpractice;

import java.util.Scanner;

class A extends Thread {

    int id;
    int s;
    int e;

    public A(int id, int s, int e) {
        this.id = id;
        this.s = s;
        this.e = e;
    }

    public void run() {
        for (int i = s; i <= e; i++) {
            if (primeTest(i) == true) {
                System.out.println("Thread " + this.id + " Generate " + i);
                try {
                    sleep(1000);
                } catch (Exception e) {
                    System.out.println(e);
                }
            }

        }

    }

    public boolean primeTest(int n) {
        if (n == 1 || n == 0) {
            return false;
        } else {
            for (int i = 2; i <= n / 2; i++) {
                if (n % 2 == 0) {
                    return false;
                }
            }
            return true;
        }

    }

}

public class labTask10_02 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int N, M;

        System.out.print("Enter the maximum value: ");
        M = input.nextInt();
        System.out.print("Enter the Number of thread: ");
        N = input.nextInt();

        int s = 0;

        int rs;

        rs = M / N;

        for (int i = 1; i <= N; i++) {

            A th = new A(s + 1, s, s + rs);

            s = s + rs;

            th.start();

        }

    }

}
