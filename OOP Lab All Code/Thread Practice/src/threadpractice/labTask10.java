package threadpractice;

import java.util.Random;
import java.util.Scanner;

class A extends Thread {

    int n, start, end;
    int[] arr = new int[200];

    boolean c;

    public A(int num, int arr[], int start, int end) {
        n = num;
        this.arr = arr;
        this.start = start;
        this.end = end;
    }

    @Override
    public void run() {

        boolean b = false;

        for (int i = start; i <= end; i++) {
            if (n == arr[i]) {
                b = true;
                break;

            }

        }

        if (b == true) {
            this.c = b;
        }

    }

}

public class labTask10 {

    public static void main(String[] args) {

        Random in = new Random();
        Scanner input = new Scanner(System.in);

        int N;
        System.out.print("Enter the number: ");
        N = input.nextInt();

        int[] arr = new int[200];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = in.nextInt(200);
        }

        A t1 = new A(N, arr, 0, 39);
        A t2 = new A(N, arr, 40, 79);
        A t3 = new A(N, arr, 80, 119);
        A t4 = new A(N, arr, 120, 139);
        A t5 = new A(N, arr, 140, 199);

        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();

        try {
            t1.join();
            t2.join();
            t3.join();
            t4.join();
            t5.join();
        } catch (Exception e) {

        }

        System.out.println("Found : " + t1.c);

    }

}
