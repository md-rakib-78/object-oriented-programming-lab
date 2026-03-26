package threadpractice;

import java.util.Random;
import java.util.Scanner;

class too {

    private boolean p = false;

    public synchronized void cheak(int n, int s, int e, int a[]) {

        for (int i = s; i <= e; i++) {
            if (n == a[i]) {

                p = true;

                // System.out.println("Found value>>>>>>>>>>>>>>>>>");
            } else {
                p = false;
            }

        }

    }

    public boolean getP() {
        return p;
    }

}

class Thread0 extends Thread {

    int n, start, end;
    int[] arr = new int[200];

    too t;

    Thread0(too t, int num, int arr[], int start, int end) {

        this.t = t;
        n = num;
        this.arr = arr;
        this.start = start;
        this.end = end;
    }

    @Override
    public void run() {

        t.cheak(n, start, end, arr);

    }

}

class Thread10 extends Thread {

    int n, start, end;
    int[] arr = new int[200];

    too t;

    Thread10(too t, int num, int arr[], int start, int end) {

        this.t = t;
        n = num;
        this.arr = arr;
        this.start = start;
        this.end = end;
    }

    @Override
    public void run() {

        t.cheak(n, start, end, arr);

    }

}

class hugamara {

    public static void main(String[] args) {

        Scanner inp = new Scanner(System.in);

        Random in = new Random();

        System.out.print("Enter your search number: ");
        int n = inp.nextInt();

        int[] arr = new int[200];

        for (int i = 0; i < 200; i++) {
            arr[i] = in.nextInt(250);
        }

        too op = new too();

        Thread0 t1 = new Thread0(op, n, arr, 0, 99);
        Thread10 t2 = new Thread10(op, n, arr, 100, 199);

        t1.start();
        t2.start();
        
        
        System.out.println(op.getP());

    }

}
