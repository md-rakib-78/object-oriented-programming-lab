package threadpractice;

import java.util.Scanner;

class table {

    public synchronized void rakib(int n) {
        for (int i = 1; i <= 10; i++) {
            System.out.println(n * i);

            try {
                Thread.sleep(1000);
            } catch (Exception e) {

            }
        }

    }
}

/// 1st thread
class Thread1 extends Thread {
    int n;
    table t;
    
    Thread1(table t, int n) {
        this.t = t;
        this.n = n;
    }

    public void run() {
        t.rakib(n);
    }
}

// Second thread
class Thread2 extends Thread {
    int n;
    table t;

    Thread2(table t, int n) {
        this.t = t;
        this.n = n;
    }

    public void run() {
        t.rakib(n);
    }
}

/// Main class
public class synchronizedMethod {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter 1st num: ");
        int n = input.nextInt();
        System.out.print("Enter 2nd num: ");
        int n1 = input.nextInt();

        table op = new table();

        Thread1 t1 = new Thread1(op, n);
        Thread2 t2 = new Thread2(op, n1);

        t1.start();
        t2.start();
    }
}
